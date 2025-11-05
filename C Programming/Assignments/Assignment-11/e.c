#include<stdio.h>
#include<string.h>
void copystr(char* , char*, int*);

void main ()
{
	char src[20];
	char dest[25];
	
	printf("Enter a String:");
	gets(src);
	
	int n;
	printf("Enter number till you want to print your string: ");
	scanf("%d",&n);
	
	copystr(dest,src,&n);
	
	printf("Copied string is:%s",dest);
}

void copystr(char* dest, char* src,int* n)
{
	int i=0;
	
		for(i=0;i != *n;i++)
			dest [i] = src [i];
		
}