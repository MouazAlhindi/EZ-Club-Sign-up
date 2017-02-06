import java.io.IOException;
import java.util.*;

public class StatData {
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	
	public StatData(){
		
	}
	
	public void addMember(Member m){
		memberList.add(m);
	}
	
	public String getCredentials(){
		String s ="";
		int count = 0;
		
		for(Member m: memberList){
			s += "Member " + count +
				 "\nMember Name: " + m.getName() +
			     "\nMember Email: " + m.getEmail() + "@Students.mc3.edu" +
			     "\nMember Day 1 Available: " + m.getDateOneAvailable() +
			     "\nMember Day 2 Available: " + m.getDateTwoAvailable() +
			     "\nMember Day 3 Available: " + m.getDateThreeAvailable()  + "\n";
		}
		
		return s;
	}
}
