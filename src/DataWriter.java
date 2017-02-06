import java.util.*;
import java.io.*;

public class DataWriter {
	
	private File file;
	private PrintWriter outputFile;
	private StatData data;
	
	public DataWriter(StatData d) throws IOException{
		
		data = d;
		
		file = new File("NameList.txt");
		if(!file.exists()){
			System.out.println("File NameList.txt does not exsit");
			System.exit(0);
		}
		
		outputFile = new PrintWriter(file);
	}
	
	public void print() throws IOException{
		outputFile.print(data.getCredentials());
	}
}
