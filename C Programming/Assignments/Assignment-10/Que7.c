//strncmp()

#include<stdio.h>
#include<string.h>

void main()
{
	char str1[50]= "abcd";
	char str2[50]= "abrs";
	
	int result = strncmp(str1, str2,2);
	
	if(result == 0)
		printf("first two characters are same.");
		
	else
		printf("First two characters are different.");
	
}