import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Program: FindAndReplace.java           First Date of this Revision: 14-April-2022

Purpose:
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
public class FindAndReplace 
{
	public static void main(String[] args) 
	{
		FileReader in;
		BufferedReader readFile;
		String FileName, lineoftext;
		File newFile;
		BufferedWriter writeFile;
		FileWriter out;
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of where the file is and the name of the file.");
		//     please use this directory:"../Chapter 11/src/ReplaceVersionTwo.txt"
		FileName= input.nextLine();//holds name of file entered
		File textFile = new File(FileName);
		System.out.println("Please enter what you want to replace.");
		String current= input.nextLine();
		System.out.println("Please enter what you want to replace it with.");
		String replaced= input.nextLine();
		
		input.close();//closes the scanner or else the code is annoyed with you
		try 
		{
				
		in = new FileReader(textFile);
		readFile = new BufferedReader(in);
		FileName = FileName.replace(".", "NEW");
		newFile = new File(FileName);
		
		out = new FileWriter(newFile);	
		writeFile = new BufferedWriter(out);
		
		while((lineoftext=readFile.readLine())!=null)
	{
	lineoftext = lineoftext.replaceAll(current, replaced);
	writeFile.write (lineoftext);
	writeFile.newLine();
	readFile.close();//closes the read text
	}
		}	
		catch(IOException e)//handles exceptions so when they happen the code doen't crash and tells user the specific error so they can fix it 
		{
			System.out.println("There is a problem writting to file.");
			System.err.println("IOException: "+ e.getMessage());
		}
	}
}
