package oop.part1;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Java", "HLL OO Lang");
		map.put("Python", "ILL HLL Prog Lang");
		map.put("Algol", "algorithm lang");
		map.put("BASIC", "bEGINNERS lANG");
		map.put("LISP", "Madeness");
		
		System.out.println(map.get("Java"));
		
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
	}
}
