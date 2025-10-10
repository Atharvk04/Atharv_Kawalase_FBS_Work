#include <stdio.h>

int convertTime();  

int main()
{
    int totalMinutes, hours, remaining;

    totalMinutes = convertTime();  


    hours = totalMinutes / 60;
    remaining = totalMinutes % 60;

    printf("\n%d minutes = %d hours and %d minutes", totalMinutes, hours, remaining);

    return 0;
}

int convertTime()
{
    int minutes;

    printf("Enter total minutes: ");
    scanf("%d", &minutes);

    return minutes; 
}
