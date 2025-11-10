#include<stdio.h>

char* removeChar(char*, int );
void main()
{
	char str[20] = "Hello World";
	
	int n = 4;
	
	char *finalStr = removeChar(str,n);
	
	printf("Final string is: %s",finalStr);
}
char* removeChar(char* str, int n)
{
	int i = 0;
	
	while (str[i] != '\0')
	{
		if (i > n)
		{
			str[i] = str [i + 1];
		}
		i++;
	}
	return str;
}