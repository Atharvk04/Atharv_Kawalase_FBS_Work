#include<stdio.h>
#include<string.h>

void findLastCharacter(char*, char);
void main()
{
	char str[50] = "Hello World";
	char ch = 'o';
	
	findLastCharacter(str, ch);
}
void findLastCharacter(char* str, char ch)
{
    char *ptr = strrchr(str, ch);
    
    if(ptr)
        printf("Last '%c' found at position = %ld", ch, ptr - str + 1);
    else
        printf("Character '%c' not found.", ch);
}