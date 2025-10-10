/* Accept the price from user. Ask the user if he is a student (user may say y or n). If he
is a student and he has purchased more than 500 than discount is 20% otherwise
discount is 10%.But if he is not a student then if he has purchased more than 600
discount is 15% otherwise there is not discount.*/

#include<stdio.h>

void discount();

void main()
{
    discount();
    return 0;
}

void discount()
{
    float price;
    char student;
    float discount, final_price;
    
    printf("Enter the Price: ");
    scanf("%f", &price);
    
    printf("Are you Student? (y/n): ");
    scanf(" %c", &student);

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
            discount = 0;
    }

    final_price = price - discount;   // ? fixed calculation

    printf("\nDiscount = %.2f", discount);
    printf("\nFinal Price = %.2f\n", final_price);
}
