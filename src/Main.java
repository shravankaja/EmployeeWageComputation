public class Main {

        final static int IS_FULL_TIME = 1, IS_PART_TIME = 2;
        private final int EMP_RATE_PER_HR ;
        private final int NUM_OF_WORKING_DAYS;
        private final int MAX_HRS_IN_MONTH;
        public final String COMPANY_NAME;

        public Main(int emp_hrs, int work_hrs, int hrs_month, String company)
                                {
                                        this.EMP_RATE_PER_HR = emp_hrs;
                                        this.NUM_OF_WORKING_DAYS = work_hrs;
                                        this.MAX_HRS_IN_MONTH = hrs_month;
                                        this.COMPANY_NAME = company;
                                }
        public  void calcEmpWageFor()
                                {
                                int totalEmpWage = 0, empHrs = 0, empWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                                while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
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
                                System.out.println("\nDAY#: "+  totalWorkingDays + "EmpHr:" + empHrs);
                        }
                                totalEmpWage = totalEmpHrs +  EMP_RATE_PER_HR;

                                System.out.println(COMPANY_NAME+" Total Employee Wage : "+ totalEmpWage);

                                }

}


