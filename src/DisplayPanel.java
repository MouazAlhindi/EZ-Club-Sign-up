import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DisplayPanel extends JPanel{
	
	private JTextArea display;
	private ArrayList<String> nameList = new ArrayList<String>();
	
	
	public DisplayPanel(){
		
		display = new JTextArea(30, 50);
		
		add(display);
	}
	
	public void addNewName(String n){
		nameList.add(n);
	}
	
	public void setText(){
		
		String text = "";
		
		for(String n: nameList){
			text += (n + "\n");
		}
		
		display.setText(text);
	}
	
	
}
