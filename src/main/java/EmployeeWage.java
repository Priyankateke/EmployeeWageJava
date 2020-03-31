public class EmployeeWage {
    //Constants
    public static final int IS_FULL_TIME=1;
    public static final int EMP_RATE_PER_HOURS=20;

    //Checking employee is present or absent
    public static void calculateDailyEmployeeWage() {
        //Initializing variables
        int empHrs=0;
        int empWage=0;

        //getting 0 0r 1 using random function
        double empCheck=Math.floor(Math.random()*10)%2;

        if (empCheck == IS_FULL_TIME)
            empHrs=8;

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
