/* Que 1: Write a program to print factors of number in given range.
Eg. Range 10 to 15
10 = 1 , 2 , 5 , 10
11 = 1 , 11
12 = 1, 2, 3, 4, 6, 12
13 = 1, 13
14 = 1, 2, 7, 14
15 = 1, 3, 5, 15 */

#include <stdio.h>
void main()
{
	int start,end;
	printf("Enter the range : ");
	scanf("%d %d",&start,&end);
	
	for(int i=start;i<=end;i++)
	{
		printf("%d = ",start);
		for(int j=1;j<=start;j++)
		{
			if(start%j==0)
			{
				printf("%d ",j);
			}
		}
		printf("\n");
		start++;
	}
}