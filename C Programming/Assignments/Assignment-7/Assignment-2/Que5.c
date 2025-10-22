#include<stdio.h>

void discount (float *price, char *student);

void main()
{
	float price;
	char s;
	
	printf("Enter the price: ");
	scanf("%f",&price);
	
	printf("Are you student?: ");
	scanf(" %c",&s);
	
	discount (&price, &s);
}

void discount(float *price, char *student)
{
	float discount = 0.0, final_price;
	
	if(*student == 'y' || *student == 'Y') 
    {
        if(*price > 500)
            discount = *price * 0.20;
        else
            discount = *price * 0.10;
    }
    else
    {
        if(*price > 600)
            discount = *price * 0.15;
        else
            discount = 0;
    }

    final_price = *price - discount;
    
    printf("Discount:  %.2f",discount);
    
    printf("final_price: %f",final_price);
}