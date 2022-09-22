package Sep20;

class Student {
	int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "Rajagiri";
    }  
    //constructor to initialize the variable  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){
    	System.out.println(rollno+" "+name+" "+college);
    	}  
    public class Staticvariable {
        public static void main (String[] args) {
            Student.change();
            
            Student s1 = new Student(1, "Rose");
            Student s2 = new Student(2, "Sona");
            Student s3 = new Student(3,"Rusafid");
            
            s1.display();
            s2.display();
            s3.display();
        }
    }
}

