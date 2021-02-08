
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
		int dailyWage = wagePerHour*fullDayHours;
		System.out.println("Full time Employee Daily Wage is : "+dailyWage);
		int dailyWagePart=wagePerHourPart*fullDayHourPart;
		System.out.println("Part Time Employee daily Wage : "+dailyWagePart);
		int partTimeHours=presentCounter*4;
		int fullTimeHours=presentCounter*8;
		int finalFullTimeWage=0;
		int check=0;
		if(flag==1)
		{
			if(fullTimeHours >=100 || presentCounter >= 20)
			{
				finalFullTimeWage=dailyWage*presentCounter;
				System.out.println("Final wage of this Full time Employee : "+finalFullTimeWage);
				check=1;
			}
		}
		else if (flag==0)
		{
			if(partTimeHours >=50 || presentCounter >= 20)
			{
				int finalPartTimeWage=dailyWagePart*presentCounter;
				System.out.println("Fianl Wage of this Part time employee : "+finalPartTimeWage);
				check=1;
				
			}
			
		}
	 if (check==0)   {
			System.out.println("Minimum WorKing Hours or Days not reached");
	 }	
		
	}
}
