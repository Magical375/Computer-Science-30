/*
Program: Stats.java           Date of this Revision: 1-April-2022

Purpose: read data from file and display data from file
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Stats 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		File textFile = new File("../Chapter 11/src/test1.dat");
		NumberFormat pc = NumberFormat.getPercentInstance();
		FileReader in;
		BufferedReader readFile;
		String fileName, StudentGradeS, StudentName;
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
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
