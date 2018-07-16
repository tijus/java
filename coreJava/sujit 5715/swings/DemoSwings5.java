import javax.swing.*;
import java.awt.*;

public class DemoSwings5
{

	public static void main(String args[])
	{
		//Creating a new frame
		JFrame frame=new JFrame("Grid Layout example");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());

		//container to hold UI Frame
		Container c=frame.getContentPane();

		//checkbox
		JCheckBox ch1=new JCheckBox("option1",true);
		JCheckBox ch2=new JCheckBox("option2");

		//adding checkbox to container
		c.add(ch1);
		c.add(ch2);


		//radiobutton
		JRadioButton radio1=new JRadioButton("Male",true);
		JRadioButton radio2=new JRadioButton("Female");

		//adding radiobutton to container
		c.add(radio1);
		c.add(radio2);

		//Grouping the radio buttons to work as one
		ButtonGroup group=new ButtonGroup();
		group.add(radio1);
		group.add(radio2);

		//Combobox
		JComboBox combox=new JComboBox();

		//adding various items to Combobox
		combox.addItem("Java");
		combox.addItem(".NET");
		combox.addItem("Android");
		combox.addItem("PHP");


		//finally adding combobox
		c.add(combox);




		//packing the imageicon to the container
		frame.pack();
	}
}