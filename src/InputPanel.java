import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class InputPanel extends JPanel {
	
	private StatData data;
	
	private JTextField nameDirection;
	private JTextField nameField; //Hold the Members name
	private JTextField emailDirection;
	private JTextField emailField; //Hold the Members MC3 Email
	private JTextField emailTagHolder; //Hold the email tag "@students.mc3.edu"
	private JRadioButton dateOneOpt; //Hold the date "Tues 11:00 - 11:30"
	private JRadioButton dateTwoOpt; //Hold the date "Wend 12:40 - 1:00"
	private JRadioButton neitherOpt; //Hold the option for neither "Neither"
	private JButton finishButton; //Will clear all data and save data
	
	private String mName;
	private String mEmail;
	private boolean mChoice1;
	private boolean mChoice2;
	private boolean mChoice3;
	
	public InputPanel(StatData d, ActionListener e){
		
		nameDirection = new JTextField(10);
		nameDirection.setText("Enter Name: ");
		nameDirection.setEditable(false);
		nameField = new JTextField(15);
		nameField.setEditable(true);
		emailDirection = new JTextField(10);
		emailDirection.setText("Enter MC3 Email: ");
		emailDirection.setEditable(false);
		emailField = new JTextField(15);
		emailField.setEditable(true);
		emailTagHolder = new JTextField();
		emailTagHolder.setEditable(false);
		emailTagHolder.setText("@students.mc3.edu");
		dateOneOpt = new JRadioButton();
		dateTwoOpt = new JRadioButton();
		neitherOpt = new JRadioButton();
		finishButton = new JButton("Finish");
		finishButton.addActionListener(e);
		
		setLayout(new GridLayout(4, 3, 20, 20));
		
		add(nameDirection);
		add(nameField);
		add(new JLabel(""));
		add(emailDirection);
		add(emailField);
		add(emailTagHolder);
		add(dateOneOpt);
		add(dateTwoOpt);
		add(neitherOpt);
		add(new JLabel());
		add(finishButton);
		
		data = d;
		
	}
	
	public void setVars(){
		this.mName = nameField.getText();
		this.mEmail = emailField.getText();
		this.mChoice1 = dateOneOpt.isSelected();
		this.mChoice2 = dateTwoOpt.isSelected();
		this.mChoice3 = neitherOpt.isSelected();
	}
	
	public void setVarsNull(){
		nameField.setText("");
		emailField.setText("");
		dateOneOpt.setSelected(false);
		dateTwoOpt.setSelected(false);
		neitherOpt.setSelected(false);
	}
	
	public void saveData(){
		data.addMember(new Member(mName, mEmail, mChoice1, mChoice2, mChoice3));
	}
	
	public String getName(){
		return mName;
	}
	
	public String getEmail(){
		return mEmail;
	}
	
	public boolean getDayOpt1(){
		return mChoice1;
	}
	
	public boolean getDayOpt2(){
		return mChoice2;
	}
	
	public boolean getDayOpt3(){
		return mChoice3;
	}
	
	
	
	

}

