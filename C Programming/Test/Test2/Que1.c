// WAP to calculate electricity bill.
//For 1-50 units - 30 rs/units, For 51-150 units - 40 rs/units, For 151 and above units- 50 rs/units.


void main ()
{
	int unit= 135;
	
	if(unit <=50 && unit >0)
	{
		printf("%d rs",30*unit);
	}
	else if(unit >50 && unit <150)
	{
		printf("%d rs",40*unit);
	}
	else
	{
		printf("%d rs",50*unit);
	}
}