#include <stdio.h>

// Function declaration
int swap();

int main()
{
    int a, b;

    printf("Enter two numbers: ");
    scanf("%d%d", &a, &b);

    a = swap();  

    printf("\nAfter Swapping: a = %d and b = %d", a, b);

    return 0;
}

int swap()
{
    int a, b, temp;
    
    
    printf("Enter the same two numbers again (for swap logic): ");
    scanf("%d%d",&a,&b);

    temp = a;
    a = b;
    b = temp;

    return a;  
}
