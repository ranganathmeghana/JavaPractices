package Set.Example;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {

	private final String name;
	private final double orbitingPeriod;
	private final Set<HeavenlyBody> satellite;
	
	public HeavenlyBody(String name,double orbitingPeriod ) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.orbitingPeriod = orbitingPeriod;
		this.satellite = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitingPeriod() {
		return orbitingPeriod;
	}
	
	public boolean addMoon(HeavenlyBody moon)
	{
		return this.satellite.add(moon);
	}

	public Set<HeavenlyBody> getSatellite() {
		return new HashSet<>(this.satellite);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		System.out.println(this.getClass());
		System.out.println(obj.getClass());
		
		if((obj == null) || (obj.getClass() != this.getClass())){
		return false;	
		}
		
		return this.getName().equals(((HeavenlyBody)(obj)).getName());
		
		//return super.equals(obj);
	}
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("HashCode called" + this.getName().hashCode());
		return this.getName().hashCode();
	}
	
}
