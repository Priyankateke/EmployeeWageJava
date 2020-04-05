import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWage {

    ArrayList<EmployeeWageBuilder> empDetails=new ArrayList<EmployeeWageBuilder>();

    public void empWageDetails(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
        empDetails.add(new EmployeeWageBuilder(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth));
        EmployeeWageBuilder employeeWageBuilder=empDetails.get(empDetails.size()-1);
        employeeWageBuilder.calculateEmployeeWageForCompany();
    }

    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome To Employee Wage Computation");
        EmployeeWage employeeWage=new EmployeeWage();
        employeeWage.empWageDetails("DMart",30,20,100);
        employeeWage.empWageDetails("Reliance",40,30,150);
    }
}
