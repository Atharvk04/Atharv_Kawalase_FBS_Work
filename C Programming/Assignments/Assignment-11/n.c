#include<stdio.h>
#include<string.h>

void findString(char*, char*, int);

void main()
{
	char str1[50] = "The first chapter is Tokens.";
	char str2[20] = "is";
	int n;
	
	printf("Enter a number of characters to search: ");
	scanf("%d",&n);
	
	findString(str1,str2,n);
}

void findString(char* str1, char* str2, int n)
{
	int len2 = strlen(str2);

    for (int i = 0; i <= n - len2 && str1[i] != '\0'; i++)
    {
        int j = 0;
        while (j < len2 && str1[i + j] == str2[j])
            j++;

        if (j == len2)
        {
            printf("Substring found at position: %d\n", i + 1);
            return;
        }
    }

    printf("Substring not found within first %d characters.\n", n);
}