import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewNUM extends JFrame{
	
	View view;
	
	String state;
	private JPanel middle,middleCenter;
	private JButton[] gridBtn;
	private String[] btnText = new String[]{"1", "2", "3", "4", "5", "6", "7","8", "9", "0","Back"};
	
	public ViewNUM () {

		layoutMiddle();
		
		System.err.println("new view created");
	
	}
	
	public void layoutMiddle()
	{


		middle = new JPanel();
		middle.setLayout(new BorderLayout());
		JPanel middleTop = new JPanel();
		middleCenter = new JPanel();
		middleTop.setBackground(Color.white);
		JLabel label = new JLabel("Select Letter Category");
		middleTop.add(label);
		middleCenter.setLayout(new GridLayout(2,3));

		gridBtn = new JButton[btnText.length];
		for (int i = 0; i < btnText.length; i++) {
			
			gridBtn[i] = new JButton(btnText[i]);
			middleCenter.add(gridBtn[i]);
		}

		middle.add(middleTop,BorderLayout.NORTH);
		middle.add(middleCenter,BorderLayout.CENTER);

	}
	
		
		
	public String[] getBtnText() {
		return btnText;
	}



	public JButton[] getGridBtn() {
		return gridBtn;
	}


	public JPanel getMiddle() {
		return middle;
	}


	public JPanel getMiddleCenter() {
		return middleCenter;
	}
	

}