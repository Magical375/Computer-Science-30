import java.util.Scanner;
public class HighestGrade {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		Double [] nameslist = new Double [5];
		Double grade;
		for(int i = 0; i<5; i++)//runs loop for five grades 
		{
			System.out.print("Enter a grade: ");
			grade = input.nextDouble();
			nameslist[i] = grade;
		}
		input.close();//closes the scanner, or the editor program is annoyed 
	}

}
