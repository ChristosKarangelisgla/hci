import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{

	View view;

	String statee;

	ViewM viewM;
	ViewS viewS;
	ViewAG viewAG;
	ViewHN viewHN;
	ViewOU viewOU;
	ViewVZ viewVZ;
	ViewNUM viewNUM;
	ViewSMB viewSMB;
	ListScreen listScreen;



	public Controller () {

		statee = "main";

		view = new View(this);
		viewM = new ViewM();
		view.add(viewM.getMiddle(),BorderLayout.CENTER);
		revalidateView();

		viewS = new ViewS();
		viewAG = new ViewAG();
		viewHN = new ViewHN();
		viewHN = new ViewHN();
		viewOU = new ViewOU();
		viewVZ = new ViewVZ();
		viewNUM = new ViewNUM();
		viewSMB = new ViewSMB();
		listScreen = new ListScreen();



		for (int i = 0; i < viewM.getBtnText().length; i++) {

			viewM.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewS.getBtnText().length; i++) {

			viewS.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewAG.getBtnText().length; i++) {

			viewAG.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewHN.getBtnText().length; i++) {

			viewHN.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewOU.getBtnText().length; i++) {

			viewOU.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewVZ.getBtnText().length; i++) {

			viewVZ.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewNUM.getBtnText().length; i++) {

			viewNUM.getGridBtn()[i].addActionListener(this);

		}

		for (int i = 0; i < viewSMB.getBtnText().length; i++) {

			viewSMB.getGridBtn()[i].addActionListener(this);

		}



	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//-------------------------1. MAIN MENU BUTTONS

		if(e.getSource() == viewM.getGridBtn()[0]){

			view.remove(viewM.getMiddle());
			revalidateView();

			view.add(listScreen.getMiddle(),BorderLayout.CENTER);
			revalidateView();

		}
		
		if(e.getSource() == viewM.getGridBtn()[1]){

			view.remove(viewM.getMiddle());
			revalidateView();

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();

		}
		
		if(e.getSource() == viewM.getGridBtn()[2]){

			view.remove(viewM.getMiddle());
			revalidateView();

			view.add(viewS.getMiddle(),BorderLayout.CENTER);
			revalidateView();

		}
		

		//--------------------------2. SELLECTION BUTTONS


		//AH category
		if(e.getSource() == viewS.getGridBtn()[0]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewAG.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//HN category
		if(e.getSource() == viewS.getGridBtn()[1]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewHN.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}



		//OU category
		if(e.getSource() == viewS.getGridBtn()[2]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewOU.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//VZ category
		if(e.getSource() == viewS.getGridBtn()[3]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewVZ.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//NUM category
		if(e.getSource() == viewS.getGridBtn()[4]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewNUM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//SMB category
		if(e.getSource() == viewS.getGridBtn()[5]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewSMB.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//Return
		if(e.getSource() == viewS.getGridBtn()[6]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//Back
		if(e.getSource() == viewS.getGridBtn()[7]){

			view.remove(viewS.getMiddle());
			revalidateView();

			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}






		//---------------------------3. AG CATEGORY BUTTONS

		if(e.getSource() == viewAG.getGridBtn()[7]){

			view.remove(viewAG.getMiddle());
			revalidateView();

			//To Do-------------
			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//---------------------------4 HN CATEGORY BUTTONS

		if(e.getSource() == viewHN.getGridBtn()[7]){

			view.remove(viewHN.getMiddle());
			revalidateView();

			//To Do-------------
			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//---------------------------5 OU CATEGORY BUTTONS

		if(e.getSource() == viewOU.getGridBtn()[7]){

			view.remove(viewOU.getMiddle());
			revalidateView();

			//To Do-------------
			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}



		//---------------------------6 VZ CATEGORY BUTTONS

		if(e.getSource() == viewVZ.getGridBtn()[5]){

			view.remove(viewVZ.getMiddle());
			revalidateView();

			//To Do-------------
			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//---------------------------7 NUM CATEGORY BUTTONS

		if(e.getSource() == viewNUM.getGridBtn()[10]){

			view.remove(viewNUM.getMiddle());
			revalidateView();

			//To Do-------------
			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}


		//---------------------------8 SMB CATEGORY BUTTONS

		if(e.getSource() == viewSMB.getGridBtn()[7]){

			view.remove(viewSMB.getMiddle());
			revalidateView();

			//To Do-------------
			view.add(viewM.getMiddle(),BorderLayout.CENTER);
			revalidateView();
		}

	}


	public void revalidateView() {
		view.revalidate();
		view.repaint();
	}

	public String getStatee() {
		return statee;
	}


	public void setStatee(String statee) {
		this.statee = statee;
	}

}
