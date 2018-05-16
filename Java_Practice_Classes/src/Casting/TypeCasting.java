package Casting;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		 int i=129;
		 long l =i;
		 byte b = (byte)i;
		 System.out.println(i);
		 System.out.println(l);
		 System.out.println(b);
		 
		 int i1=129;
		 long l1 =i;
		 byte b1 = (byte)i;
		 System.out.println(i1);
		 System.out.println(l1);
		 System.out.println(b1);
		 
		 for(int o=0; o<10; o++){
			 while(o==7){
				 System.out.println("while" +o);
				 
				
			 }
			 System.out.println("for" +o);
			 break;
		 }
		
	}

}
