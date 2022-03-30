import java.util.Scanner;
import java.io.*;
public class MyFile {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter name of a file");
		String Name= input.nextLine();
	File textFile = new File("c:\\temp\\Name.txt");	
	if (textFile.exists()) {
		System.out.println("File exists.");	
	}else {
		System.out.println("File does not exist.");		
	}
	}

}
