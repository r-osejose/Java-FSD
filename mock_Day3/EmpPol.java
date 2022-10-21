package mock_Day3;

import java.util.Scanner;
abstract class Employee
{
    protected int employeeid;
    public int getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    protected String employeeName;
    protected double salary;
    
    public abstract void calculateSalary();
    
    public Employee(int employeeid,String employeeName)
    {
        this.employeeid=employeeid;
        this.employeeName=employeeName;
        
    }
}

class  PermenantEmployee extends Employee
{
    private double basicPay;

   public double getBasicPay() {
        return basicPay;
    }

   public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
    public PermenantEmployee(int employeeid,String employeeName,double basicPay)
    {
        super(employeeid,employeeName);
        this.basicPay=basicPay;
    }
    public void calculateSalary()
    {
        salary=basicPay-(basicPay*0.12);
    }
    
}
class TemporaryEmployee extends Employee
{
    private int hoursWorked;
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public int getHourlyWages() {
        return hourlyWages;
    }
    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }
    private int hourlyWages;
    public TemporaryEmployee(int employeeid,String employeeName,int hoursWorked,int hourlyWages)
    {
        super(employeeid,employeeName);
        this.hoursWorked=hoursWorked;
        this.hourlyWages=hourlyWages;
    }
    public void calculateSalary()
    {
        salary= hoursWorked*hourlyWages;
    }
}

class Loan
{
    public double calculateLoanAmount(Employee employeeObj)
    {
if(employeeObj instanceof TemporaryEmployee)
        return (10*(employeeObj.salary))/100;
return 10;
    }
}
public class EmpPol {

   public static void main(String[] args) {
        Loan l=new Loan();

       Scanner sc=new Scanner(System.in);
        System.out.println("1.Permenent employee");
        System.out.println("2.Temporary employee");
        System.out.println("Enter choice :");
        int c=sc.nextInt();
        switch(c)
        {
        case 1:    System.out.println("Enter employee id");
        int id=sc.nextInt();
        System.out.println("Enter employee name");
        String name=sc.next();
        System.out.println("Enter basic pay");
        double b=sc.nextDouble();
        PermenantEmployee p=new PermenantEmployee(id,name,b);
        p.calculateSalary();
         System.out.println(l.calculateLoanAmount(p));
        break;
        
        case 2:    System.out.println("Enter employee id");
        int id1=sc.nextInt();
        System.out.println("Enter employee name");
        String name1=sc.next();
        System.out.println("Enter hours worked");
        int h=sc.nextInt();
        System.out.println("Enter hourly wages");
        int h1=sc.nextInt();
        TemporaryEmployee p1=new TemporaryEmployee(id1,name1,h,h1);
        p1.calculateSalary();
        System.out.println(l.calculateLoanAmount(p1));
        break;
        default: System.out.println("Invalid");
        
        }
    }

}