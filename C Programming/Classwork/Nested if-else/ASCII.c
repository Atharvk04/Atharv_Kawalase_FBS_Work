#include<stdio.h>

void main () {
	
	char ch = 'a';
	
	if(ch>='A' && ch <='Z')
	{
		ch = ch + 32;
	}
	else
	{
		ch = ch-32;
	}
	
	printf("%c",ch);  
}