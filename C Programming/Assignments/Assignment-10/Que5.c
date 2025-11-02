//strncat()

#include<stdio.h>
#include<string.h>

void main ()
{
	char str1[15] = "Good";
	char str2[15] = "Morning";
	
	strncat(str1, str2, 7);
	
	printf("Combined string is: %s",str1);
}