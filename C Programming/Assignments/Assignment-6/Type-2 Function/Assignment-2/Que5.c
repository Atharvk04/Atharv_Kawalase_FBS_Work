#include<stdio.h>

float discount();

void main ()
{
	float final_price;
	
	final_price = discount ();
	
	printf("\nFinal Price = %.2f\n", final_price);
    
}
float discount()
{
	float price;
    char student;
    float discount = 0.0;
    
    printf("Enter the Price: ");
    scanf("%f", &price);
    
    printf("Are you Student? (y/n): ");
    scanf(" %c", &student);
    
    if(student == 'y' || student == 'Y') 
    {
        if(price > 500)
            discount = price * 0.20;
        else
            discount = price * 0.10;
    }
    else
    {
        if(price > 600)
            discount = price * 0.15;
        else
            discount = 0;
    }

    return price - discount;
}