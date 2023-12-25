package dto;

public class Ordersdto 
{


	String odate;
	String oname;
	String ocategory;
	Integer oquantity;
	Double opricel;
	Integer uid;
	public Ordersdto() {
		super();
	}
	public Ordersdto(String odate, String oname, String ocategory, Integer oquantity, Double opricel) {
		super();
		this.odate = odate;
		this.oname = oname;
		this.ocategory = ocategory;
		this.oquantity = oquantity;
		this.opricel = opricel;
	}
	public Ordersdto(String oname, String ocategory, Integer oquantity, Double opricel, Integer uid) {
		super();
		this.oname = oname;
		this.ocategory = ocategory;
		this.oquantity = oquantity;
		this.opricel = opricel;
		this.uid = uid;
	}
	public Ordersdto(String odate, String oname, String ocategory, Integer oquantity, Double opricel, Integer uid) {
		super();
		this.odate = odate;
		this.oname = oname;
		this.ocategory = ocategory;
		this.oquantity = oquantity;
		this.opricel = opricel;
		this.uid = uid;
	}

	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOcategory() {
		return ocategory;
	}
	public void setOcategory(String ocategory) {
		this.ocategory = ocategory;
	}
	public Integer getOquantity() {
		return oquantity;
	}
	public void setOquantity(Integer oquantity) {
		this.oquantity = oquantity;
	}
	public Double getOpricel() {
		return opricel;
	}
	public void setOpricel(Double opricel) {
		this.opricel = opricel;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Ordersdto [odate=" + odate + ", oname=" + oname + ", ocategory=" + ocategory + ", oquantity="
				+ oquantity + ", opricel=" + opricel + ", uid=" + uid + "]";
	}
	
}
