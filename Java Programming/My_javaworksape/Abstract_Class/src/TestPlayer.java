abstract class Player
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
	
	public String toString() {
		return "Player [name=" + name + ", age=" + age + "]";
	}

	abstract double calScore();
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
	
	public String toString() {
		return super.toString() + "CricketPlayer [runsScored=" + runsScored + ", wicketsTaken=" + wicketsTaken + "]";
	}

	double calScore()
	{
		return runsScored + wicketsTaken * 10;
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
	
	public String toString() {
		return super.toString() + "FootballPlayer [goalScored=" + goalScored + "]";
	}

	double calScore()
	{
		return goalScored + 5;
	}
}//class FootballPlayer ends here
class TestPlayer {

	public static void main(String[] args)
	{
		Player p1;
		
		//p1 = new Player("Rohit",39);
		
		CricketPlayer c1 = new CricketPlayer("Virat",37,27910,9);
		
		FootballPlayer f1 = new FootballPlayer("Ronaldo",40,950);
		
		System.out.println("Player details: ");
		System.out.println();
		//System.out.println(p1.toString());
		System.out.println();
		
		System.out.println("Cricket Player details: ");
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
		
		System.out.println("Football Player details: ");
		System.out.println();
		System.out.println(f1.toString());
		System.out.println();
	}

}

class MyTestPlayer
{
	public static void main(String[] args)
	{
		Player p;

//		p = new Player("Amit", 30);
//		p.calScore();
//		System.out.println("Score: " + p.calScore());

		p = new CricketPlayer("Virat", 37, 27910, 9);
		p.calScore();
		System.out.println("Score: " + p.calScore());

		p = new FootballPlayer("Ronaldo", 40, 950);
		p.calScore();
		System.out.println("Score: " + p.calScore());
	}
}

