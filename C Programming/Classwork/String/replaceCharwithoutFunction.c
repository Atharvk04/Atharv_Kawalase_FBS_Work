#include<Stdio.h>

void main()
{
	char str [10] = "atharv";
	
	int i=0;
	
	while(str[i] != '\0')
	{
		if(str[i] == 'a')
		{
			str[i] = '$';
		}
		i++;
	}
	printf("Replaced string is: %s",str);
}