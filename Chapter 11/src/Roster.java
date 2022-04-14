/*
Program: Roster.java           Date of this Revision: 6-April-2022

Purpose: allows user to name file and write data to the file created
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;//makes the write and read file code work properly
import java.util.Scanner;//makes the scanner code, that gets information from the user, work properly
public class Roster 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of where you want the file with the name of the file you want to create.");
		//     please use this directory:"../Chapter 11/src/StudentNames.txt"
		String FileName= input.nextLine();//allows user to pick name of file
		File textFile = new File(FileName);//creates the file with the name the user wanted
		
		System.out.println("How many students do you want to list?");//asks the user how many names they want to enter
		int num = input.nextInt();
		
		try 
		{
			FileOutputStream out = new FileOutputStream(textFile);//enables the write to file
			ObjectOutputStream writetextFile = new ObjectOutputStream(out);
			for(int i = 0; i<num; i++)//runs loop for the exact number of names the user wants 
			{
			System.out.println("Please enter the first name of a student");//gets first name from user
			String Namef= input.next();
			System.out.println("Please enter the last name of that student");//gets last name from user
			String Namel= input.next();
			writetextFile.writeObject(new stuName(Namef, Namel));//writes information the user entered	
		}
		writetextFile.close();//stops the code from writing more to the file
		System.out.println("program has written student names");//tells the user the write to file is finished 
		input.close();//closes the scanner, or the editor program is annoyed 
		
		FileInputStream inn = new FileInputStream(textFile);//allows the program to read the file
		ObjectInputStream readtext = new ObjectInputStream(inn);
		
		for(int i = 0; i<num; i++)//displays student names and exactly the number of names the user entered 
			{
			System.out.println((stuName) readtext.readObject() );//displays student names
			}
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
/*
Screen Dump
Please enter the directory of where you want the file with the name of the file you want to create.
../Chapter 11/src/StudentNames.txt
How many students do you want to list?
1
Please enter the first name of a student
aa
Please enter the last name of that student
a
program has written student names
Name: aa a
*/