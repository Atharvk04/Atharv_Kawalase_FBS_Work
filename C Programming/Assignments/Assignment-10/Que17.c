//strlwr()

#include<stdio.h>
#include<string.h>

void main()
{
	char str[20] = "ATHARV";
	strlwr(str);
	
	printf("Lowercase String: %s", str);
}