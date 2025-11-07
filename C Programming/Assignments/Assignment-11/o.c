#include<stdio.h>
#include<string.h>

void mystrncat(char*, char*, int);

void main()
{
	char str1[20] = "Hello";
	char str2[20] = "World";
	
	mystrncat(str1, str2, 3);
	printf("Appended string is: %s",str1);
	
}
void mystrncat(char *str1, char *str2, int n)
{
    int i, j;

    i = strlen(str1);

    for (j = 0; j < n && str2[j] != '\0'; j++)
    {
        str1[i + j] = str2[j];
    }

    str1[i + j] = '\0';
}