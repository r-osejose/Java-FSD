package maven1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args ){
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");  
		System.out.println("Welcome");
		System.out.println("");
 		v2 c= context.getBean("car",v2.class);
		c.Speed();
		c.Price();
		
		System.out.println("");
		v2 c1= context.getBean("car1",v2.class);
		c1.Speed();
		c1.Price();
    }
}
