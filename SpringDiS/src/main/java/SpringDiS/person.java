package SpringDiS;

public class person {
    private String name;
    private String department;
    
    
     person(String name, String department) {
     this.name=name;
     this.department=department;
     }
        
    public void display()
    {
        System.out.println("My name is "+name+ " " +"from" +" " +department +" department.");
    }
}