
package springcoreloc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {
 public static void main(String[] args) {
	 
	 ClassPathXmlApplicationContext don =new ClassPathXmlApplicationContext("coreconstructioninjection.xml");
	Employee emp =(Employee)don.getBean("emp123");
	System.out.println(emp);
	Laptop l =(Laptop)don.getBean("lap123");
	System.out.println(l);
}
	
}
