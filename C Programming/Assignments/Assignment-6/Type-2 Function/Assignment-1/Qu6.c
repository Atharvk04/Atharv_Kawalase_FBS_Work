#include<stdio.h>

char upperOrLower();

void main ()
{
	char result;
	
	result = upperOrLower();
	
	if(result == 0)
		printf("Character is Uppercase");
	else
		printf("Character is Lowercase");
}

char upperOrLower()
{
	char ch;
	
	printf("Enter a Character: ");
	scanf("%c",&ch);
	
	if (ch >= 'A' && ch <= 'Z')
	
		return 0;
	
	else
	
		return 1;
}