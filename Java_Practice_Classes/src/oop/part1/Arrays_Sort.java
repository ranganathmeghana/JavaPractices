package oop.part1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Sort {

	
	public int[] getIntergers(){
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i=0;i< array.length;i++){
			array[i]= scan.nextInt();
			
		}
	return array;
	}
	
	public void printArrays(int[] arrayPrint){
		
	for(int i=0;i<arrayPrint.length;i++){
		
		System.out.println(String.valueOf((arrayPrint[i])));
	}
		
	}
	
	public void sortIntegers(int[] array){
		
		int[] array2= new int[array.length];
		
		for(int i=0; i< array.length; i++){
			array2[i]=array[i];
		}
		
		//Arrays.sort(array2);
		
		/*for(int i=0; i<array2.length; i++){
			
			int temp=0;
			for(int j=i+1; j<array2.length; j++){
				
				if(array2[i]> array[j]){
					
					temp= array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
					
				}
			}
		}*/
		boolean flag = true;
		int temp;
		while(flag){
			flag=false;
			for(int i=0; i< array2.length -1; i++){
				

				if(array2[i]<array2[i+1]){
					
					temp= array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = temp;
					flag=true;
				}
			}
			
		}
		
		printArrays(array2);
	}


	public static void main(String[] args) {
		
		 Arrays_Sort obj = new Arrays_Sort();
		 obj.sortIntegers(obj.getIntergers());
	}
}
