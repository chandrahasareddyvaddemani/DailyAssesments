import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
 
    
	private static final long serialVersionUID = 111;

	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EmpID")
    private int empID;
 
    @Column(name="EmpName")
    private String empName;
 
    @Column(name="EmpAddress")
    private String empAddress;
 
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empAddress == null) ? 0 : empAddress.hashCode());
		result = prime * result + (int) (empContact ^ (empContact >>> 32));
		result = prime * result + empID;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((laptop == null) ? 0 : laptop.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAddress == null) {
			if (other.empAddress != null)
				return false;
		} else if (!empAddress.equals(other.empAddress))
			return false;
		if (empContact != other.empContact)
			return false;
		if (empID != other.empID)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (laptop == null) {
			if (other.laptop != null)
				return false;
		} else if (!laptop.equals(other.laptop))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + ", empContact="
				+ empContact + ", laptop=" + laptop + ", getEmpID()=" + getEmpID() + ", getEmpName()=" + getEmpName()
				+ ", getEmpAddress()=" + getEmpAddress() + ", getEmpContact()=" + getEmpContact() + ", getLaptop()="
				+ getLaptop() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getEmpContact() {
		return empContact;
	}

	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name="EmpContact")
    private long empContact;

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

	
}
