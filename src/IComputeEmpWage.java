
public interface IComputeEmpWage {
	public void addCompanyEmpWage(int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH,
			String COMPANY_NAME);

	public void calcEmpWageFor();

	public int getTotalWage(String company);

}
