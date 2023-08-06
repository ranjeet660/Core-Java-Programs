package com.comparable;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private String city;
	private long salary;
	
	public Student(int id, String name, String city, long salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Student scity) {
		
		return getCity().compareTo(scity.getCity());
	}

//	@Override
//	public int compareTo(Student s_salary) {
//		if(getSalary() == s_salary.getSalary())
//			return 0;
//		else if (getSalary() > s_salary.getSalary())
//			return 1;
//		else;
//			return -1;
//	}

//	@Override
//	public int compareTo(Student sname) {
//		
//		return getName().compareTo(sname.getName());
//	}
	
	
	
}
