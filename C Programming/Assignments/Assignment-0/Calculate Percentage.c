void main () {
	
	int Marathi = 89, English = 81, Hindi = 85, Maths = 93, Science = 78;
	int totalMarks;
	float percentage;
	
	totalMarks = Marathi + English + Hindi + Maths + Science;
	
	percentage = (totalMarks / 5.0);
	
	printf("Marks : %d %d %d %d %d", Marathi, English, Hindi, Maths, Science);
	
	printf("\nTotal Marks : %d", totalMarks);
	
	printf("\n Percentage : %.2f", percentage);
}