package onetomanyrelationship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import java.util.Objects;
@Entity
//@Audited
public class Laptop {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -552429597864739237L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer laptopID;
    //@Audited
    private String modelNo;
	public Integer getLaptopID() {
		return laptopID;
	}
	public void setLaptopID(Integer laptopID) {
		this.laptopID = laptopID;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((laptopID == null) ? 0 : laptopID.hashCode());
		result = prime * result + ((modelNo == null) ? 0 : modelNo.hashCode());
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
		Laptop other = (Laptop) obj;
		if (laptopID == null) {
			if (other.laptopID != null)
				return false;
		} else if (!laptopID.equals(other.laptopID))
			return false;
		if (modelNo == null) {
			if (other.modelNo != null)
				return false;
		} else if (!modelNo.equals(other.modelNo))
			return false;
		return true;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    
}
