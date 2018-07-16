import javax.swing.*;
import java.awt.*;

public class DemoSwings4
{

	public static void main(String args[])
	{
		//Creating a new frame
		JFrame frame=new JFrame("Grid Layout example");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new BorderLayout());

		//container to hold UI Frame
		Container c=frame.getContentPane();

		//ImageIcon
		//ImageIcon imageiconleft=new ImageIcon("Friend.jpg");
		//ImageIcon imageiconright=new ImageIcon("Friend2.jpg");


		//Label
		JButton button1=new JButton("top");
		JButton button2=new JButton("bottom");
		JButton button3=new JButton("right");
		JButton button4=new JButton("left");
		JButton button5=new JButton("center");


		c.add(button1, BorderLayout.NORTH);
		c.add(button2, BorderLayout.SOUTH);
		c.add(button3, BorderLayout.EAST);
		c.add(button4, BorderLayout.WEST);
		c.add(button5, BorderLayout.CENTER);



		//packing the imageicon to the container
		frame.pack();
	}
}