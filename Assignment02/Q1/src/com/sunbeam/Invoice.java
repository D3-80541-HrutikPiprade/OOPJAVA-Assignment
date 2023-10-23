package com.sunbeam;

public class Invoice {
	private String partNo;
	private String partDesc;
	private int partQty;
	private double partPrice;
	
	public Invoice() {
		this.partNo = "A1";
		this.partDesc = "Description";
		this.partQty = 0;
		this.partPrice = 0.0;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getPartQty() {
		return partQty;
	}

	public void setPartQty(int partQty) {
		this.partQty = partQty;
	}

	public double getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}
	
	public double calculateInvoice()
	{
		double amount;
		if(partQty<0)
		{
			partQty=0;
		}
		
		if(partPrice<0)
		{
			partPrice=0;
		}
		amount= partPrice * partQty;
		return amount;
		
	}
	
	
	
}
