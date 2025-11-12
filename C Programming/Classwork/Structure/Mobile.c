#include <stdio.h>
#include <string.h>

struct mobile
{
    long long IMEINo;
    char model[20];
    float price;
};

int main()
{
    struct mobile M1;
    struct mobile M2;

    M1.IMEINo = 104440191668741;
    strcpy(M1.model, "SamsungS24Ultra");
    M1.price = 124000;

    printf("Enter IMEI number of model: ");
    scanf("%lld", &M2.IMEINo);

    printf("Enter Model Name: ");
    scanf("%s", M2.model);

    printf("Enter Price of the Model: ");
    scanf("%f", &M2.price);

    printf("\n--- Mobile 1 Details ---\n");
    printf("IMEI number of device: %lld\n", M1.IMEINo);
    printf("Name of device: %s\n", M1.model);
    printf("Price of the Model: %.2f\n", M1.price);

    printf("\n--- Mobile 2 Details ---\n");
    printf("IMEI number of device: %lld\n", M2.IMEINo);
    printf("Name of device: %s\n", M2.model);
    printf("Price of the Model: %.2f\n", M2.price);

    return 0;
}
