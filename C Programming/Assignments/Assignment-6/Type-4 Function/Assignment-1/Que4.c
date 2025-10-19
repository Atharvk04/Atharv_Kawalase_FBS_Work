#include<stdio.h>

char vowelOrConsonant(char ch);

void main()
{
	char c, result;
	
	printf("Enter a character: ");
	scanf("%c",&c);
	
	result = vowelOrConsonant(c);
	
	if(result == 0)
		printf("Character is Vowel.");
		
	else
		printf("Character is Consonant.");
		
}

char vowelOrConsonant(char ch)
{
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )
		
			return 0;
		   
	else 
			return 1;
}