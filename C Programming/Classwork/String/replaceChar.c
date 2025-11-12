#include<stdio.h>

char* replaceChar(char* ); 
void main()
{
	char str[10]="aadesh";
	
	char* finalstr= replaceChar(str);
	
	printf("Final string= %s",finalstr);
}

char* replaceChar(char* str)
{
	int i=0;
	
	while(str[i] != '\0')
	{
		if(str[i] == 'a')
		{
			str[i] = '$';
		}
		i++;
	}
	return str;
}
