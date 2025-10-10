float marks();

void main()
{
	float average;
	
	average = marks();
	
	printf("Average of number is: %.2f",average);
}
float marks()
{
	int s1,s2,s3,s4,s5;
	float average; 
	
	printf("Enter the numbers: ");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	
	average = (s1 + s2 + s3 + s4 + s5) / 5.0;
	
	return average;
}