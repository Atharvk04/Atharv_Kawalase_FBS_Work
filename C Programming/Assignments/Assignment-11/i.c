#include<stdio.h>
#include<string.h>

void findSubstring(char*, char*);

void main()
{
	char str1[50] = "The first chapter is tokens";
	char str2[20] = "is";
	
	findSubstring(str1, str2);
}
void findSubstring(char* str1, char* str2)
{
	char *ptr = strstr(str1, str2);
	
	if(ptr)
		printf("Substring found at position: %ld", ptr - str1 + 1);
		
	else
		printf("Substring not found.");
}