
public class DailyDrivingCost {
	
	private double milesPerDay;
	private double costPerGallon;
	private double avgPerGallon;
	private double parkingPerDay;
	private double tollsPerDay;
	
	public DailyDrivingCost() {
		this.milesPerDay = 0;
		this.costPerGallon = 0;
		this.avgPerGallon = 0;
		this.parkingPerDay = 0;
		this.tollsPerDay = 0;
	}

	public double getMilesPerDay() {
		return milesPerDay;
	}

	public void setMilesPerDay(double milesPerDay) {
		this.milesPerDay = milesPerDay;
	}

	public double getCostPerGallon() {
		return costPerGallon;
	}

	public void setCostPerGallon(double costPerGallon) {
		this.costPerGallon = costPerGallon;
	}

	public double getAvgPerGallon() {
		return avgPerGallon;
	}

	public void setAvgPerGallon(double avgPerGallon) {
		this.avgPerGallon = avgPerGallon;
	}

	public double getParkingPerDay() {
		return parkingPerDay;
	}

	public void setParkingPerDay(double parkingPerDay) {
		this.parkingPerDay = parkingPerDay;
	}

	public double getTollsPerDay() {
		return tollsPerDay;
	}

	public void setTollsPerDay(double tollsPerDay) {
		this.tollsPerDay = tollsPerDay;
	}
	
	public void displayCostPerDay()
	{
		double cost = ((milesPerDay/avgPerGallon)*costPerGallon) + parkingPerDay + tollsPerDay;
		System.out.println("------------------------------------");
		System.out.println("Cost per day of Driving : "+ cost );
		System.out.println("------------------------------------");

	}
	
	

}
