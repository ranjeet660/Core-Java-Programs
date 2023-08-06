package com.object.returns;

public class Demo {

	int id = 2;
	String name = "Ranjeet";
	String city = "Kolhapur";
	
	
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Demo getDetails() {
		Demo demo = new Demo();
		System.out.println(demo);
		return demo;
	}
	
	public static void main(String[] args) {
		 Demo demo12= new Demo();
			 demo12.getDetails();
	}
}
