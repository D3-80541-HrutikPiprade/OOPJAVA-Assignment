import java.util.Scanner;

public class TestDailyDivingCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DailyDrivingCost dailyDrivingCost = new DailyDrivingCost();
		
		System.out.print("Enter Total miles driven per day : ");
		dailyDrivingCost.setMilesPerDay(sc.nextDouble());
		System.out.print("Enter Cost per gallon of gasoline : ");
		dailyDrivingCost.setCostPerGallon(sc.nextDouble());
		System.out.print("Enter Average miles per gallon : ");
		dailyDrivingCost.setAvgPerGallon(sc.nextDouble());
		System.out.print("Enter Parking fee per day : ");
		dailyDrivingCost.setParkingPerDay(sc.nextDouble());
		System.out.print("Enter Tolls per day : ");
		dailyDrivingCost.setTollsPerDay(sc.nextDouble());
		
		dailyDrivingCost.displayCostPerDay();
	}

}
