import javax.swing.*;

/**
Creates the JFrame and adds the components to the page
*/
public class EasterGUI extends JFrame
{
	public static void main(String[] args)
	{
		Easter easter = new Easter(2014);
		EasterComponent eastComp = new EasterComponent(easter, 2000, 2030, 2014);
		int frameSize = 300;
		
		JFrame frame = new JFrame();
		frame.setSize(frameSize, frameSize / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Easter date calculator");
		frame.add(eastComp);
		frame.setVisible(true);
	}
}
