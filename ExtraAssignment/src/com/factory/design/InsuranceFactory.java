package com.factory.design;

public class InsuranceFactory {

	public static Insurance getInsurance(String type) {
		if(type == null) {
			return null;
		}else if(type.equalsIgnoreCase("general")) {
			return new GeneralInsurance();
		}else if(type.equalsIgnoreCase("life")) {
			return new LifeInsurance();
		}
		throw new InsuranceTypeException("Invalide Insurance Type");
		
	}
}
