#include<stdio.h>

float convert();

void main ()
{
	float fahrenheit;
	
	fahrenheit = convert();
	
	printf("Temperature in fahrenheit: %.2f ",fahrenheit);
	
}

float convert ()
{
	float celcius, fahrenheit;
	
	printf("Enter the Celcius: ");
	scanf("%f",&celcius);
	
	fahrenheit = (celcius * 9 / 5) + 32;
	
	return fahrenheit;
	
}