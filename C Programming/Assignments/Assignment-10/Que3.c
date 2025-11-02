//strncpy()

#include<stdio.h>
#include<string.h>

void main ()
{
	char src [] = "Hi. How are you?";
	char dest[20];
	strncpy(dest, src, 10);
	dest [10] = '\0';
	printf("Copied string is: %s",dest);
}