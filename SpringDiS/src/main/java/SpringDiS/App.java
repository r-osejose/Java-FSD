package SpringDiS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) { 
    	ApplicationContext context =   
			    new ClassPathXmlApplicationContext("person.xml");  
    	System.out.println("Hii");
 		person p= context.getBean("person",person.class);
 		p.display();
    }
}
