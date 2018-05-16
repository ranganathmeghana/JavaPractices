package map.game;

import java.util.HashMap;
import java.util.Map;

public class Location {
	
	private final int locationId;
	private final String description;
	private final Map<String, Integer> exits;
	
	public Location(int locationId,String description) {
	
		// TODO Auto-generated constructor stub
		this.locationId = locationId;
		this.description = description;
		exits = new HashMap<String,Integer>();
		
	}
	
	public void addToExits(String direction, int location)
	{
		exits.put(direction, location);
	}

	public int getLocationId() {
		return locationId;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String,Integer>(exits);
	}
	
}
