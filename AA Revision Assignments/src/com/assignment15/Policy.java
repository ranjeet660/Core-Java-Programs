//1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
//1.2 Design the below method into Policy class and which return the policy object
//    public Policy getPolicyDetails() 
//1.3 Input should be taken from user and print that data into getPolicyDetails () method.


package com.assignment15;

import java.util.Scanner;

public class Policy {

	private int policyId;
	private String policyName;
	private String policyType;
	private long premiumAmount;
	
	
	
	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public long getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Policy getPolicyDetails() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Policy id");
		policyId = scanner.nextInt();
		System.out.println("Enter policy name");
		policyName = scanner.next();
		System.out.println("Enter policy type");
		policyType = scanner.next();
		System.out.println("Enter premium amount");
		premiumAmount = scanner.nextLong();
		
		Policy policy = new Policy();
		policy.setPolicyId(policyId);
		policy.setPolicyName(policyName);
		policy.setPolicyType(policyType);
		policy.setPremiumAmount(premiumAmount);
		
		return policy;
	}
	
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}

	public static void main(String[] args) {
		Policy policy = new Policy();
		Policy pol = policy.getPolicyDetails();
		System.out.println("Policy details: ");
		System.out.println(pol);
	}
}
