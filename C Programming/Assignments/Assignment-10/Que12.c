//strspn()

#include<stdio.h>
#include<string.h>

void main()
{
	char str1 [50] = "abcde123";
	char str2 [20] = "abc";
	
	int len = strspn(str1, str2);
	
	printf("Length of initial segment containing only 'abcde' = %d",len);
}