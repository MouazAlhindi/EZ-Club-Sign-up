//Class holds Main Method
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MembershipProject extends JFrame {
	
	private static StatData dataSet;
	private static DataWriter dataWriter;
	private static DisplayPanel displayPanel;
	private static InputPanel inputPanel;
	
	
	public MembershipProject(){
		
		dataSet = new StatData();
		displayPanel = new DisplayPanel();
		dataWriter = new DataWriter(dataSet);
		inputPanel = new InputPanel(dataSet, new FinishButtonListener());
		
		setTitle("Montco Code Club");
		setSize(700, 500);
		setVisible(true);
		
		setLayout(new GridLayout(1, 2));
		
		add(inputPanel);
		add(displayPanel);
		
		pack();
		
	}
	
	public static class FinishButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			inputPanel.setVars();
			inputPanel.saveData();
			displayPanel.addNewName(inputPanel.getName());
			inputPanel.setVarsNull();
			displayPanel.setText();
			
			
		}
	}
	
	public static void main(String[] args){
		MembershipProject mainFrame = new MembershipProject();
		
	}
}
