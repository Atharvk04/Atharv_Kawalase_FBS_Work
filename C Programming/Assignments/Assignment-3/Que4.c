void main ()
{
	int no = 18;
	int i =2, flag = 0;
	
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
	{
		printf("Number is Prime");
	}
	else
	{
		printf("Number is not prime");
	}
}