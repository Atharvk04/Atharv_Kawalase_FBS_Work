//strtok()

#include<stdio.h>
#include<string.h>

void main()
{
	char str[50] = "apple, banana, watermelon";
	char *token = strtok(str,",");
	
	while(token != NULL)
	{
		printf("%s\n",token);
		token = strtok(NULL, ",");	
	}
}