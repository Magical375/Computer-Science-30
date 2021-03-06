import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class ClassExample 
{
public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	NumberFormat pc = NumberFormat.getPercentInstance();
	File textFile;
	FileReader in;
	BufferedReader readFile;
	String fileName, masterAnswers, studentAnswers, StudentName;
	int numCorrect;
	double percentCorrect;
	
	/* The Computer Science Teachers Git Hub repository https://github.com/ridak7/CS30_W22*/
	
	System.out.println("the name of the file?");
	// choices that work "../Chapter 11/src/TestAnswers.txt" or "C:\Users\904269504\git\Computer-Science-30\Chapter 11\src\TestAnswers.txt"
	fileName =input.nextLine();
	textFile = new File (fileName);
	
	try 
	{
		in = new FileReader(textFile);
		readFile = new BufferedReader(in);
		masterAnswers = (String)readFile.readLine();
		while ((StudentName=readFile.readLine())!=null)
		{
			studentAnswers = readFile.readLine();
			numCorrect = 0;
			for(int grade =0; grade < masterAnswers.length(); grade++) 
			{
				if(studentAnswers.charAt(grade) == masterAnswers.charAt(grade))
				{
					numCorrect +=1;
				}
					
			}
		percentCorrect = (double)numCorrect/masterAnswers.length();
		System.out.println(StudentName + "\t" + pc.format(percentCorrect));
		
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