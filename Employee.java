/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age >= 16) {
            System.out.println("You have the right to drive.");
            return true;
        }
        else{
            System.out.println("You have to wait " + (16 - age)
                               + " year(s) before you can drive.");
            return false;
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        this.unpaidHours = unpaidHours;
        double taxes = (30 / 100);
        double pay = ((unpaidHours * hourlyWage) -
                       ((unpaidHours * hourlyWage) * taxes));
        return pay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double hours = calculatePay();
        System.out.println(fullname + " has received a wire transfer of " 
                            + hours + " CAD.");
        unpaidHours = 0.0;
    }
    
     public void setName(String name)
    {
        fullname = name;
    }
    
    public double getHourlyWage()
    {
        return hourlyWage;
    }
}