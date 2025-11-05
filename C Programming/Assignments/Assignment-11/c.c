//mystrcmp()

#include<stdio.h>
#include<string.h>

void mystrcmp(char* str1, char* str2);
void main()
{
	char str1[20];
	char str2[20];
	
	printf("Enter a first string: ");
	gets(str1);
	
	printf("Enter a second string: ");
	gets(str2);
	
	mystrcmp(str1,str2);	
}
void mystrcmp(char* str1, char* str2)
{
	int i = 0;
	
	while(str1[i] == str2[i])
	{
		if(str1[i]== '\0')
		{
			printf("Strings are same.");
			return;
		}
		i++;
	}
	
	if(str1[i] < str2[i])
		printf("First string is smaller.");
	
	else
		printf("First string is greater.");
}