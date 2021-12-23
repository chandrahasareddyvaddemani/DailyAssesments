 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDEMO {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        try{ 
	            // Loading JDBC Driver into memory
	            Class.forName("org.postgresql.Driver");  
	            // Creating Connection
	            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernate",    
	                    "postgres","root");  
	            //here sampledb is database name, root is username and password  
	            Statement stmt=con.createStatement();  
	            DatabaseMetaData dm= con.getMetaData();
	            System.out.println(dm);
	            // SQL statement execution
//	            boolean status =stmt.execute("create database JDBC;");
//	            boolean status1 = stmt.execute("CREATE TABLE ORDERS ("
//	                    + "ORDER_ID INT PRIMARY KEY,"
//	                    + "WEEKDAY_RECIPIENT VARCHAR(40),"
//	                    + "WEEKDAY_PHONE VARCHAR(20),"
//	                    + "WEEKDAY_ADDRESS VARCHAR(100),"
//	                    + "HOLIDAY_RECIPIENT VARCHAR(40),"
//	                    + "HOLIDAY_PHONE VARCHAR(20),"
//	                    + "HOLIDAY_ADDRESS VARCHAR(100));");
//	            boolean status11 =stmt.execute("create table person(pid int, pname varchar(20), phone text);");
	            stmt.executeUpdate("insert into person values(1,'chandra', '343');");
	            
//	            boolean status2 = stmt.execute("update person set pname='chandra' where pid =2;");
//	            boolean status3 =stmt.execute("delete from person where pid=1;");

	            ResultSet resultset=stmt.executeQuery("select * from person;");
	            while(resultset.next()) {
	                System.out.println(resultset.getString("pname"));
	            }

	            System.out.println("Query has been executes Successfully");
	            stmt.close();
	            con.close();
	        }catch (Exception e) { // Handling Exception in case of Exception
	            System.out.println("Something went wrong "+e);

	        }

	    
}
}
