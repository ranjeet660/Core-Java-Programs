package com.comparable;

public class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	int salary;
	
	public Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//Sorting based on Employee Name
	
//	@Override
//	public int compareTo(Employee emp) {
//		//return empName.compareTo(emp.empName);				//It gives Ascending order by name
//		return emp.empName.compareTo(empName);					//It gives Descending order by Name
//	}
	
	
	//Sorting based on id
	
	@Override
	public int compareTo(Employee emp) {
		if(empId == emp.empId) {
			return 0;
		}else if(empId > emp.empId) {		//It gives Ascending order  if will <(Less Than) then Descending order will arise 
			return 1;
		}else {
			return -1;
		}
	}
	
	//Sorting based on salary
	
//	@Override
//	public int compareTo(Employee emp) {
//		if(salary == emp.salary) {
//			return 0;
//		}else if(salary > emp.salary) {
//			return 1;
//		}else {
//			return -1;
//		}
//	}
	
	
}
