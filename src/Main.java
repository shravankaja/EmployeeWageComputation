
public class Main {
	int dailyWage=0;
	int dailyWagePart=0;
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOURS=8;
	public static final int WAGE_PER_HOUR_PART=8;
	public static final int FULL_DAY_HOURS_PART=4;
	int flag=1;
	int presentConter=0;
	int absentConter=0;
	int ar[] = new int[2];
	int[] attandenceCheck  (int presentCounter , int absentCounter)
			{
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
				return new int[] {presentCounter,absentCounter};
			}
	int fullAndPartTimeCheck()
		{
			long empType = Math.round(Math.random());
			if(empType==0.0)
				{
					flag=0;
				}
			switch(flag) {
				case 0:
						System.out.println("Employee is Part Time");
						break;
				case 1:
						System.out.println("Employee is Full Time");
						break;
		     			}
			return flag;
		}
	
	int[] dailyWageComputation()
		{
			int dailyWage = WAGE_PER_HOUR*FULL_DAY_HOURS;
			int dailyWagePart=WAGE_PER_HOUR_PART*FULL_DAY_HOURS_PART;
			System.out.println("Full Time Employee Wage is : "+dailyWage);
			System.out.println("Full Time Employee Wage is : "+dailyWagePart);
			return new int[] {dailyWage,dailyWagePart}; 
		}
	
	void wageCalculateCondition(int presentCounter,int dailyWage, int dailyWagePart)
		{
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
			else if ( flag == 0)
				{
					if(partTimeHours >=50 || presentCounter >= 20)
						{
							int finalPartTimeWage=dailyWagePart*presentCounter;
							System.out.println("Fianl Wage of this Part time employee : "+finalPartTimeWage);
							check=1;
				
						}
			
				}
			if (check==0)   
				{
					System.out.println("Minimum WorKing Hours or Days not reached");
				}	

	}
}