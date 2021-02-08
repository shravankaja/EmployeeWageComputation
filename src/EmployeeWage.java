
public class EmployeeWage {
	public static void main(String Args[])
	{
		System.out.println("Welcome To Employee Wage Comptation System");
		int presentCounter=0;
		int absentCounter=0;
		int wagePerHour=20;
		int fullDayHours=8;
		for(int i=0; i<20 ;i++)
		{
		int rand=1;
		float empCheck = Math.round(Math.random());
		if(empCheck==0.0)
		{
			presentCounter++;
		}
		else
		{
			absentCounter++;
		}
		}
		System.out.println("No of Days Presnent = "+presentCounter);
		System.out.println("No of Days Absent = "+absentCounter);
		int totalWage = (wagePerHour*fullDayHours)*presentCounter;
		System.out.println("Total Wage is : "+totalWage);
	}

}
