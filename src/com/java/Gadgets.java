package com.java;
//import java.util.Scanner;
public class Gadgets {
	private void gadgets_Details() {//no argument
System.out.println("Gadjets");
	}

	private void gadgets_Details(String name) {//dataype
		System.out.println("Enter the name:"+name);
			}
	private void gadgets_Details(byte id,int amount) {//dataype count
		System.out.println("Enter the ID:"+id);
		System.out.println("Enter the amount:"+amount);
			}
	private void gadgets_Details(long mobile,String address) {//dataype order
		System.out.println("Enter the number:"+mobile);
		System.out.println("Enter the address:"+address);
			}
	public static void main(String[] args) {
		
		Gadgets gt=new Gadgets();
		gt.gadgets_Details();
		gt.gadgets_Details("Mobile");
		gt.gadgets_Details((byte)12, 50000);
		gt.gadgets_Details(876543211l,"Chennai" );
		
		
		
	}
	
}
