import org.springframework.context.support.*;
public class Mainapp {
 public static void main(String[] args) {
	 ClassPathXmlApplicationContext applicationContext2=new ClassPathXmlApplicationContext("myspringfile.xml");
	 Employee E=(Employee)applicationContext2.getBean("emp123");
	 System.out.println(E);
 }
	

}
