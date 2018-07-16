import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class HandleEvent
{
	String type;

	static final int FONTSIZE=24;
	fontbi(String type,F)
	{

	}

	HandleEvent()
	{
		JFrame frame=new JFrame("Event Handlers");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());

		Container c = frame.getContentPane();


		final JLabel label1=new JLabel("Change");
		label1.setFont(new Font("Serif",Font.PLAIN, FONTSIZE));

		final JCheckBox ch1=new JCheckBox("Bold");
		final JCheckBox ch2=new JCheckBox("Itallic");

		ActionListener listener=new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				if (ch1.isSelected())
				{
					label1.setFont(new Font("Serif",Font.BOLD, FONTSIZE));
				}
				else if(ch2.isSelected())
				{
					label1.setFont(new Font("Serif",Font.ITALIC, FONTSIZE));
				}
				else if(ch1.isSelected() && ch2.isSelected())
				{
					label1.setFont(new Font("Serif",Font.BOLD, FONTSIZE));
				}
				else
				{
					label1.setFont(new Font("Serif",Font.PLAIN, FONTSIZE));
				}
				}

		};
		//register the actionlistner to button
		ch1.addActionListener(listener);
		ch2.addActionListener(listener);

		c.add(label1);
		c.add(ch1);
		c.add(ch2);

		frame.pack();


	}
}

class DemoEvent2
{
	public static void main(String args[])
	{
		HandleEvent e=new HandleEvent();
	}
}