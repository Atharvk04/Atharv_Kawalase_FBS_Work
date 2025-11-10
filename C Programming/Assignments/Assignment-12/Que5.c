#include <stdio.h>

int countVowels(char*);

void main()
{
    char str[20] = "atharv";
    int vowelsCount = countVowels(str);
    
    printf("Number of vowels: %d", vowelsCount);
}

int countVowels(char* str)
{
    int i = 0, count = 0;
    while (str[i] != '\0')
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || 
            str[i] == 'o' || str[i] == 'u' || 
            str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || 
            str[i] == 'O' || str[i] == 'U')
        {
            count++;
        }
        i++;
    }
    return count;
}
