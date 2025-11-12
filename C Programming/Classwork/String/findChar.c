#include<stdio.h>

int findChar(char*, char*);

void main()
{
	char str[50], ch;
	
	printf("Enter first name: ");
	gets(str);
	
	printf("Enter char you want to search: ");
	scanf("%c",&ch);
	
	int res=findChar(str,&ch);
	
	if(res == 1)
		printf("found");
		
	else if(res == 2)
		printf("not found");
	
}

int findChar(char* str, char* ch)
{
	int i=0;
	
	while(str[i] != '\0')
	{
		if(str[i] == *ch)
			return 1;
		
	 	i++;
	}
	
	
	return 2;
}