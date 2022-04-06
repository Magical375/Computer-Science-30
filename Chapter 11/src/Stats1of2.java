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
public class Stats1of2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		File textFile = new File("../Chapter 11/src/test1.txt");
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		FileReader in;
		BufferedReader readFile;
		String fileName,  score, StudentName;
		int StudentGrade;
		double averageGrade, totalGrades;
		int numGrades = 0;
		
		
		try 
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((StudentName=readFile.readLine())!=null)
			{
				
				System.out.println(StudentName);
							
			}
			System.out.println("the program should now display the lowest grade(23), the highest grade(98) and the average grade(65)");
			StudentGrade = 0;
			totalGrades = 0;
			averageGrade = totalGrades / numGrades;
			
			while((score = readFile.readLine())!=null) {
				totalGrades = 0;
				numGrades +=1;
				System.out.println(score);
				totalGrades +=Double.parseDouble(score);
			}
			//(StudentGrade);
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
