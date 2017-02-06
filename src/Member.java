import java.util.*;

public class Member {

	private String name;
	private String email;
	private boolean dayChoice1;
	private boolean dayChoice2;
	private boolean dayChoice3;
	
	public Member(String n, String e, boolean dc1, boolean dc2, boolean dc3){
		this.name = n;
		this.email = e;
		this.dayChoice1 = dc1;
		this.dayChoice2 = dc2;
		this.dayChoice3 = dc3;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public boolean getDateOneAvailable(){
		return dayChoice1;
	}
	
	public boolean getDateTwoAvailable(){
		return dayChoice2;
	}
	
	public boolean getDateThreeAvailable(){
		return dayChoice3;
	}
	
}
