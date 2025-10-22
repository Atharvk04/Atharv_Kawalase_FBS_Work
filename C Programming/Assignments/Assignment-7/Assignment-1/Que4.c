#include<stdio.h>

void vowelOrConsonant(char *ch);

void main ()
{
	char a;
	
	printf("Enter a Character: ");
	scanf("%c",&a);
	
	vowelOrConsonant(&a);
}

void vowelOrConsonant(char *ch)
{
	if (*ch == 'a' || *ch == 'e' || *ch == 'i' || *ch == 'o' || *ch == 'u' ||
		*ch == 'A' || *ch == 'E' || *ch == 'I' || *ch == 'O' || *ch == 'U' )
		
			printf("Character is Vowel.");
		   
	else 
			printf("Character is Consonant.");
}