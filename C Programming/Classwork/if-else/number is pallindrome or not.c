void main () {
	
	int no = 545;
	int r1,r2,r3,rev;
	int q1;
	
	r1 = no%10;
	q1 = no/10;
	r2 = q1%10;
	r3 = q1/10;
	
	rev = r1*100 + r2*10 +r3;
	
	if(rev == no)
	{
		printf("Number is pallindrome");
	}
	else
	{
		printf("Numner is not pallindrome");
	}
	
	
	
}