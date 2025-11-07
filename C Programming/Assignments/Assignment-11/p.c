#include<stdio.h>
#include<string.h>

int mystrncasecmp(char*, char*);

void main()
{
	char str1[20] = "Hello";
	char str2[20] = "helloworld";
	
	int res = mystrncasecmp(str1, str2);
	
	if(res == 0)
		printf("Strings are equal.");
		
	else if(res > 0)
		printf("String 1 is bigger.");
		
	else
		printf("String 1 is smaller.");
}

int mystrncasecmp(char *str1, char *str2)
{
    int i = 0;
    char c1, c2;

    while(str1[i] != '\0' && str2[i] != '\0')
    {
        c1 = str1[i];
        c2 = str2[i];

        if(c1 >= 'A' && c1 <= 'Z')
            c1 = c1 + 32;
        if(c2 >= 'A' && c2 <= 'Z')
            c2 = c2 + 32;

        if(c1 != c2)
            return c1 - c2;

        i++;
    }

    if(str1[i] == str2[i])
        return 0;
    else if(str1[i] == '\0')
        return -1;
    else
        return 1;
}