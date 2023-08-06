package com.arraylist.programming;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private String city;
	
	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Student stu) {
		if(id == stu.id) {
			return 0;
		}else if(id > stu.id) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}
