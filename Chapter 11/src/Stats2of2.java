/*
Program: Stats.java           Date of this Revision: 6-April-2022

Purpose: allows the user to enter names and grades of the students this data will be written to a file, then the lowest grade, highest grade and average grade will be displayed 
Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class Stats2of2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the directory of where you want the file with the name of the file you want to create");
		String FileName= input.nextLine();//allows user to pick name of file
		File textFile = new File(FileName);//creates the file with the name the user wanted
		System.out.println("Please enter the name of the student");
		String Name1= input.nextLine();
		System.out.println("Please enter the grade of the student that student");
		int Grade1= input.nextInt();
	}
}
/*
screen dump
*/
