class swap
{
	public static void main (String[] args) {
	
	int a = 10, b = 30;
	int temp;
	
	System.out.printf("Before Swapping : a = %d and b = %d", a, b);
	
	temp = a;
	a = b;
	b =temp;
	
	System.out.printf("\nAfter Swapping : a = %d and b = % d", a,b);
	
}
}