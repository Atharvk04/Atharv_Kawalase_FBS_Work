#include<stdio.h>

char vowelOrConsonant();

void main()
{
	char result;
	
	result = vowelOrConsonant();
	
	if(result == 0)
		printf("Character is Vowel");
	else
		printf("Chaarcter is Consonant");
}
char vowelOrConsonant()
{
	char ch;
	
	printf("Enter a Character: ");
	scanf("%c",&ch);
	
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	    ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )
	   
	   		return 0;
	   
	   else 
	   		return 1;
}