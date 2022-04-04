/*
Program: Stats.java           Date of this Revision: 1-April-2022

Purpose: read data from file and display data from file
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
import java.util.Scanner;
public class Stats 
{
public static void main(String[] args) 
	{
	
	double perentCorrect;
	
	System.out.println("the name of the file?");
	
	textFile = new File (fileName);
	
	try {
		in = new Filreader(textFile);
		readFile = new BufferedReader(in);
		masterAnswers = (String)readFile.readLine();
		while ((studentName=readFile.reeadLine())!=null)
		{
			studentAnswers = readfile.readLine();
			for(int grade =0; grade < masterAnswers.length(); grade++) 
			{
				if(studentAnswers.charAt(grade) == masterAnswers.charAt(grade))
					//numCorrect +=1;
			}
		percentCorrect = (double)numCorrect/masterAnswers.length();
		System.out.println(studentName + "\t" + pc.format(percentCorrect);
		
		}
		readFile.close();
		in.close();
	}
	catch(FileNotFoundException e) 
	{
	System.out.println("File does not exists.");
	System.err.println("FileNotFoundException:"+ e.getMessage());
	}
	catch(IOException e) 
	{
	System.out.println("Can not read the file");
	System.err.println("IOException:"+ e.getMessage());
	}
	}
}
/*
screen dump
*/