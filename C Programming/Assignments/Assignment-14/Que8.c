#include<stdio.h>
#include<string.h>

struct Distance
{
	int feet;
	float inch;
};

void main()
{
	struct Distance D1, D2;
	
	D1.feet=6;
	D1.inch=5.2;
	
	printf("Enter D2 Distance in feet: ");
	scanf("%d",&D2.feet);
	printf("Enter D2 Distance in inch: ");
	scanf("%f",&D2.inch);
	
	printf("\n D1 Details \n");
	printf("Distance of D1 in feet: %d\n",D1.feet);
	printf("Distance of D1 in inch: %.2f\n",D1.inch);
	
	printf("\n D2 Details \n");
	printf("Distance of D2 in feet: %d\n",D2.feet);
	printf("Distance of D2 in inch: %.2f\n",D2.inch);
}