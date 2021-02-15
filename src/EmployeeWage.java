import java.util.*;

public class EmployeeWage implements IComputeEmpWage {
	final static int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private int numofCompany = 0;
	private LinkedList<Main> cmpEmpWageArray;

	public EmployeeWage() {

		cmpEmpWageArray = new LinkedList<>();
	}

	private void addCompanyEmpWage(int emp_hrs, int work_hrs, int hrs_month, String company) {
		Main companyEmpWage = new Main(emp_hrs, work_hrs, hrs_month, company);
		cmpEmpWageArray.add(companyEmpWage);
	}

	private void calcEmpWageFor() {
		for (int i = 0; i < cmpEmpWageArray.size(); i++) {
			Main companyEmpWage = cmpEmpWageArray.get(i);
			companyEmpWage.setTotalEmpWage(this.calcEmpWageFor(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	private int calcEmpWageFor(Main m) {
		int empHrs = 0, empWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs < m.MAX_HRS_IN_MONTH && totalWorkingDays < m.NUM_OF_WORKING_DAYS) {
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
		return totalEmpHrs = totalEmpHrs * m.EMP_RATE_PER_HR;

	}

	public static void main(String[] args) {
		EmployeeWage obj1 = new EmployeeWage();
		obj1.addCompanyEmpWage(10, 20, 30, "Dmart");
		obj1.calcEmpWageFor();
	}

}
