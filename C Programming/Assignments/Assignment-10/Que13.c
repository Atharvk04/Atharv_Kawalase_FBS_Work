//strcspn()

#include<stdio.h>
#include<string.h>

void main()
{
	char str1 [50] = "laboratory";
	char str2 [20] = "ao";
	
	int len = strcspn(str1, str2);
	
	printf("First matching character appears after %d characters", len);
	
}