class palindrome
{
	public static void main (String[] args) 
	{
	
		int num = 567;
	
		int r1,r2,r3,rev;
		int q1;
	
		r1 = num % 10;
		q1 = num / 10;
		r2 = q1 % 10;
			r3 = q1 / 10;
	
		rev = r1*100 + r2 *10 + r3;
	
		if (rev == num)
		{
			System.out.printf("Number is pallindrome");
		}
		else 
		{
			System.out.printf("Number is not pallindrome");
		}
	}
}	