package com.sunbeam;

public class TestEmp {

	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		
		employees[0] = new SalariedEmployee("hrutik", "Piprade", 1001, 10000);
		employees[1] = new HourlyEmployee("abc", "xyz",1002, 500, 45);
		employees[2] = new CommissionEmployee("pqr", "abc", 1003, 10000, 5);
		employees[3] = new BasePlusCommissionEmployee("xyz", "pqr", 1004, 10000, 4, 5000);
		
		for(Employee e : employees)
		{
			if(e instanceof BasePlusCommissionEmployee)
			{
				BasePlusCommissionEmployee emp = (BasePlusCommissionEmployee)e;
				 emp.TotalAmt();
			}
		}
			
		
		

	}

}
