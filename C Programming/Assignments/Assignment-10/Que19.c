//strcasecmp() — Case-insensitive String Compare

#include<stdio.h>
#include<string.h>

void main() 
{
    char s1[20] = "Akshay";
    char s2[20] = "Atharv";
    int result = strcasecmp(s1, s2);
    printf("Result = %d", result);

}