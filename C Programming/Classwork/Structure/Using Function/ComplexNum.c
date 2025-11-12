#include<stdio.h>

typedef struct 
{
	int real;
	int img;
}comp;

comp add(comp , comp );

void main()
{
	comp c1, c2, c3;
	
	c1.real=10;
	c2.img=20;
	
	c2.real=4;
	c2.img=6;
	
	c3=add(c1,c2);
	
	display(c3);
}

comp add(comp c1, comp c2)
{
	comp c3;
	
	c3.real=c1.real + c2.real;
	c3.img=c1.img + c2.img;
	
	return c3;
}

display(comp cmp)
{
	printf("real numbers is: %d ",cmp.real);
	printf("img numbers is: %d ",cmp.img);
}