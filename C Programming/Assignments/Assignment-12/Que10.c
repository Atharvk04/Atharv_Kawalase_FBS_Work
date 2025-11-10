#include<stdio.h>

int isPallindrome(char* );

void main()
{
	char str[50] = "madam";
	
	int result = isPallindrome(str);
	
	if (result == 1)
        printf("The string is a palindrome.");
    else
        printf("The string is not a palindrome.");
}
int isPallindrome(char* str)
{
	int i = 0, j = 0;
    
    while (str[j] != '\0')
    {
        j++;
    }
    j--; 
    
    while (i < j)
    {
        if (str[i] != str[j])
            return 0; 
        
        i++;
        j--;
    }
    
    return 1;
}