package sample;

public class Student {
	
	private int rollNum;
	private String firstName;
	private String stream;
	
	public Student(int rollNum, String firstName, String stream) {
		super();
		this.rollNum = rollNum;
		this.firstName = firstName;
		this.stream = stream;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	@Override
	public String toString() {
		return stream +" " +firstName +" "+ rollNum;
	}

}
