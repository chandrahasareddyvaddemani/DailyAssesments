
public class Employee {
 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + (int) (empID ^ (empID >>> 32));
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + (salaryPaid ? 1231 : 1237);
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
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (empID != other.empID)
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (salaryPaid != other.salaryPaid)
			return false;
		return true;
	}
@Override
	public String toString() {
		return "Employee [empID=" + empID + ", Name=" + Name + ", Address=" + Address + ", phone=" + phone
				+ ", salaryPaid=" + salaryPaid + ", getEmpID()=" + getEmpID() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", isSalaryPaid()=" + isSalaryPaid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
private long empID;
 private String Name,Address,phone;
 private boolean salaryPaid;
public long getEmpID() {
	return empID;
}

public Employee() {
	super();
}
public Employee(long empID, String name) {
	super();
	this.empID = empID;
	Name = name;
}
public Employee(long empID, String name, String address, String phone, boolean salaryPaid) {
	super();
	this.empID = empID;
	Name = name;
	Address = address;
	this.phone = phone;
	this.salaryPaid = salaryPaid;
}
public void setEmpID(long empID) {
	this.empID = empID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public boolean isSalaryPaid() {
	return salaryPaid;
}
public void setSalaryPaid(boolean salaryPaid) {
	this.salaryPaid = salaryPaid;
}
	
	
}
