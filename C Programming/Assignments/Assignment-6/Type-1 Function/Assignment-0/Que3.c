// WAP to calculate the percentage of student using Function

#include<stdio.h>

void marks();
void main()
{
	marks();
}

void marks()
{
	int Marathi, English, Hindi, Maths, Science,totalMarks;
	float percentage;
	
	
	
	printf("Enter Marks:");
	scanf("%d%d%d%d%d",&Marathi, &English, &Hindi, &Maths, &Science);
	
	totalMarks = Marathi + English + Hindi + Maths + Science;
	
	percentage = (totalMarks / 5.0);
	
	printf("\nTotal Marks : %d", totalMarks);
	
	printf("\nPercentage : %.2f", percentage);
}