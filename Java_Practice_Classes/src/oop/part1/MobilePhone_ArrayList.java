package oop.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone_ArrayList {
	
	private ArrayList<Contact> contacts;
	
	public void storeContacts(Contact contact){
		
		if(contacts.indexOf(contact)>=0){
			System.out.println("contact alreadyy exists");
		}
		else{
		contacts.add(contact);}
	}
	
	public long findContact(String contactName){
		
		for(int i=0;i<contacts.size(); i++){
			if(contacts.get(i).getName().equals(contactName)){
				return contacts.get(i).getPhoneNumber();
			}
		}
		
		System.out.println("contact does not exist");
		return 0;
	}
	
	public void modifyContact(Contact contact, Contact newContact){
		int j=0;
		
		
			if(contacts.contains(contact)){
				j= contacts.indexOf(contact);
				contacts.set(j, newContact);
			}
			
		System.out.println("contact cannot be changed");
		
	}
	
	public void removeContact(Contact contact){
		
		if(contacts.contains(contact)){
			
			contacts.remove(contact);
			System.out.println(contact.getName() + "was deleted");}
		
		System.out.println("contact not found");
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter contact");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("enter contact number");
		Scanner scan1 = new Scanner(System.in);
		long number =  (long)(Integer.valueOf(scan.nextLine()));
		Contact contact = new Contact();
		contact.setName(name);
		contact.setPhoneNumber(number);
		
		MobilePhone_ArrayList mob = new MobilePhone_ArrayList();
		mob.storeContacts(contact);
		
	}
}

class Contact{
	
	private String name;
	private long phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}