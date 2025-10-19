#include<stdio.h>

float convert (float temperature);

void main ()
{
	float t, result;
	
	printf("Enter the Temperature in celcius: ");
	scanf("%f",&t);
	
	result = convert (t);
	
	printf("Temperature in fahrenheit: %.2f", result);
}

float convert (float temperature)
{
	float fahrenheit;
	
	fahrenheit = (temperature * 9 / 5) + 32;
	
	return fahrenheit;
}