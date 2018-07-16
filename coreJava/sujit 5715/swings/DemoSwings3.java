import javax.swing.*;
import java.awt.*;

public class DemoSwings3
{

	public static void main(String args[])
	{
		//Creating a new frame
		JFrame frame=new JFrame("Grid Layout example");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(4,2));

		//container to hold UI Frame
		Container c=frame.getContentPane();

		//ImageIcon
		//ImageIcon imageiconleft=new ImageIcon("Friend.jpg");
		//ImageIcon imageiconright=new ImageIcon("Friend2.jpg");


		//Label
		JLabel label1=new JLabel("Username");
		JLabel label2=new JLabel("Password");

		//TextField
		JTextField text1=new JTextField(10);
		JTextField text2=new JTextField(10);

		//Buttons
		JButton button1=new JButton("Login");
		JButton button2=new JButton("Cancel");

		//adding labels to container
		c.add(label1);
		c.add(text1);
		c.add(label2);
		c.add(text2);
		c.add(button1);
		c.add(button2);


		//packing the imageicon to the container
		frame.pack();
	}
}