import java.util.*;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		Main companies_List[] = new Main[10];

		System.out.println("Enter number of companies");
		Scanner sc = new Scanner(System.in);
		int no_Of_Companies = sc.nextInt();
		for (int i = 0; i < no_Of_Companies; i++) {
			System.out.println("Enter employee hrs");
			int emp_Hrs = sc.nextInt();
			System.out.println("Enter work hours");
			int wrk_Hrs = sc.nextInt();
			System.out.println("Enter hours per month");
			int hrs_Month = sc.nextInt();
			System.out.println("Enter Company name");
			String cmp_Name = sc.next();
			companies_List[i] = new Main(emp_Hrs, wrk_Hrs, hrs_Month, cmp_Name);
			companies_List[i].calcEmpWageFor();
			companies_List[i].toString();
		}
	}
}
