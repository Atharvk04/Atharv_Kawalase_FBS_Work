#include<stdio.h>
#include<string.h>

void strappend(char *str1, char *str2);

void main()
{
	char str1[20] = "Hello";
	char str2[20] = "World";
	
	strappend(str1,str2);
	
	printf("Appended string is: %s",str1);
}
void strappend(char *str1, char *str2)
{
	int i, j;
	
	i = strlen(str1);
	
	for (j=0; str2[j] != '\0' ;j++)
	{
		str1[i+j] = str2[j];
	}
	
	str1[i+j] = '\0';
}
