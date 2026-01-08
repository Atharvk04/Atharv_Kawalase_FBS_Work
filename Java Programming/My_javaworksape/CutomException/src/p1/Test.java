package p1;

class Test
{
	public static void main(String[] args) {
		
		Voter v1 = new Voter(17);
		try {
			v1.validate();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}
