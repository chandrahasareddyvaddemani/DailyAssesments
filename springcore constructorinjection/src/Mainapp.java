import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mainapp{
 public static void main(String[] args) {
	 ClassPathXmlApplicationContext applicationContext3=new ClassPathXmlApplicationContext("springcoreconstructioninjection.xml");
	 Employee e=(Employee)applicationContext3.getBean("emp123");
	 System.out.println(e);
 }
	

}
