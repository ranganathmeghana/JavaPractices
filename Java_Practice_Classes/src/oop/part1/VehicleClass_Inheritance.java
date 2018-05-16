package oop.part1;

public class VehicleClass_Inheritance {
	
	private int no;
	private int cost;
	
	public VehicleClass_Inheritance(int no, int cost) {

		this.no = no;
		this.cost = cost;
	}
	
	

}

class Car extends VehicleClass_Inheritance{

	private int year;
	private int ppl;
	
	public Car(int no, int cost, int year, int ppl) {
		super(no, cost);
		this.year = year;
		this.ppl = ppl;
		// TODO Auto-generated constructor stub
	}

	public int getYear() {
		return year;
	}

	public int getPpl() {
		return ppl;
	}
	
	public static void main(String[] args) {
		
		Car car= new Car(12, 34, 56, 78);
		System.out.println(car.getYear());
	}
	
}