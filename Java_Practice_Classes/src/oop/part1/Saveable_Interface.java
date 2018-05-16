package oop.part1;

import java.util.ArrayList;

public interface Saveable_Interface {

	public ArrayList<Object> save();
	public Object populate(ArrayList<Object> obj);
	
}

class Monster implements Saveable_Interface{
	
	private String name;
	private int hitPoints;
	private String weapon;
	
	public Monster(String name,int hitPoints) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.hitPoints = hitPoints;
		this.weapon = "Nails";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Monster has" + this.name + "name" + this.hitPoints + "points" + this.weapon + "weapon");
	}
	
	
	@Override
	public ArrayList<Object> save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object populate(ArrayList<Object> obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
}