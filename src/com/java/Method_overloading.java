package com.java;
import java.util.Scanner;
public class Method_overloading {

	int userid=105;
	int pswd=124;
	 static int uid;
	 static int pswd1;
	 static Scanner sc=new Scanner(System.in);
	private void user() {
		System.out.println("enter the user name");
	String username=sc.next();	
    System.out.println("Welcome"+ " "+username);
    }
	private  void login(int uid,int pswd1) {
		
			
    if(userid==uid)
    {
    	System.out.println("enter the pswd");
		pswd1=sc.nextInt();
    	if(pswd==pswd1)
    	{
    		System.out.println("Login");
    		
    	}
    	
    	else
    	{
    		System.out.println("pwd did not match");
    	}
    }
    else
    {
    	System.out.println("Invalid user");
    }
    }
	private void login(int uid) {
		 if(userid!=uid)
     {
    	 System.out.println("guest");
    	 
     }
     
	}
	
	public static void main(String[] args) {
		Method_overloading mo=new Method_overloading();
		mo.user();
		System.out.println("enter the userid");
		 uid=sc.nextInt();
		 
		 mo.login(uid);
		 
		mo.login(uid, pswd1);
		
	}
}
