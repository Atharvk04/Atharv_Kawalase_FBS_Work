#include<stdio.h>
#include<string.h>

void stringCompare(char*, char*, int);

void main()
{
	char str1[20];
	char str2[20];
	int n;
	
	printf("Enter a first string: ");
	gets(str1);
	
	printf("Enter a second string: ");
	gets(str2);
	
	printf("Enter number of characters to compare: ");
	scanf("%c",&n);
	
	stringCompare(str1,str2,n);
}

void stringCompare(char* str1, char* str2, int n)
{
		int i = 0;
	
	while(i < n && str1[i] == str2[i])
	{
		if(str1[i]== '\0')
		{
			printf("Strings are same.");
			return;
		}
		i++;
	}
	if(i = n)
		printf("Strings are same.");
	
	else if(str1[i] < str2[i])
		printf("First string is smaller.");
	
	else
		printf("First string is greater.");
}