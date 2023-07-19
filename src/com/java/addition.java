package com.java;

class addition {
public static int add(int a,int b) {
	return a+b;
}	
	
public static int add(int a,int b,int c) {
	return a+b+c;
}	

public static void main(String[] args) {
	addition a=new addition();
	int t=a.add(3, 5);
	System.out.println(t);
	System.out.println(add(4,5));
	System.out.println(add(3,5,9));

}
}

