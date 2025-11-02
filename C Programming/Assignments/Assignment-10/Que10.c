//strstr()

#include<stdio.h>
#include<string.h>

void main()
{
	char str1[50] = "The first chapter is tokens";
	char str2[20] = "is";
	
	char *ptr = strstr(str1, str2);
	
	if(ptr)
		printf("Substring found at position: %ld", ptr - str1 + 1);
		
	else
		printf("Substring not found.");
}