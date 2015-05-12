package com.learning.general;

public class ConstructorEx {
	int id;
	String Name;
	
	ConstructorEx(){
		System.out.println("constructor will assign the null and 0 value by default to datatype if not intialize");
	}
	void display(){
		System.out.println(id+"----"+Name);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx c1 = new ConstructorEx();
		ConstructorEx c2 = new ConstructorEx();
		c1.display();
		c2.display();
		

	}

}
