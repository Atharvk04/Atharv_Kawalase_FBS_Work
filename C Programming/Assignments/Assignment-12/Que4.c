#include<stdio.h>

char* exchangeFirstLast(char*);
void main()
{
	char str [20]= "atharv";
	
	char* finalStr = exchangeFirstLast(str);
	
	printf("Final string is: %s",finalStr);
}
char* exchangeFirstLast(char* str)
{
	int i = 0;
	char temp;
	
	while(str[i] != '\0')
	{
		i++;
	}
	temp = str[0];
	str[0] = str [ i-1];
	str[i-1] = temp;
	
	return str;
}