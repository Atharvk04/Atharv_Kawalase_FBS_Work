class Vehicle
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
	
	void display()
	{
		System.out.println("Speed: "+this.speed);
		System.out.println("Capacity: "+this.capacity);
		System.out.println("Fuel Type: "+this.fuelType);
	}
	
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
	 
	 void display()
	 {
		 super.display();
		 
		 System.out.println("Number of airbags: "+this.airbags);
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
	
	void display()
	{
		super.display();
		
		System.out.println("Height of the seat: "+this.seatHeight);
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
	
	void display()
	{
		super.display();
		
		System.out.println("Location of Emergency Exit Door: "+this.emergencyExitLocation);
	}
}

class TestVehicle {

	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle(65,4,"Diesel");
		
		Car c1 = new Car (78,8,"Petrol",6);
		
		Bike b1 = new Bike(45,2,"Petrol",805);
		
		Bus B1 = new Bus(70,40,"Diesel","Front");
		
		System.out.println("Vehicle Details: ");
		System.out.println();
		v1.display();
		System.out.println();
		
		System.out.println("Car Details: ");
		System.out.println();
		c1.display();
		System.out.println();
		
		System.out.println("Bike Details: ");
		System.out.println();
		b1.display();
		System.out.println();
		
		System.out.println("Bus Details: ");
		System.out.println();
		B1.display();
	}

}
