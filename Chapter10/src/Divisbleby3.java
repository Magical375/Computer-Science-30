/*

Program: Divisbleby3.java          Last Date of this Revision: 14-February-2022

Purpose: after the user enters a number and clicks the submit button it says if the number is divisble by three or not

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Divisbleby3 
{

	private JFrame frame;
	private JTextField TextField;


	
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Divisbleby3 window = new Divisbleby3();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Divisbleby3() 
	{
		initialize();
	}//do not delete or code refuses to parse!!!

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() //creates a GUI and other components
	{
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(147, 112, 219));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setForeground(new Color(153, 50, 204));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel TextDisplay3 = new JLabel("display the math answer");
		TextDisplay3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TextDisplay3.setForeground(new Color(148, 0, 211));
		TextDisplay3.setBounds(10, 297, 176, 38);
		panel.add(TextDisplay3);
		
		TextField = new JTextField();
		TextField.setForeground(new Color(0, 0, 139));
		TextField.setBackground(new Color(230, 230, 250));
		TextField.setBounds(10, 139, 272, 99);
		panel.add(TextField);
		TextField.setColumns(10);
		JLabel TextDisplay = new JLabel("This can display text");
		TextDisplay.setForeground(new Color(23, 116, 255));
		TextDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TextDisplay.setBounds(196, 332, 237, 86);
		panel.add(TextDisplay);
		frame.setBounds(100, 150, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener()//runs code when user clicks on submit button
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
			double input = Double.parseDouble(TextField.getText());
			
			int dividebythree; 
		
			 double answer = input / 3; 
		 	TextDisplay3.setText(Double.toString(answer));
			
			
		 	if ((input % 3) == 0 )
		 	{  //if number is not a decimal then display divisible by three
				
		 		 TextDisplay.setText("Divisble by three");
				
			
			
			}
		 	 else if ((input % 3) != 0 )
		 	 {//if number is a decimal then display not divisible by three
		 		 TextDisplay.setText("Not Divisble by three");
		 	 }
			} 
		});
		//GUI components 
		btnSubmit.setForeground(new Color(0, 0, 205));
		btnSubmit.setBackground(new Color(252, 230, 241));
		btnSubmit.setBounds(361, 169, 113, 38);
		panel.add(btnSubmit);
		
		JLabel TextDisplay2 = new JLabel("Is number divisble by three program. ");
		TextDisplay2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TextDisplay2.setForeground(new Color(148, 0, 211));
		TextDisplay2.setBounds(82, 11, 284, 86);
		panel.add(TextDisplay2);
		
		JLabel lblNewLabel = new JLabel("Please enter a number without a decimal.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setBounds(79, 85, 364, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("input number divided by three answer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(148, 0, 211));
		lblNewLabel_1.setBounds(10, 279, 313, 14);
		panel.add(lblNewLabel_1);
		
		
		
		
}
	}
