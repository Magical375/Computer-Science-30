/*
Program: Squares.java           Date of this Revision: 29-March-2022

Purpose: finds and displays five square numbers

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
*/
public class Squares 
{
	public static void main(String[] args) 
	{
		int [] squares = new int [5];//store array named squares 
		for(int i= 0; i < squares.length; i++)
		{
		squares [i] = i*i;//finds the square numbers
		}
		//display the square numbers  
		for(int i=0; i< squares.length; i++)
		{
			System.out.println(squares[i]);
		}
	}
}
/*
Screen Dump
0
1
4
9
16
*/