package com.assignment_15;

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
		Policy policy = new Policy();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter policy id: ");
		policyId = scanner.nextInt();
		System.out.println("Enter Policy name: ");
		policyName = scanner.next();
		System.out.println("Enter policy type: ");
		policyType = scanner.next();
		System.out.println("Enter premium amount: ");
		premiumAmount = scanner.nextLong();
		//Value set
		policy.setPolicyId(policyId);
		policy.setPolicyName(policyName);
		policy.setPolicyType(policyType);
		policy.setPremiumAmount(premiumAmount);
		//Values get
		System.out.println("Policy id "+ policy.getPolicyId());
		System.out.println("policy name "+ policy.getPolicyName());
		System.out.println("policy type "+ policy.getPolicyType());
		System.out.println("premium amount "+ policy.getPremiumAmount());
		return policy;
	}
	
	public static void main(String[] args) {
		Policy poli = new Policy();
		poli.getPolicyDetails();
		
	}
}
