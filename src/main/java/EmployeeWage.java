public class EmployeeWage {
    //Constants
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_RATE_PER_HOURS=20;

    //Checking employee is present or absent
    public static void calculateDailyEmployeeWage() {
        //Initializing variables
        int empHrs=0;
        int empWage=0;

        double empCheck=Math.floor(Math.random()*10)%3;

        if (empCheck == IS_FULL_TIME)
            empHrs=8;
        else if (empCheck == IS_PART_TIME)
            empHrs=4;

        //calculating daily employee wage
        empWage=empHrs * EMP_RATE_PER_HOURS;
        System.out.println("Daily Employee wage : " + empWage);
    }
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome To Employee Wage Computation");
        calculateDailyEmployeeWage();
    }
}
