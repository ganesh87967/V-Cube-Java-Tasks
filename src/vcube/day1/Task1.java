package vcube.day1;

public class Task1 {
	
	 Integer salary= 5000;
     double MonthlyGST= 5000*0.3;
	 double MonthlyPF = 5000*0.2;
	 double MonthlyAllowences = 5000*0.2;
	 double NetMonthlySalary= salary-(MonthlyGST + MonthlyPF )+MonthlyAllowences ;
	
	 double YearlySalary=salary*12;
	 double YearlyGST=MonthlyGST*12;
	 double YearlyPF=MonthlyPF*12;
	 double YearlyAllowences=MonthlyAllowences*12;
	 double NetYearlySalary=NetMonthlySalary*12;
	 static {
	 Task1 A1=new Task1();
		System.out.println("Monthly Salary:"+ A1.salary );
		System.out.println("Monthly GST:"+ A1.MonthlyGST );
		System.out.println("Monthly PF:"+ A1.MonthlyPF );
		System.out.println("Monthly Allowences:"+A1.MonthlyAllowences );
		System.out.println("Net Monthly Salary:"+ A1.NetMonthlySalary );
		
		//Yearly salary details	
		System.out.println("Yearly Salary:"+A1.YearlySalary);
		System.out.println("Yearly GST:"+A1.YearlyGST);
		System.out.println("Yearly PF:"+A1.YearlyPF);
		System.out.println("Yearly Allowences:"+A1.YearlyAllowences);
		System.out.println("Net Yearly Salary::"+A1.NetYearlySalary);

	 }


	static void main(String[]args) {
		
	}
	

}


