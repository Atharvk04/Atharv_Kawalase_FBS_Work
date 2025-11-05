#include<stdio.h>
#include<string.h>

void strlower(char* );
void main()
{
	char str[20] = "HELLOWORLD";
	
	strlower(str);
	
	printf("Lowercase string is: %s",str);
	
}
void strlower(char* str)
{
	int i;
	
	for(i = 0; str[i] !='\0'; i++)
	{
		if(str[i] >= 'A' && str[i] <='Z')
		{
			str[i] = str[i] + 32;
		}
	}
}