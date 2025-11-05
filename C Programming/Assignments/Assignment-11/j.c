#include<stdio.h>
#include<string.h>

void compareStrings(char* , char*);

void main()
{
	char str1[20] = "Hello ";
	char str2[20] = "hello";
	
	compareStrings(str1, str2);
}

void compareStrings(char* str1, char* str2)
{
	int res = strcasecmp(str1, str2);
	
	if(res == 0)
		printf("Strings are equal.");
		
	else if(res > 0)
		printf("String 1 is bigger.");
		
	else
		printf("String 1 is smaller.");
}