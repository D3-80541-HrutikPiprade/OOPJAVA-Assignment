import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values : ");
		if(sc.hasNextDouble())
		{
			double a = sc.nextDouble();
			if(sc.hasNextDouble())
			{
				double b = sc.nextDouble();
				double avg = (a+b)/2;
				System.out.println("Average = " + avg);
			}
			else
			{
				System.out.println("ERROR : Not a Double value !!");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("ERROR : Not a Double value !!");
			System.exit(0);
		}
	}

}
