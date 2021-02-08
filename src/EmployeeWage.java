
public class EmployeeWage {
	public static void main(String Args[])
	{
		System.out.println("Welcome To Employee Wage Comptation System");
		int presentCounter=0;
		int absentCounter=0;	
		int wagePerHour=20;
		int fullDayHours=8;
		for(int i=0; i<30 ;i++)
		{
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
		
		long empType = Math.round(Math.random());
		int flag=1;
		if(empType==0)
		{
			flag=0;
		}
		int wagePerHourPart=8;
		int fullDayHourPart=4;
		
		switch(flag) {
		
		case 0:
			System.out.println("Employee is Part Time");
		break;
		case 1:
			System.out.println("Employee is Full Time");
		break;
		}
		
		}

}
