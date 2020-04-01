public class EmployeeWage {
    //Constants
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_RATE_PER_HOURS=20;
    public static final int NUM_OF_WORKING_DAYS=20;

    //Checking employee is present or absent
    public static void calculateWagesForMonth() {
        //Initializing variables
        int empHrs=0;
        int empWage=0;
        int dayCount;
        double perDaySalary, totalSalary=0;

        for( dayCount=1; dayCount<=NUM_OF_WORKING_DAYS;dayCount++ )
        {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }

            //calculating employee wages for month
            perDaySalary = empHrs * EMP_RATE_PER_HOURS;
            totalSalary=totalSalary+perDaySalary;
        }
        System.out.println("Monthly Employee wages : " + totalSalary);
    }
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome To Employee Wage Computation");
        calculateWagesForMonth();
    }
}
