#include<stdio.h>

float discount (float price, char student);

void main ()
{
	float price, final_price;
	char s;
	
	printf("Enter the price: ");
	scanf("%f",&price);
	
	printf("Are you student? (y/n): ");
	scanf(" %c",&s);
	
	final_price = discount (price, s);
	
	printf("\nFinal Price = %.2f\n", final_price);
}

float discount(float price, char student)
{
    float discount = 0.0;

    if (student == 'y' || student == 'Y')
    {
        if (price > 500)
            discount = price * 0.20;
        else
            discount = price * 0.10;
    }
    else
    {
        if (price > 600)
            discount = price * 0.15;
        else
            discount = 0.0;
    }

    return price - discount;
}