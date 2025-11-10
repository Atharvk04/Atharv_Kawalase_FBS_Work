#include<stdio.h>

char* removeOddIndex(char* );

void main()
{
	char str[10]="Welcome";
	
	removeOddIndex(str);
	
	printf("Final String is: %s",str);
}
char* removeOddIndex(char* str)
{
	int i = 0, j = 0;
	
	while(str[i] != '\0')
	{
		if(i % 2 == 0)
		{
			str[j] = str [i];
			j++;
		}
		i++;
	}
	
	str[j] = '\0';
}