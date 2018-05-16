package oop.part1;

public class Room_Composition {
	
	private Bathroom bathroom;
	private Closet closet;
	private String bedSize;
	private int noOfLamps;
	public Bathroom getBathroom() {
		return bathroom;
	}
	public Closet getCloset() {
		return closet;
	}
	public String getBedSize() {
		return bedSize;
	}
	public int getNoOfLamps() {
		return noOfLamps;
	}

	public static void main(String[] args) {
		
		Bathroom bathroom = new Bathroom("Queen", 2, 4);
		
		Room_Composition composition= new Room_Composition();
		composition.getBathroom().displaySize();
		
	}
	
	
}

class Bathroom{
	private String bathTubSize;
	private int basins;
	private int lamps;
	
	
	
	public Bathroom(String bathTubSize, int basins, int lamps) {
		super();
		this.bathTubSize = bathTubSize;
		this.basins = basins;
		this.lamps = lamps;
	}
	public String getBathTubSize() {
		return bathTubSize;
	}
	public int getBasins() {
		return basins;
	}
	public int getLamps() {
		return lamps;
	}
	
	public void displaySize(){
		System.out.println("the bathtub size is"+ this.bathTubSize);
	}
	
}

class Closet{
	
	private String ClosetSize;
	private int hangers;
	public String getClosetSize() {
		return ClosetSize;
	}
	public int getHangers() {
		return hangers;
	}
	
	
	
}
