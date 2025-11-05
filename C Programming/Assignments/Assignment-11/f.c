#include<stdio.h>
#include<string.h>

void strupper(char* );
void main()
{
	char str[20] = "Helloworld";
	
	strupper(str);
	
	printf("Uppercase string is: %s",str);
	
}
void strupper(char* str)
{
	int i;
	
	for(i = 0; str[i] !='\0'; i++)
	{
		if(str[i] >= 'a' && str[i] <='z')
		{
			str[i] = str[i] - 32;
		}
	}
}