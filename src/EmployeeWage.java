public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		Main dmartCompany = new Main(10, 20, 30, "Dmart");
		dmartCompany.calcEmpWageFor();
		Main nikeCompany = new Main(20, 40, 50, "Nike");
		nikeCompany.calcEmpWageFor();

	}
}
