/*
Program: MyFile1of2.java           Date of this Revision: 31-March-2022

Purpose: allows the user to confirm if a file exists
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.util.Scanner;
import java.io.*;
public class MyFile1of2 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of a file");//user has to enter where the file is
		// choices that work "../Chapter 11/src/name.txt" or "C:\Users\904269504\git\Computer-Science-30\Chapter 11\src\name.txt"
		String Name= input.nextLine();
	File textFile = new File(Name);	
	if (textFile.exists()) 
	{
		System.out.println("File exists.");//tells the user the file exists if it does	
	}
	else{
		System.out.println("File does not exist.");//tells the user the file does not exist if it does not exist 		
	}
	}
}

/*
Screen Dump
Please enter the directory of a file
../Chapter 11/src/name.txt
File exists.
*/