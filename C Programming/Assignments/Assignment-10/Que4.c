//strcat()

#include<stdio.h>
#include<string.h>

void main ()
{
	char str1[10] = "Hello";
	char str2[10] = "World";
	
	strcat(str1, str2);
	
	printf("Combined string is: %s",str1);
}