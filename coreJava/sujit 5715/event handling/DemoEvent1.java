import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class HandleEvent
{
	HandleEvent()
	{
		JFrame frame=new JFrame("Event Handlers");
		frame.setVisible(true);
		frame.setSize(400,400);


		Container c = frame.getContentPane();
		frame.setLayout(new BoxLayout(c, 1));

		final JLabel label1=new JLabel("Name");
		final JTextField text1=new JTextField(4);

		JButton button1=new JButton("Click to change");

		ActionListener listener=new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				label1.setText(text1.getText());
				//label1.setText("Sujit");
				}
		};
		//register the actionlistner to button
		button1.addActionListener(listener);

		c.add(label1);
		c.add(text1);
		c.add(button1);

		frame.pack();


	}
}

class DemoEvent1
{
	public static void main(String args[])
	{
		HandleEvent e=new HandleEvent();
	}
}