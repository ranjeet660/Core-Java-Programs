package com.functional.interfacee;

//Function Interface is used to contain Only one abstract method in interface 
//For achive functional interface we can use @FunctionalInterface
@FunctionalInterface
public interface Demo {

	void show(String str);
	//void x1();		//@FunctionalInterface it contain only one abstract method

}
