package MockTest; 

import java.util.Scanner; 


public class Candidate {
private String name;
public String getName() {    return name;
}
public void setName(String name) {    this.name = name;
}
public String getGender() {    return gender;
}
public void setGender(String gender) {    this.gender = gender;
}
public double getExpectedSalary() {    return expectedSalary;
}
public void setExpectedSalary(double expectedSalary) {    this.expectedSalary = expectedSalary;
}
private String gender;
private double expectedSalary; 


}
class main2
{        public static Candidate getCandidateDetails() throws InvalidSalaryException    {        Scanner sc =new Scanner(System.in);        System.out.println("Enter the candidate Details"); 


       System.out.println("Name");        String name = sc.next(); 


       System.out.println("Gender");        String gender = sc.next(); 


       System.out.println("Expected Salary");        double salary = sc.nextDouble();         candidate obj= new candidate();               if(salary<10000)        {            throw new InvalidSalaryException("Registration failed. salary cannot be less than 10000");                }        else {             obj.setName(name);                obj.setGender(gender);                obj.setExpectedSalary(salary);                return obj;        }    }    public static void main(String [] args)    {         try {            candidate obj = getCandidateDetails();            System.out.println("registration sucessful");        } catch (InvalidSalaryException e) {                        System.out.println(e.getMessage());        }    }
}
class InvalidSalaryException extends Exception
{    public InvalidSalaryException(String message)    {        super(message);            }
}

