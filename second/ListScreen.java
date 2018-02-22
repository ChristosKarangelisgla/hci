import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListScreen extends JFrame{
	
	View view;
	
	String state;
	private JPanel middle,middleCenter, middleleft, middleRight;
	private JButton[] gridBtn;
	private String[] listOfSongs = {"Song1", "Song2", "Song3", "Song4", "Song5"};
	private String[] btnText = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private JComboBox comboBox;
	
	public ListScreen () {

		layoutMiddle();

	}
	
	public void layoutMiddle()
	{


		middle = new JPanel();
		middle.setLayout(new BorderLayout());
		JPanel middleTop = new JPanel();
		middleCenter = new JPanel();
		middleTop.setBackground(Color.white);
		JLabel label = new JLabel("List");
		middleTop.add(label);
		middleCenter.setLayout(new GridLayout(1,2));
		middleRight = new JPanel();
		middleleft = new JPanel();
		 
//		comboBox = new JComboBox(listOfSongs);
		
		gridBtn = new JButton[btnText.length];
		
		 JList list = new JList(listOfSongs);
		 JScrollPane scrollableList = new JScrollPane(list);
		 list.setFixedCellWidth(200);
		 list.setFixedCellHeight(30);
		 
		 middleRight.add(scrollableList);
		 middleCenter.add(middleRight);
		 
		 //middleCenter.add(scrollableList);
		
		 middleleft.setLayout(new GridLayout(3,3));
		 for (int i = 0; i < btnText.length; i++) {
				
				gridBtn[i] = new JButton(btnText[i]);
				middleleft.add(gridBtn[i]);
		 }
		 middleCenter.add(middleleft);
		 
		

		
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