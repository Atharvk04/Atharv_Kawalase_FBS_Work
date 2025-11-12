#include<stdio.h>
#include<string.h>

struct Complex
{
	float real;
	float imaginary;
};

void main()
{
	struct Complex C1, C2;
	
	C1.real=3.5;
	C1.imaginary=2.5;
	
	printf("Enter real number for C2: ");
	scanf("%f",&C2.real);
	printf("ENter imaginary number for C2: ");
	scanf("%f",&C2.imaginary);
	
	printf("\nNumber 1 details\n");
	printf("Real number: %.2f\n",C1.real);
	printf("Imaginary number: %.2f\n",C1.imaginary);
	
	printf("\nNumber 2 details\n");
	printf("Real number: %.2f\n",C2.real);
	printf("Imaginary number: %.2f\n",C2.imaginary);
}