// WAP to convet Celcius into Fahrenheit using Function

#include<stdio.h>

void temperature();
void main ()
{
	temperature();
}
void temperature ()
{
	float celcius;
	float fahrenheit;
	
	printf("Enter the Temperature in Celcius: ");
	scanf("%f",&celcius);
	
	fahrenheit = (celcius * 9/5) + 32;
	
	printf("Temperature in Fahrenheit: %.2f",fahrenheit);
	
}
