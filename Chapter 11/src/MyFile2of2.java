import java.util.Scanner;
import java.io.*;
public class MyFile2of2 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of a file");// choices that work "../Chapter 11/src/name.txt" or "C:\Users\904269504\git\Computer-Science-30\Chapter 11\src\name.txt"
		String Name= input.nextLine();
	File textFile = new File(Name);	
	if (textFile.exists()) 
	{
		System.out.println("File exists.");	
	}
	else
	{
		try 
		{
			textFile.createNewFile();
			System.out.println("File has been created.");
		}
		catch (IOException e) 
		{
			System.out.println("File could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}
	
			
	System.out.println("Keep or delete (type D) file? ");
	String choice= input.next();
	
	if(choice.equalsIgnoreCase("D")) 
	{
		if(textFile.delete())
		{
			System.out.println("File has been deleted.");	
		}
	}
	
	}

}
