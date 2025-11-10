#include<stdio.h>

int countWords(char* );

void main()
{
	char str[50] = "Good morning. Have a nice day.";
	
	int wordCount = countWords(str);
	
	printf("Final String is: %d",wordCount);
}

int countWords(char* str)
{
	int i = 0, count = 0;
	
	while(str[i] != '\0')
	{
		if ((str[i] == ' ' && str[i + 1] != ' ' && str[i + 1] != '\0'))
        {
            count++;
        }
        i++;
	}
	if (i > 0)
        count++;
        
    return count;
}