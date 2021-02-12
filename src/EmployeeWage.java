

public class EmployeeWage {

	final static int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private static final int EMP_RATE_PER_HR = 8;
	private static final int NUM_OF_WORKING_DAYS = 22;
	private static final int MAX_HRS_IN_MONTH = 100;
	public static final String COMPANY_NAME = "Dmart";

	public static void calcEmpWageFor() {
		int totalEmpWage = 0, empHrs = 0, empWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) (Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 4;
				break;
			default:
				empWage = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("\nDAY#: " + totalWorkingDays + "EmpHr:" + empHrs);
		}
		totalEmpWage = totalEmpHrs + EMP_RATE_PER_HR;

		System.out.println(COMPANY_NAME + " Total Employee Wage : " + totalEmpWage);

	}

	public static void main(String Args[]) {
		calcEmpWageFor();
	}
}
