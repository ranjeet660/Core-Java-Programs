package com.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.studentName.compareTo(stu2.studentName);			//It gives Ascending order by Name
		//return stu2.studentName.compareTo(stu1.studentName);			//It gives Descending order by Name
	}

}
