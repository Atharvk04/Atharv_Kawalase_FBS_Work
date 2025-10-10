//Write a program to check whether a given character is uppercase or lowercase using Function.

#include<stdio.h>

void upperlower();
void main()
{
	upperlower();
}
void upperlower()
{
	char ch;
	
	printf("Enter the Character: ");
	scanf("%c",&ch);
	
	if (ch >= 'A' && ch <= 'Z')
	{
		printf("Character is Uppercase");
	}
	else
	{
		printf("Character is LowerCase");
	}
}