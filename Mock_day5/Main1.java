package Mock_day5;
import java.util.*;

class User1{
    private String name;
    private long mobileNumber;
    private String username;
    private String password;
    public User1(String name, long mobileNumber, String username, String password) {
        super();
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
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
}

class UserBO1{    
    static int a=0;
    public User1[] add(String name ,long mobileNumber,String username,String password,User1[] users)
    {              
        users[a]=new User1(name,mobileNumber,username,password);
        a++;
        return users;
    }
    
    public void display (User1 [] users) {        
        System.out.printf(" %20s %10s %10s  %10s",  "NAME", "MOBILE NUMBER","USERNAME", "PASSWORD");
        for(int i=0;i<users.length;i++)
        {
            System.out.println();
            System.out.printf( "%20s %10d %10s %10s", users[i].getName(),users[i].getMobileNumber(),users[i].getUsername(), users[i].getPassword());
        }
        System.out.println();
    }
    
    public User1[] remove (String username , User1[] users) {        
        int l=users.length;
        User1  un[]=new User1[l-1];
        for(int i=0,k=0;i<users.length;i++) {
            if(!(users[i].getUsername().equals(username)))
            {
                un[k++]=users[i];
            }
            
        }
        return un;
    }       
}

public class Main1 {
	   public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the number of users to be added: ");
	        int n =sc.nextInt();
	        User1  u[]=new User1[n];
	        UserBO1 o=new UserBO1();
	        for(int i=0;i<n;i++)
	        {
	            System.out.println("Enter the user detail "+(i+1));
	            System.out.println("Enter the name:");
	            String name=sc.next();
	            System.out.println("Enter the mobile number: ");
	            long number =sc.nextLong();
	            System.out.println("Enter the username: ");
	            String uname=sc.next();
	            System.out.println("Enter the password: ");
	            String pass=sc.next();
	            o.add(name, number, uname, pass, u);                
	        }
	        System.out.println("Users created succcsessfully");
	        while(true) {	        
	            System.out.println("Menu:");
	            System.out.println("1.Display all users");
	            System.out.println("2.Remove a user");
	            System.out.println("3.Exit");
	            System.out.println("Enter your choice: ");

	            int c=sc.nextInt();
	            
	            switch(c) {	            
	            case 1 : o.display(u);break;
	            case 2:
	                System.out.println("Enter the username: ");
	                String ru=sc.next();
	                u=o.remove(ru, u);
	                o.display(u);
	                break;
	            
	            case 3:
	            	System.exit(0);
	            default:
	            	System.out.println("Enter valid choice:");
	            break;
	            }
	        }        
	    }
	}
