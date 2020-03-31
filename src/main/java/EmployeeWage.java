public class EmployeeWage {
    //Checking employee is present or absent
    public static void employeeAttendance(int IS_EMP_PRESENT) {
        //getting 0 0r 1 using random function
        double empCheck=Math.floor(Math.random()*10)%2;
        if (empCheck == IS_EMP_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome To Employee Wage Computation");
        //Constants
        int IS_EMP_PRESENT=1;
        employeeAttendance(IS_EMP_PRESENT);
    }
}
