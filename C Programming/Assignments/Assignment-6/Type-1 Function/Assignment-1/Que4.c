//Write a program to check whether a given character is a vowel or consonant using Function.

#include<stdio.h>

void character();
void main()
{
	character();
}
void character()
{
	char ch;
	
	printf("Please enter the character: ");
	scanf("%c",&ch);
 	
 	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	    ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )
	   {
	   		printf("Character is Vowel");
	   }
	   else 
	   {
	   		printf("Character is Consonant");
	   }
}