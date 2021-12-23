package springcoreloc;

public class Laptop {
	private long lid;
	private String cpu;
	private int ram;
	public long getLid() {
		return lid;
	}
	public void setLid(long lid) {
		this.lid = lid;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + (int) (lid ^ (lid >>> 32));
		result = prime * result + ram;
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
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (lid != other.lid)
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", cpu=" + cpu + ", ram=" + ram + ", getLid()=" + getLid() + ", getCpu()="
				+ getCpu() + ", getRam()=" + getRam() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	}
	