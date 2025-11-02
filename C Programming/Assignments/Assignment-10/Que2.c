//strcpy()

#include<stdio.h>
#include<string.h>

void main ()
{
	char src[]="C programming";
	char dest[15];
	
	strcpy(dest, src);
	printf("Copied string is: %s",dest);
}