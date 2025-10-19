#include <stdio.h>

int area(int num1, int num2);

int main() {
    int a, b, ar, per;

    printf("Enter the length and breadth: ");
    scanf("%d%d", &a, &b);

    ar = area(a, b);
    per = 2 * (a + b);

    printf("Area of the rectangle is: %d and Perimeter of rectangle is: %d\n", ar, per);

    return 0;
}

int area(int num1, int num2) {
    return num1 * num2;
}
