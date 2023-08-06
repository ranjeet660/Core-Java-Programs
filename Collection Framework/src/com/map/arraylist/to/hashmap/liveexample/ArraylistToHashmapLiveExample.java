package com.map.arraylist.to.hashmap.liveexample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraylistToHashmapLiveExample {

	public static void main(String[] args) {
		//Creates arrayList and add the products
		List<String> computerAccessories = new ArrayList<String>();
		computerAccessories.add("Laptops");
		computerAccessories.add("Computers");
		computerAccessories.add("Telephones");
		
		List<String> electronics = new ArrayList<String>();
		electronics.add("Keyboards");
		electronics.add("Mouse");
		electronics.add("Printer");
		
		List<String> furniture = new ArrayList<String>();
		furniture.add("Bed");
		furniture.add("Chair");
		furniture.add("Sofa");
		
		//Creates LinkedHashMap and add Key as String(Heading) and Values as above ArrayList/Map class with generics
		Map<String,List<String>> mProduct = new LinkedHashMap<String,List<String>>();
		mProduct.put("Computer Asscssories", computerAccessories);
		mProduct.put("Electronics", electronics);
		mProduct.put("Furnitures", furniture);
		
		//Creates LinkedHashMap and add Key as String(E-Shop) and Values as above ArrayList/Map class with generics
		Map<String, Map<String,List<String>>> mShop = new LinkedHashMap<String,Map<String,List<String>>>();
		mShop.put("E-Shop", mProduct);
		
		Set<String> set = mShop.keySet();
		for(String str : set) {
			System.out.println(str);
			System.out.println(mShop.get(str));
		}
	}
}
