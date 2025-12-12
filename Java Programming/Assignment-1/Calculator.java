class Calculator
{
	int add (int a, int b)
	{	
		return a + b;
	}

	double add (double a, double b)
	{	
		return a + b;
	}
	
	double add (int a, double b)
	{
		return a + b;
	}
	
	double add (double a, int b)
	{
		return a + b;
	}
	
	int subtract (int a, int b)
	{	
		return a - b;
	}

	double subtract (double a, double b)
	{	
		return a - b;
	}
	
	double subtract (int a, double b)
	{
		return a - b;
	}
	
	double subtract (double a, int b)
	{
		return a - b;
	}

	int multiply (int a, int b)
	{	
		return a * b;
	}

	double multiply (double a, double b)
	{	
		return a * b;
	}
	
	double multiply (int a, double b)
	{
		return a * b;
	}
	
	double multiply (double a, int b)
	{
		return a * b;
	}
	
	int divide (int a, int b)
	{	
		return a / b;
	}

	double divide (double a, double b)
	{	
		return a / b;
	}
	
	double divide (int a, double b)
	{
		return a / b;
	}
	
	double divide (double a, int b)
	{
		return a / b;
	}
}

class TestCalculator
{
	public static void main(String [] args)
	{
		Calculator c = new Calculator();
		
		System.out.println("Add: " + c.add(5,3));
		System.out.println("Add: " + c.add(5.5,3.5));
		System.out.println("Add: " + c.add(5,3.5));
		System.out.println("Add: " + c.add(5.5,3)+"\n");

		System.out.println("Subtract: " + c.subtract(10,3));
		System.out.println("Subtract: " + c.subtract(10.5,3.5));
		System.out.println("Subtract: " + c.subtract(10,3.5));
		System.out.println("Subtract: " + c.subtract(10.5,3)+"\n");
	
		System.out.println("Multiply: " + c.multiply(4,2));
		System.out.println("Multiply: " + c.multiply(4.5,2.5));
		System.out.println("Multiply: " + c.multiply(4,2.5));
		System.out.println("Multiply: " + c.multiply(4.5,2)+"\n");

		System.out.println("Divide: " + c.divide(10,2));
		System.out.println("Divide: " + c.divide(10.5,2.5));
		System.out.println("Divide: " + c.divide(10,2.5));
		System.out.println("Divide: " + c.divide(10.5,2));
	}
}

