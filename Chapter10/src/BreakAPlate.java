/*

Program: BreakAPlate.java           Date of this Revision: 14-February-2022

Purpose: allows the user to break plates and win rewards

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BreakAPlate 
{
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	//hi
	ImageIcon plates = new ImageIcon("../Chapter10/plates.gif");
	ImageIcon twobroken = new ImageIcon("../Chapter10/plates_two_broken.gif");
	ImageIcon allbroken = new ImageIcon("../Chapter10/plates_all_broken.gif");
	ImageIcon sticker = new ImageIcon("../Chapter10/sticker.jfiff");
	ImageIcon bear = new ImageIcon("../Chapter10/prize.jfif");
	//tell program where images are and assigns each to a name
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				} finally {
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public BreakAPlate() 
	{
		initialize();
	}//do not delete this or code refuses to parse!!!
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() //creates GUI and other components
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 543, 440);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel TextOutput = new JLabel("");
		TextOutput.setFont(new Font("Tahoma", Font.BOLD, 16));
		TextOutput.setForeground(new Color(0, 0, 255));
		TextOutput.setBounds(77, 229, 425, 27);
		panel.add(TextOutput);
		
		JLabel ImageOutput2 = new JLabel("");
		ImageOutput2.setBounds(48, 267, 350, 132);
		panel.add(ImageOutput2);

		
		
		
		JLabel ImageOutput = new JLabel("");
		
		ImageOutput.setIcon(plates);
		
		ImageOutput.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			//something happens when the user mouse clicks on image
				
			
				// picks a random integer, 1 or 2
				int number = 1 + (int)( 2*Math.random() );
				
				if(number==2)
				{  
				TextOutput.setText("You Win");	
				ImageOutput.setIcon(allbroken);
				ImageOutput2.setIcon(bear);	//outputs win text and pictures
				}
				else
				{
				
				TextOutput.setText("You Loose");
				ImageOutput.setIcon(twobroken);
				ImageOutput2.setIcon(sticker);//outputs loose text and pictures
				
				}
			
			}
		});
				ImageOutput.setBounds(122, 83, 276, 113);
				panel.add(ImageOutput);
				
				JLabel lblNewLabel = new JLabel("Break the Plates! Click on Plates!");//directs the user to click on the plates, using text display box
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel.setForeground(new Color(153, 50, 204));
				lblNewLabel.setBounds(108, 33, 318, 27);
				panel.add(lblNewLabel);
		
	}
}
