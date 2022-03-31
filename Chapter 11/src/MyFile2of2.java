import java.util.Scanner;
import java.io.*;
public class MyFile2of2 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of a file");
		// choices that work "../Chapter 11/src/[PICK NAME HERE WITH .txt]" or "C:\Users\904269504\git\Computer-Science-30\Chapter 11\src\[PICK NAME HERE WITH .txt]"
		String Name= input.nextLine();
	File textFile = new File(Name);	
	
	//if (textFile.exists()) 
	//{
	//	System.out.println("File exists.");	
	//}
	//else
	//{
		//try 
		//{
			
		//}
		//catch (IOException e) 
		//{
		//	System.out.println("File could not be created.");
		//	System.err.println("IOException: " + e.getMessage());
		//}
		
	//}
	textFile.createNewFile();
	System.out.println("File has been created.");
			
	System.out.println("Keep or delete file? ");
	String choice= input.next();
	
	if(choice.equals("delete")) 
	{
		if(textFile.delete())
		{
			System.out.println("File has been deleted.");	
		}
	}
	
	}

}
