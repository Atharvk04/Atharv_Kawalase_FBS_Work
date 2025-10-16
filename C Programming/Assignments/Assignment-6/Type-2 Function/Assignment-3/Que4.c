#include<stdio.h>

int prime();

void main()
{
	int result;
	
	result = prime();
	
	if(result == 0)
		printf("Number is Prime");
	else
		printf("Number is not Prime");
}

int prime()
{
	int no, i=2, flag=0;
	
	printf("Enter the number: ");
	scanf("%d",&no);
	
	while(i < no)
	{
		if(no % i ==0)
		{
			flag =1;
			break;
		}
		i++;
	}
	
	if(flag == 0)
		return 0;
	else
		return 1;
	
}