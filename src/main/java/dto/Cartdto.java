package dto;

public class Cartdto extends Productdto
{
   Integer Quantity;
   public Cartdto() {
		super();
	}

	public Cartdto(Integer quantity) {
		super();
		Quantity = quantity;
	}

public Integer getQuantity() {
	return Quantity;
}

public void setQuantity(Integer quantity) {
	Quantity = quantity;
}


@Override
public String toString() {
	return "Cartdto [Quantity=" + Quantity + ", pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pcategory="
			+ pcategory + ", pimg=" + pimg + "]";
}

}
