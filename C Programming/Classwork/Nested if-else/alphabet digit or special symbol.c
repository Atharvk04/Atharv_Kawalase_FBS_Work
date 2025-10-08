// Find entered character is alphabet, digit or special symbol

void main ()
{
	char ch = 'S';
	
	if(ch>= 'A' && ch<= 'Z' || ch >= 'a' && ch <='z')
	{
		printf("Alphabet");
	}
	else
	{
		if(ch>='0' && ch <='9')
		{
			printf("digit");
		}
		else
		{
			printf("Special Symbol");
		}
	}
}