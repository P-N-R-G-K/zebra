package dto;

public class Productdto 
{

		Integer pid;
		 String pname;
		 double pprice;
		 String pcategory;
		 String pimg;
		 public Productdto() {
			super();
		}
		 public Productdto(String pname, double pprice, String pcategory, String pimg) {
			super();
			this.pname = pname;
			this.pprice = pprice;
			this.pcategory = pcategory;
			this.pimg = pimg;
		} 
		 public Productdto(Integer pid, String pname, double pprice, String pcategory, String pimg) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pprice = pprice;
			this.pcategory = pcategory;
			this.pimg = pimg;
		}
		public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public double getPprice() {
			return pprice;
		}
		public void setPprice(double pprice) {
			this.pprice = pprice;
		}
		public String getPcategory() {
			return pcategory;
		}
		public void setPcategory(String pcategory) {
			this.pcategory = pcategory;
		}
		public String getPimg() {
			return pimg;
		}
		public void setPimg(String pimg) {
			this.pimg = pimg;
		}
		@Override
		public String toString() {
			return "Productdto [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pcategory=" + pcategory
					+ ", pimg=" + pimg + "]";
		}
 
}
