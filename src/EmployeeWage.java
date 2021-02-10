
public class EmployeeWage {
	
	
	public static void main(String Args[])
	{
		System.out.println("Welcome To Employee Wage Comptation System");
		Main m=new Main();
		int resultAttandence[] = m.attandenceCheck(0, 0);
		System.out.println("No of Days Presnent = "+resultAttandence[0]);
		System.out.println("No of Days Absent = "+resultAttandence[1]);
		int flag1 = m.fullAndPartTimeCheck();
		int wages[] = m.dailyWageComputation();
		System.out.println(wages[0]);
		System.out.println(wages[1]);
		m.wageCalculateCondition(resultAttandence[0],wages[0],wages[1]);
		
	
	}
}
	