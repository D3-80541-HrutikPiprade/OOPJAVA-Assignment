import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Given Number : " + n);
		System.out.println("Binary Equivalent : " + Integer.toBinaryString(n));
		System.out.println("Octal Equivalent : " + Integer.toOctalString(n));
		System.out.println("Hexadecimal Equivalent : " + Integer.toHexString(n));
	}
}
