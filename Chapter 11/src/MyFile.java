import java.util.Scanner;
import java.io.*;
public class MyFile {
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
	else{
		System.out.println("File does not exist.");		
	}
	createNewFile("zzz.txt");
	System.out.println("File has been created.");	
	System.out.println("Keep or delete file?");
	String choice= input.nextLine();
	if(choice equals yes) 
	{
		delete(zzz.txt);
		System.out.println("File has been deleted.");	
	}else 
	{
		System.out.println("File has been kept.");		
	}
	}

}
