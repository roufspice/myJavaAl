package myJavaAl_codebox;

public class Seat {
	
	private String name;
	
	
	

	public String getName() {
		return name;
	}
	
	public void reserve(String name) {
		this.name = name;
	}
	
	public void cancel() {
		this.name = null;
	}
	
	public boolean isOccupied() {
		//이미 예약된 자리인지 불린값을 리턴!
		return name != null;
		}
	
	
	public boolean match(String checkName) {
		//checkName이라는 이름으로 예약된 자리인지 확인하고, 불린값리턴
		return name.equals(checkName);
		
	}
	
	

}
