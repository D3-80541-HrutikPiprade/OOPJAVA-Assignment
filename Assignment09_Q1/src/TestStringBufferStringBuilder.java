
public class TestStringBufferStringBuilder {

	public static void main(String[] args) {
		/*
		 //Q1
		StringBuffer s1 = new StringBuffer("Sunbeam");
		StringBuffer s2 = new StringBuffer("Sunbeam");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false - equals() and hashCode() method is not overridden inside it.

		
		//Q2
		StringBuffer s1 = new StringBuffer("Sunbeam");
		String s2 = new String("Sunbeam");
		System.out.println(s1 == s2); // ERROR
		System.out.println(s1.equals(s2)); // false
		
		
		
		//Q3
		String s1 = new String("Sunbeam");
		StringBuffer s2 = new StringBuffer("Sunbeam");
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s2.toString())); // true 
		
		
		//Q4
		StringBuffer s1 = new StringBuffer("Sunbeam");
		StringBuffer s2 = s1.reverse();
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
		
		
		//Q5
		StringBuilder s1 = new StringBuilder("Sunbeam");
		StringBuilder s2 = new StringBuilder("Sunbeam");
		System.out.println(s1 == s2); // false 
		System.out.println(s1.equals(s2)); // false - equals() and hashCode() method is not overridden inside it.
		*/
		
		//Q6
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34, 32
		

	}

}
