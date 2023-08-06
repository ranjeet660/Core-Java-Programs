package com.arraylist.program;

import java.util.ArrayList;

public class RemoveElement {

	
  
    // Driver code
    public static void main(String args[])
    {
  
        // Get the ArrayList with duplicate values
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(2);
        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                           + list);
        ArrayList li = new ArrayList();
        for (int element : list) {
        	  
            // If this element is not present in newList
            // then add it
        	
            if (!li.contains(element)) {
            	
                li.add(element);
            }
        }
            System.out.println("ArrayList with duplicates removed: "
                    + li);
        
    }
}
