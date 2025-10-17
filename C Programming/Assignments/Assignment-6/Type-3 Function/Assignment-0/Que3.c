#include<stdio.h>

void convert (float temperature);

void main ()
{
	float t;
	
	printf("Enter the temperature in celcius: ");
	scanf("%f",&t);
	
	convert (t);
}
void convert (float temperature)
{
	
	float fahrenheit;
	
	fahrenheit = (temperature * 9 / 5) + 32;
	
	printf("Temperature in fahrenheit: %.2f ",fahrenheit);
}