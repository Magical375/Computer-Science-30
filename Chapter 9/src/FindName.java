import java.util.Scanner;
public class FindName 
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter how many names you want to store");//allows user to enter the number of names to store
		int num = input.nextInt();
		String [] nameslist = new String [num];
		String name;
		for(int i = 0; i<num; i++)//runs loop for the exact number of names the user wants 
		{
			System.out.print("Enter a name: ");
			name = input.nextLine();
			nameslist[i] = name;
		}
		System.out.println("Please enter what name you want to find.");
		String find =input.nextLine();

	}
	public static String linear(int[] array, String nameToFind) 
	{
		int index = 0;
		while ((array[index] != nameToFind) && (index < array.length - 1)) 
		{
			index += 1;
		}
		
		if (array[index] == nameToFind) 
		{
			return(index);
		} else {
			return(-1);
		}
	}
}


