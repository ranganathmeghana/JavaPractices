package Set.Example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>(); 
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {
		
		HeavenlyBody heavenlyBody = new HeavenlyBody("Mercury", 36.89);
		solarSystem.put(heavenlyBody.getName(), heavenlyBody);
		planets.add(heavenlyBody);
		
		HeavenlyBody heavenlyBody1 = new HeavenlyBody("Venus", 92.54);
		solarSystem.put(heavenlyBody1.getName(), heavenlyBody1);
		planets.add(heavenlyBody1);
		
		HeavenlyBody heavenlyBody2 = new HeavenlyBody("Earth", 89.22);
		solarSystem.put(heavenlyBody2.getName(), heavenlyBody2);
		planets.add(heavenlyBody2);
		
		HeavenlyBody heavenlyBody3 = new HeavenlyBody("Moon",7.9);
		solarSystem.put(heavenlyBody3.getName(), heavenlyBody3);
		heavenlyBody2.addMoon(heavenlyBody3);
		
		HeavenlyBody heavenlyBody4 = new HeavenlyBody("Mercury",45.32);
		planets.add(heavenlyBody4);
		
		System.out.println("All the planets are:");
		for(HeavenlyBody body : planets){
			System.out.println(body.getName()+" "+ body.getOrbitingPeriod());
		}
		
		System.out.println("The moons of earth are ");
		HeavenlyBody h= solarSystem.get("Earth");
		for(HeavenlyBody b : h.getSatellite()){
			System.out.println(b.getName());
		}
	}
}
