package Mock_day5;
import java.util.Scanner;
class User
{
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    private String username;
    private String password;
    public User(int id,String username,String password)
    {
        this.id=id;
        this.password=password;
        this.username=username;
    }
}
class UserBO
{
    public User[] getUsers()
    {
        User[] Users=new User[]{new User(1, "Louis", "rxfsuzA2345"),new User(2, "Messie", "hppphmf1"),new User(3, "Steve", "opefKt")};
        return (Users);
        
    }
    public String encryptPassword(String password)
    {
        String bar="";
        for (char c : password.toCharArray()) {
               bar += Character.toString((char)(c+1));
            }return(bar);
    }
    boolean validate(String username,String password)
    {
        User []a=getUsers();
        
        for(int i=0;i<a.length;i++)
        {
            
            if(username.compareTo(a[i].getUsername().toString())==0 && encryptPassword( password).compareTo(a[i].getPassword().toString())==0)
            {            
                    return true;
            }            
        }
        return false;        
    }
}

public class Main {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("User Credentials");
        UserBO u1=new UserBO(); 
        System.out.println("Enter username");
        String user=sc.next();
        System.out.println("Enter password");
        String password=sc.next();
        User u=new User(1,user, password);
        if(u1.validate(user, password)==true)
        {
        	System.out.println("Login Successful");
        }else
        	System.out.println("Login Unsuccessful");
   }
}