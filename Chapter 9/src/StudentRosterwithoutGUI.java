/*

Program: StudentRosterwithoutGUI.java          Last Date of this Revision: 25-Nov-2020

Purpose: 

Author: Laura Frede, 
School: CHHS
Course: Computer Science 20
 

*/

package chapter.pkg9;

import java.util.Arrays;
import java.util.Scanner;


public class StudentRosterwithoutGUI {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int numstudents;
    String[] studentNames;
    
    System.out.println("how many students are in your class?");
    numstudents = input.nextInt();
    
    studentNames = new String[numstudents];
    
    for(int i = 0; i < numstudents; i++)
    {
        System.out.println("Please enter students names: ");
        studentNames[i] = input.next();
    }
    System.out.println("Student Roster");
    
    Arrays.sort(studentNames);
    for (String element : studentNames){
        
       
        System.out.println(element);
    }
     
    }

    /* Screen Dump



     */
    }