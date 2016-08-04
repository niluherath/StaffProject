
public class Employer {
	
	private String name; 
	private String iD;
	private String dob;
	
	public Employer(String id, String name, String dob) {
		this.iD = id;
		this.name = name;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

}
