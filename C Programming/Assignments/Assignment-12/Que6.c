#include<stdio.h>

char* replaceSpace(char*);

void main()
{
	char str[100] = "Welcome to FirstBit Solutions.";
	
	replaceSpace(str);
	
	printf("Final string are: %s",str);
}

char* replaceSpace(char* str)
{
	int i=0;
	
	while(str[i] != '\0')
	{
		if(str[i] == ' ')
		{
			str[i] = '*';
		}
		
		i++;
	}
}