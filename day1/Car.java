package week1.day1;

public class Car {
	
	void driveCar()
	{
		System.out.println("driving a car");
	}
	
	void applyBreak()
	{
		System.out.println("Break is applied");
	}
	
	void soundHorn()
	{
		System.out.println("horn is harsh");
	}
	
	void isPuncture()
	{
		System.out.println("car is puncture");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.driveCar();
		c.applyBreak();
		c.soundHorn();
		c.isPuncture();
}
}
