package com.assignment12.question3;

import java.util.Scanner;

public class Insurrance {

	int id;
	String personName;
	String insuranceCompany;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	void getInsuranceDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id: ");
		id = scanner.nextInt();
		System.out.println("Enter person name");
		personName = scanner.next();
		System.out.println("Enter insurance Company");
		insuranceCompany = scanner.next();
		
		
		setId(id);
		setPersonName(personName);
		setInsuranceCompany(insuranceCompany);
	}
	
		void getInsuranceInformation() {
			
			System.out.println("Insurance id is: "+ getId());
			System.out.println("Insurance person name: "+ getPersonName());
			System.out.println("Insurance company: "+ getInsuranceCompany());
		}
	
}
