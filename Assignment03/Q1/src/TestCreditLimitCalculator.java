import java.util.Scanner;

public class TestCreditLimitCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
		
		System.out.print("Enter the account No : ");
		creditLimitCalculator.setAccno(sc.nextInt());
		System.out.print("Enter the pending balance at the beginning of the month : ");
		creditLimitCalculator.setPendingBal(sc.nextInt());
		System.out.print("Enter Total of all items charged by the customer this month : ");
		creditLimitCalculator.setItemsCharged(sc.nextInt());
		System.out.print("Enter total of all credits applied to the customer's account this month : ");
		creditLimitCalculator.setCreditApplied(sc.nextInt());
		System.out.print("Enter allowed credit Limit : ");
		creditLimitCalculator.setCreditAllowed(sc.nextInt());
		
		creditLimitCalculator.displayBalance();
		
	}

}
