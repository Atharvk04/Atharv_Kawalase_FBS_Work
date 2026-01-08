abstract class Vehicle
{
	int speed;
	int capacity;
	String fuelType;
	
	public Vehicle() 
	{
		this.speed = 0;
		this.capacity = 0;
		this.fuelType = "Not Given";
	}

	Vehicle(int speed, int capacity, String fuelType) 
	{
		//super();
		this.speed = speed;
		this.capacity = capacity;
		this.fuelType = fuelType;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getCapacity() {
		return capacity;
	}

	void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	String getFuelType() {
		return fuelType;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
	public String toString() {
		return "Vehicle [speed=" + speed + ", capacity=" + capacity + ", fuelType=" + fuelType + "]";
	}

	abstract double calEfficiency();
	
}//class Vehicle ends here

class Car extends Vehicle
{
	int airbags;
	
	 Car() 
	 {
		super();
		this.airbags = 0;
	 }

	 Car(int speed,int capacity,String fuelType,int airbags) 
	 {
		super(speed,capacity,fuelType);
		this.airbags = airbags;
	 }

	 int getAirbags() {
		 return airbags;
	 }

	 void setAirbags(int airbags) {
		 this.airbags = airbags;
	 }
	 
	public String toString() {
		return super.toString() + "Car [airbags=" + airbags + "]";
	}

	 double calEfficiency()
	 {
			return speed + airbags;
	 }
	 
}//class Car ends here

class Bike extends Vehicle
{
	int seatHeight;
	
	Bike()
	{
		super();
		this.seatHeight = 0;
	}

	Bike(int speed,int capacity,String fuelType,int seatHeight) 
	{
		super(speed,capacity,fuelType);
		this.seatHeight = seatHeight;
	}

	int getSeatHeight() {
		return seatHeight;
	}

	void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	

	public String toString() {
		return super.toString() + "Bike [seatHeight=" + seatHeight + "]";
	}

	double calEfficiency()
	{
		return speed - seatHeight * 0.2;
	}
}//class Bike ends here

class Bus extends Vehicle
{
	String emergencyExitLocation;
	
	Bus() 
	{
		super();
		this.emergencyExitLocation = "Not Given";
	}

	Bus(int speed,int capacity,String fuelType,String emergencyExitLocation) 
	{
		super(speed,capacity,fuelType);
		this.emergencyExitLocation = emergencyExitLocation;
	}

	String getEmergencyExitLocation() {
		return emergencyExitLocation;
	}

	void setEmergencyExitLocation(String emergencyExitLocation) {
		this.emergencyExitLocation = emergencyExitLocation;
	}
	

	public String toString() {
		return super.toString() + "Bus [emergencyExitLocation=" + emergencyExitLocation + "]";
	}

	double calEfficiency()
	{
		return speed - capacity *0.2;
	}
}//class Bus ends here

class TestVehicle {

	public static void main(String[] args) 
	{
		Vehicle v1;
		
		//v1 = new Vehicle(65,4,"Diesel");
		
		Car c1 = new Car (78,8,"Petrol",6);
		
		Bike b1 = new Bike(45,2,"Petrol",805);
		
		Bus B1 = new Bus(70,40,"Diesel","Front");
		
		System.out.println("Vehicle Details: ");
		System.out.println();
		//System.out.println(v1.toString());
		System.out.println();
		
		System.out.println("Car Details: ");
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
		
		System.out.println("Bike Details: ");
		System.out.println();
		System.out.println(b1.toString());
		System.out.println();
		
		System.out.println("Bus Details: ");
		System.out.println();
		System.out.println(B1.toString());
	}

}

class MyVehicleTest
{
	public static void main(String[] args) 
	{
		Vehicle v1;
		
//		v1 = new Vehicle (87,5,"Petrol");
//		v1.calEfficiency();
//		System.out.println("Claculated Efficiency: "+v1.calEfficiency());
		
		v1 = new Car(91,7,"Petrol",6);
		v1.calEfficiency();
		System.out.println("Claculated Efficiency: "+v1.calEfficiency());
		
		v1 = new Bike(78,2,"Petrol",5);
		v1.calEfficiency();
		System.out.println("Claculated Efficiency: "+v1.calEfficiency());
		
		v1 = new Bus(65,32,"Diesel","Rear");
		v1.calEfficiency();
		System.out.println("Claculated Efficiency: "+v1.calEfficiency());
		
	}
}
