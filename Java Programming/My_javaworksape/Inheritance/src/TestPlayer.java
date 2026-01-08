class Player
{
	String name;
	int age;
	
	Player() 
	{
		this.name = "Not Given";
		this.age = 0;
	}

	Player(String name, int age) 
	{
		//super();
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	void display()
	{
		System.out.println("Name of player: "+this.name);
		System.out.println("Age of Player: "+this.age);
	}
}//class Player ends here

class CricketPlayer extends Player
{
	int runsScored;
	int wicketsTaken;
	
	CricketPlayer() 
	{
		super();
		this.runsScored = 0;
		this.wicketsTaken = 0;
	}

	CricketPlayer(String name,int age,int runsScored, int wicketsTaken) 
	{
		super(name,age);
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
	}

	int getRunsScored() {
		return runsScored;
	}

	void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	int getWicketsTaken() {
		return wicketsTaken;
	}

	void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	
	void display()
	{
		super.display();
		System.out.println("Runs Scored: "+this.runsScored);
		System.out.println("Wickets Taken: "+this.wicketsTaken);
	}
}//class CricektPlayer ends here

class FootballPlayer extends Player
{
	int goalScored;
	
	FootballPlayer() 
	{
		super();
		this.goalScored= 0;
	}

	FootballPlayer(String name,int age,int goalScored) 
	{
		super(name,age);
		this.goalScored = goalScored;
	}

	int getGoalScored() {
		return goalScored;
	}

	void setGoalScored(int goalScored) {
		this.goalScored = goalScored;
	}
	
	void display()
	{
		super.display();
		System.out.println("Goal Scored: "+this.goalScored);
	}
}//class FootballPlayer ends here
class TestPlayer {

	public static void main(String[] args)
	{
		Player p1 = new Player("Rohit",39);
		
		CricketPlayer c1 = new CricketPlayer("Virat",37,27910,9);
		
		FootballPlayer f1 = new FootballPlayer("Ronaldo",40,950);
		
		System.out.println("Player details: ");
		System.out.println();
		p1.display();
		System.out.println();
		
		System.out.println("Cricket Player details: ");
		System.out.println();
		c1.display();
		System.out.println();
		
		System.out.println("Football Player details: ");
		System.out.println();
		f1.display();
		System.out.println();
	}

}
