import javax.swing.*;
import java.awt.*;

public class DemoSwings2
{

	public static void main(String args[])
	{
		//Creating a new frame
		JFrame frame=new JFrame("My new GUI");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());

		//container to hold UI Frame
		Container c=frame.getContentPane();

		//ImageIcon
		ImageIcon imageiconleft=new ImageIcon("Friend.jpg");
		ImageIcon imageiconright=new ImageIcon("Friend2.jpg");


		//Label
		JLabel label1=new JLabel("Welcome");
		JLabel label2=new JLabel(imageiconleft);
		JLabel label3=new JLabel("Welcome",imageiconright,JLabel.LEFT);

		//adding labels to container
		c.add(label1);
		c.add(label2);
		c.add(label3);

		//packing the imageicon to the container
		frame.pack();
	}
}