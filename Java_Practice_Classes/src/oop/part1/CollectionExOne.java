package oop.part1;

public class CollectionExOne {
	
	public static void main(String[] args) {
		int numRows= 20;
		int lastRow= 'A' + (numRows-1);
		for(char row ='A'; row<=lastRow;row++){
			for(int seatNum=1; seatNum< 10; seatNum++)
			System.out.println( row + String.format("%02d",seatNum));
		}
	}

}
