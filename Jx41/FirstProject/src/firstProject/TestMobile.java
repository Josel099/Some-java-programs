package firstProject;


class Mobile{
	private String make;
	private String color;
	private int price;
	
	public Mobile(String make ,String color,int price) {
		this.make=make;
		this.color=color;
		this.price=price;
		}
		public String getMake() {
	return make;
	}
	public void setMake(String make) {
			this.make=make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void makeCall() {
		System.out.println("call using the phone");
		}
}



public class TestMobile{
	public static void main(String[] args) {
		Mobile m=new Mobile("oppo","black",15000);
//		m.setMake("oppo");
//		m.setPrice(15000);
//		m.setColor("Black");
		
		System.out.println(m.getMake());
		System.out.println(m.getColor());
		System.out.println(m.getPrice());
		
		m.makeCall();
	}
}


