package map.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map<Integer, Location> location = new HashMap<Integer, Location>();
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		location.put(1, new Location(0, "near Computer"));
		location.put(2, new Location(1, "on road"));
		location.put(3, new Location(2, "on hill"));
		location.put(4, new Location(3, "in a building"));
		location.put(5, new Location(4, "by the stream"));
		location.put(6, new Location(5, "in a forest"));
		
		location.get(1).addToExits("N", 2);
		location.get(1).addToExits("E", 3);
		location.get(1).addToExits("S", 4);
		location.get(1).addToExits("W", 5);
		location.get(1).addToExits("Q", 0);
		
		location.get(2).addToExits("N", 5);
		location.get(2).addToExits("Q", 0);
		
		location.get(3).addToExits("W", 1);
		location.get(3).addToExits("Q", 0);
		
		location.get(4).addToExits("W", 2);
		location.get(4).addToExits("N", 1);
		location.get(4).addToExits("Q", 0);
		
		
		location.get(5).addToExits("W", 2);
		location.get(5).addToExits("S", 1);
		location.get(5).addToExits("Q", 0);
		
		int loc =1;
		while(true){
			
			
			System.out.println((location.get(loc)).getDescription());
			System.out.println("Available exits are:");
			Map<String, Integer> map = location.get(loc).getExits();
			
			for(String s : map.keySet()){
				System.out.println(s);
			}
			
			if(loc==0){
				break;
			}
			String direction=null;
			int size = scanner.nextLine().length();
			if(size ==1){
				 direction = scanner.nextLine().toUpperCase();
			}
			else{
				String[] directionArr = scanner.nextLine().split(" ");
				 direction = directionArr[1].substring(0, 0);			}
			
			if(!map.containsKey(direction)){
				System.out.println("invalid location");
			}
			
			else{
				loc = map.get(direction);
			}
		
		}
	}

}
