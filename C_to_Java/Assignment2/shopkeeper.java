class shopkeeper
{
	
    public static void main(String args[] ) {
	
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

    System.out.printf("Purchase Amount: %f\n", price);
    System.out.printf("Student: %c\n", student);
    System.out.printf("Discount: %f\n", discount);
    System.out.printf("Final Price: %f\n", final_price);
}
}