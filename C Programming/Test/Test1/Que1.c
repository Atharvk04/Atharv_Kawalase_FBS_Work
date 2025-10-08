// Que 1: Convert the time entered in hh,min and sec into total seconds

void main ()
{
	int hh = 4;
	int min = 5;
	int sec = 28;
	
	int total_sec;
	
	total_sec = hh *60 *60 + min *60 + sec;
	
	printf("Total sec is : %d",total_sec);
	
}