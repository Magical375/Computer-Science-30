/*

Program: MetricConversion.java          Last Date of this Revision: 14-February-2022

Purpose: Convert imperial measurement to metric or metric measurement to imperial with a user interface

Author: Laura Frede, 904269504
School: CHHS
Course: Computer Science 30
 

*/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

	public class MetricConversion 
	{
		private JFrame frame;
		private JTextField TextInput;
		/**
		 * Launch the application.
		 * @wbp.parser.entryPoint
		 */
			public static void main(String[] args) 
			{
					EventQueue.invokeLater(new Runnable() 
					{
						public void run() 
						{
								try 
								{
									MetricConversion window = new MetricConversion();
									window.frame.setVisible(true);  
								} 
								catch (Exception e) 
								{
								e.printStackTrace();  
								}
						}
					}
					);
			}
		/**
		 * Create the application.
		 */
			public MetricConversion() 
			{
				initialize();
			}//do not delete this or code refuses to parse!!!
		 /**
		 * Initialize the contents of the frame.
		 * 
		 */
		private void initialize() 
		{
			frame = new JFrame();
			frame.setBounds(100, 100, 565, 404);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			panel.setForeground(new Color(255, 250, 240));
			panel.setBackground(new Color(224, 255, 255));
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JComboBox ListOptions = new JComboBox();
			ListOptions.setBounds(34, 43, 226, 45);
			ListOptions.setFont(new Font("Tahoma", Font.PLAIN, 16));
			ListOptions.setModel(new DefaultComboBoxModel(new String[] {"Choose A Conversion", "Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
			ListOptions.setForeground(new Color(0, 0, 139));
			ListOptions.setBackground(new Color(235, 237, 237));
			panel.add(ListOptions);
			
			JLabel TextInstructions = new JLabel("Enter Number");
			TextInstructions.setBounds(34, 138, 226, 26);
			TextInstructions.setForeground(Color.BLACK);
			TextInstructions.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel.add(TextInstructions);
			
			TextInput = new JTextField();
			TextInput.setBounds(34, 186, 226, 50);
			TextInput.setBackground(Color.WHITE);
			TextInput.setForeground(new Color(0, 0, 128));
			panel.add(TextInput);
			TextInput.setColumns(10);
			
			JLabel TextOutput = new JLabel("");
			TextOutput.setBackground(Color.WHITE);
			TextOutput.setFont(new Font("Tahoma", Font.PLAIN, 16));
			TextOutput.setBounds(37, 278, 474, 50);
			panel.add(TextOutput);
			
			JLabel TextOutput2 = new JLabel("");
			TextOutput2.setBackground(new Color(235, 237, 237));
			TextOutput2.setForeground(new Color(0, 0, 139));
			TextOutput2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			TextOutput2.setBounds(167, 115, 372, 38);
			panel.add(TextOutput2);
	
			JButton Button = new JButton("Submit");
			Button.setBounds(293, 195, 102, 29);
			Button.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					double number = Double.valueOf(TextInput.getText()); 
					if(ListOptions.getSelectedItem().equals("Inches to Centimeters"))
					{
						TextOutput2.setText("Multiply inches by 2.45 for centimeters");
						double cMeasure = (number*2.54); 
						TextOutput.setText("The length is: "+ (cMeasure) + " centimeters.");    
					}
					else if(ListOptions.getSelectedItem().equals("Feet to Meters"))
					{
						TextOutput2.setText("Divide feet by 3.281 for meters");
						double mMeasure = (number/3.281); 
						TextOutput.setText("The length is: "+ (mMeasure) + " meters.");
					}
					else if(ListOptions.getSelectedItem().equals("Gallons to Liters"))
					{
							TextOutput2.setText("Multiply gallons by 3.785 for liters");
							double lMeasure = (number*3.785); 
							TextOutput.setText("The volume is: "+ (lMeasure) + " liters.");   
					}
					else
					{
						if(ListOptions.getSelectedItem().equals("Pounds to Kilograms"))
						{
							TextOutput2.setText("Divide the pounds by 2.205 for kilograms");
							double kMeasure = (number/2.205); 
							TextOutput.setText("The weight is: "+ (kMeasure) + " kilograms.");
						}
					}
				}
			}	
			);
			Button.setForeground(new Color(0, 0, 139));//puts button in GUI
			Button.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel.add(Button);
		}
	}
