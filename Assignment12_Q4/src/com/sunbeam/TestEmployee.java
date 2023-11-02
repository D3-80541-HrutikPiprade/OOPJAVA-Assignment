package com.sunbeam;

import java.util.PriorityQueue;

public class TestEmployee {

	public static void main(String[] args) {
		PriorityQueue<Employee> emps = new PriorityQueue<Employee>();
		emps.offer(new Employee(5,"hrutik",1000));
		emps.offer(new Employee(3,"piprade",4000));
		emps.offer(new Employee(6,"kunal",3000));
		emps.offer(new Employee(2,"hrutikp",2000));

		while(!emps.isEmpty())
		{
			Employee p = emps.poll();
			System.out.println("Popped - "+ p);
		}
	}

}
