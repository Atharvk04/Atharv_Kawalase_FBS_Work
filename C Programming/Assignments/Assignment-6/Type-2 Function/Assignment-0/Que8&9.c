int areaOfRect(int, int);
int periOfRect(int, int);
void main ()

{
	int len,bre;
	printf("Enter length and breadth: ");
	scanf("%d%d",&len,&bre);
	
	
	int area = areaOfRect(len,bre);
	printf("\nArea : %d",area);
	
	
	int peri = periOfRect(len,bre);
	printf("\nPeri : %d",peri);
}

int areaOfRect(int len, int bre)
{
	int area = len * bre;
	return area;
}

int periOfRect(int len, int bre)
{
	int peri = 2 * (len+bre);
	
	return peri;
}
