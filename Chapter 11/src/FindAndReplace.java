import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/*
Program: FindAndReplace.java           First Date of this Revision: 14-April-2022

Purpose:
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
public class FindAndReplace {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of where the file is and the name of the file.");
		//     please use this directory:"../Chapter 11/src/Replace.txt"
		String FileName= input.nextLine();//holds name of file entered
		
		try 
		{
		FileInputStream inn = new FileInputStream(FileName);//allows the program to read the file
		ObjectInputStream readtext = new ObjectInputStream(inn);
		System.out.println(readtext.readObject() );//displays file read	
		readtext.close();//closes the read text
		}	
		
		catch(IOException e)//handles exceptions so when they happen the code doen't crash and tells user the specific error so they can fix it 
		{
			System.out.println("There is a problem writting to file.");
			System.err.println("IOException: "+ e.getMessage());
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error Message: Class not found.");
			System.err.println("ClassnotFound:"+ e.getMessage());
		}
	
	}

}
