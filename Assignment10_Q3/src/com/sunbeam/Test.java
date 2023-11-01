package com.sunbeam;

public class Test {
	
	public static void printDisplayableBox(Box<? extends Displayable> b ) {
		b.get().display();
	}
	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
		}
	
	public static void main(String[] args) {
		
		Box<Person> b1 = new Box<>();
		b1.set(new Person("Hrutik",23));
		
		Box<Book> b2 = new Box<>();
		b2.set(new Book("Atlas",700.21));
		
		Box<Car> b3 = new Box<>();
		b3.set(new Car("Nano",200000));
		
		System.out.println();
		printDisplayableBox(b1);
		printAnyBox(b1);
		System.out.println();
		printDisplayableBox(b2);
		printAnyBox(b2);
		
		printAnyBox(b3);
		
	}

}
