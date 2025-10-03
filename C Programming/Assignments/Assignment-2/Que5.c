
void main() {
	
    float price = 700;     
    char student = 'y';    
    float discount = 0, final_price;

    if (student == 'y' || student == 'Y') 
	{ 
        if (price > 500) 
		{
            discount = 20;
        } 
		else 
		{
            discount = 10;
        }
    } 
	else 
	{ 
        if (price > 600) 
		{
            discount = 15;
        } 
		else 
		{
            discount = 0;
        }
    }

    final_price = price - (discount / 100) * price;

    printf("Purchase Amount: %.2f\n", price);
    printf("Student: %c\n", student);
    printf("Discount: %.0f%%\n", discount);
    printf("Final Price: %.2f\n", final_price);

    return 0;
}
