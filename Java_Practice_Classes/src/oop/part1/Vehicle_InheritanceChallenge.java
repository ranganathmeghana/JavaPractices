package oop.part1;

public class Vehicle_InheritanceChallenge {

	private String name;
	private String size;
	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	private int currentVelocity;
	private int currentDirection;
	
	public Vehicle_InheritanceChallenge(String name, String size) {
	
		this.name = name;
		this.size = size;
		this.currentDirection =0;
		this.currentVelocity =0; 
	}
	
	public void steer(int direction){
		this.currentDirection = direction;
		System.out.println("Sterring in current Direction" + currentDirection);
		
	}
	
	public void move(int direction, int velocity)
	{
		this.currentDirection = direction;
		this.currentVelocity = velocity;
		
		System.out.println("Moving at velocity" + currentVelocity + "at this direction" + currentDirection);
	}
	
	public void stop() {
		this.currentVelocity =0;
		System.out.println("the vehicle is stopped");
	}
}

class Car extends Vehicle_InheritanceChallenge{
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	
	public int getWheels() {
		return wheels;
	}

	public int getDoors() {
		return doors;
	}

	public int getGears() {
		return gears;
	}

	public boolean isManual() {
		return isManual;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeCurrentGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("current gear changed to" + this.currentGear);
	}
	
	public void changeVelocity(int direction, int speed) {
		
		move(direction, speed);
		System.out.println("changed speed n velocity is" + speed + "" + direction);
	}

	
	
}

class Toyota extends Car {
	
	private int roadMonths;

	
	
	public int getRoadMonths() {
		return roadMonths;
	}

	public Toyota(int roadMonths) {
		super("Corolla", "big", 4, 4, 5, false);
		this.roadMonths = roadMonths;
	}
	
	//changes gear based on speed
	public void accelerate(int speed){
	
	int newVelocity = this.getCurrentVelocity() + speed;
	
	switch(newVelocity){
	
	case 0: stop();
	case 10: changeCurrentGear(1);
	case 20: changeCurrentGear(2);
	case 30: changeCurrentGear(3);
	case 40: changeCurrentGear(4);
	case 50: changeCurrentGear(5);
	
	}
	}
}
