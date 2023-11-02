package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		
		list.add("Hrutik");
		list.add("Piprade");
		list.add("Sunbeam");
		list.add("Pune");
		list.add("Maregaon");
		
		for(String ele : list)
			System.out.println(ele.toString());
		
		
		
		String max = Collections.max(list,new MaxLengthComparator());
		System.out.println("Max : "+ max);
	}

}
