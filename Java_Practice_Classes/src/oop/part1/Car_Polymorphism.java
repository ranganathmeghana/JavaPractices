package oop.part1;

class Toyota extends Car_Polymorphism{

	public Toyota() {
		super("Toyota", 3);
		
	}
	
	@Override
	public void brake() {
		System.out.println("put brakes on Toyota");
		
	}
	
	public void accelerate (int speed){
		System.out.println("Toyota accelerate at the speed of" +speed);
	}

}

public class Car_Polymorphism {
	
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	
	public Car_Polymorphism(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		this.wheels =4;
		this.engine = true;
	}

	public String getName() {
		return name;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}
	
	public void startEngine(){
		
		if(this.engine == true){
			System.out.println("start engine");
			
		}
		
		else{
			System.out.println("engine already started");
		}
	}
	
	public void accelerate (int speed){
		System.out.println("accelerate at the speed of" +speed);
	}

	public void brake() {
		System.out.println("put brakes");
		
	}
	
	public static void main(String[] args) {
		
		Toyota toyota=new Toyota();
		toyota.accelerate(100);
	}
}

