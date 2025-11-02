//strpbrk()

#include<stdio.h>
#include<string.h>

void main()
{
	char str1[10] = "apple";
	char str2[5] = "ea";
	
	char *ptr = strpbrk(str1, str2);
	
	if(ptr)
		printf("First matching character found at position: %ld", ptr - str1 + 1);
		
	else
		printf("No matching character found.");
}