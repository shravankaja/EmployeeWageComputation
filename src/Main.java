
public class Main {

	public final int EMP_RATE_PER_HR;
	public final int NUM_OF_WORKING_DAYS;
	public final int MAX_HRS_IN_MONTH;
	public final String COMPANY_NAME;
	public int totalEmpWage;

	public Main(int emp_hrs, int work_hrs, int hrs_month, String company) {
		this.EMP_RATE_PER_HR = emp_hrs;
		this.NUM_OF_WORKING_DAYS = work_hrs;
		this.MAX_HRS_IN_MONTH = hrs_month;
		this.COMPANY_NAME = company;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return " Total Employee Wage" + COMPANY_NAME + " : " + totalEmpWage;
	}

}
