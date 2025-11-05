#include<stdio.h>
#include<string.h>
void copystr(char* , char*);

void main ()
{
	char src[20];
	char dest[25];
	
	printf("Enter a String: ");
	gets(src);
	
	copystr(dest,src);
	
	printf("Copied string is: %s",dest);
}

void copystr(char* dest, char* src)
{
	int i=0;
	
	while(src[i] != '\0')
	{
		dest [i] = src [i];
		
		i++;
	}
}