import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. Idli");
		System.out.println("4. Poha");
		System.out.println("5. Kachori");
		System.out.println("6. GENERATE BILL");
		
		int choice,bill=0,qty=0;
		while(true)
		{
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Quantity : ");
				qty= sc.nextInt();
				bill= bill + 50*qty;
				break;
			case 2:
				System.out.println("Enter Quantity : ");
				qty= sc.nextInt();
				bill= bill + 20*qty;
				break;
			case 3:
				System.out.println("Enter Quantity : ");
				qty= sc.nextInt();
				bill= bill + 30*qty;
				break;
			case 4:
				System.out.println("Enter Quantity : ");
				qty= sc.nextInt();
				bill= bill + 25*qty;
				break;
			case 5:
				System.out.println("Enter Quantity : ");
				qty= sc.nextInt();
				bill= bill + 15*qty;
				break;
			case 6:
				System.out.println("------------------------");
				System.out.println("Total Bill : "+ bill);
				System.out.println("------------------------");
				System.exit(0);
				break;

			default:
				System.out.println("Enter valid choice !!");
				break;
			}
		}
		

	}

}
