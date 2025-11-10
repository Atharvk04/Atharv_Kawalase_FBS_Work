#include<stdio.h>

char* largerString(char*, char*);

void main()
{
	char str1[20] = "Welcome";
	char str2[50] = "FirstBit Solutions";
	
	char* result = largerString(str1, str2);
	
	printf("Larger String is: %s",result);
}

char* largerString(char* str1, char* str2)
{
	int i = 0, len1 = 0, len2 = 0;
	
	while(str1[i] != '\0')
	{
		len1++;
		i++;
	}
	
	i = 0;
	
	while(str2[i] != '\0')
	{
		len2++;
		i++;
	}
	
	if (len1 > len2)
        return str1;
    else
        return str2;

}