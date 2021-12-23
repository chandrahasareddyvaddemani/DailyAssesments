package springcoreloc;

public class Employee {
 private long eid;
 private String name;
 private Laptop laptop;
public long getEid() {
	return eid;
}
public void setEid(long eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (eid ^ (eid >>> 32));
	result = prime * result + ((laptop == null) ? 0 : laptop.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	if (eid != other.eid)
		return false;
	if (laptop == null) {
		if (other.laptop != null)
			return false;
	} else if (!laptop.equals(other.laptop))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", laptop=" + laptop + ", getEid()=" + getEid() + ", getName()="
			+ getName() + ", getLaptop()=" + getLaptop() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
			+ ", toString()=" + super.toString() + "]";
}
 
}
