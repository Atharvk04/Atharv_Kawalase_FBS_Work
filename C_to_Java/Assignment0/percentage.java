class percentage
{
	public static void main (String[] args) 
	{
	
		int Marathi = 89, English = 81, Hindi = 85, Maths = 93, Science = 78;
		int totalMarks;
		float percentage;
	
		totalMarks = Marathi + English + Hindi + Maths + Science;
	
		percentage = (totalMarks / 5.0f);
	
		System.out.printf("Marks : %d %d %d %d %d", Marathi, English, Hindi, Maths, Science);
	
		System.out.printf("\nTotal Marks : %d", totalMarks);
	
		System.out.printf("\n Percentage : %.2f", percentage);
	}
}