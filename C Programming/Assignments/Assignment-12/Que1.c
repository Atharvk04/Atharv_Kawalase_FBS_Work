#include<stdio.h>

void main()
{
	char str[50], ch;
	
	printf("Enter first name: ");
	gets(str);
	
	printf("Enter char you want to search: ");
	scanf("%c",&ch);
	
	int i=0;
	
	while(str[i] != '\0')
	{
		if(str[i] == ch)
		{
			printf("Found");
			return ;
		}
		
	 	i++;
	}
	
	
	printf("Not found.");
}