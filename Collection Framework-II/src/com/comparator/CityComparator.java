package com.comparator;

import java.util.Comparator;

public class CityComparator implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {		
		return stud1.city.compareTo(stud2.city);
	}

	
}