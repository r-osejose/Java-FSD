package Day3;
class member
{
    String name;
    int age;
    String phone;
    String address;
    int salary;
    
    public void printsalary()
    {
        System.out.println("Salary is:" +salary);
    }
}

class employee extends member
{
    String specialization;
    
}
class manager extends member
{
    String department;
    
}

public class Pgm2 {
    public static void main(String args[])
    {
        employee emp = new employee();
        emp.name= "Rose";
        emp.age= 22;
        emp.phone="7035718921";
        emp.address="xyz";
        emp.salary=23000;
        emp.printsalary();
        
        manager mng = new manager();
        mng.name= "Sona";
        mng.age= 26;
        mng.phone="8905346712";
        mng.address="abc";
        mng.salary=55000;
        
        
    }



}
