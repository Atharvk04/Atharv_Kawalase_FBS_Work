float marks();

void main()
{
	float average;
	
	average = marks();
	
	printf("Average of number is: %.2f",average);
}
float marks()
{
	int n1,n2,n3,n4,n5;
	float average; 
	
	printf("Enter the numbers: ");
	scanf("%d%d%d%d%d",&n1,&n2,&n3,&n4,&n5);
	
	average = (n1 + n2 + n3 + n4 + n5) / 5.0;
	
	return average;
}