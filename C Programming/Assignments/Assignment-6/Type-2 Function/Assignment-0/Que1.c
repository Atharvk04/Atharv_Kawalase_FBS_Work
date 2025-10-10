#include<stdio.h>

int sum(); // Function Declaration

void main()
{
    int result;
    
    result = sum(); // Function Call (receives returned value)
    
    printf("The sum is: %d\n", result);
}

int sum() // Function Definition
{
    int a, b, c;
    
    printf("\nEnter two numbers: ");
    scanf("%d%d", &a, &b);
    
    c = a + b;
    
    return c; // Returning the result to main()
}
