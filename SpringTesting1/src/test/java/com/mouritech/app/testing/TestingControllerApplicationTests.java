package com.mouritech.app.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mouritech.app.model.Employee;

@SpringBootTest
public class TestingControllerApplicationTests {

	 @Autowired
	    private MyController mycontroller;
	    @Autowired
	    private MyService myService;
	    @Test
	    public void myControllerTesting() {
	        assertEquals("Hello World", mycontroller.greeting());
	    }
	    @Test
	    public void myEmployeeControllerTesting() {
	        Employee employee=new Employee();
	        assertEquals("done", mycontroller.addRecord(employee));
	    }
	    @Test
	    public void myEmployeeServiceTesting() {
	        Employee employee=new Employee();
	        assertEquals(employee,myService.addEmployee(employee));
	    }
}
