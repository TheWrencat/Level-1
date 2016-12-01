import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.Messaging.SyncScopeHelper;

//The point of this exercise is to guide the students through making a Swing app from scratch. They should have practiced with a few of the UI recipes already.
//It’s a button that gives one of five random fortunes when clicked.
//
//Make a class, main method and showButton method. Put a printout in the showButton method and challenge kids to get it printing (they will need to instantiate class and call method on the instance). 
//	FortuneCookie fortune = new FortuneCookie();
//	fortune.showButton();
//
//
//Make a JFrame in showButton method and get it to show.
//jFrame.setVisible(true);
//
//
//Make a JButton and add it to the JFrame.
//JButton butt = new JButton();
//jFrame.add(butt);
//
//
//When the button is clicked, say “Woohoo”.
//Add an action listener to the button:jButton.addActionListener(this);
//Let your class implement ActionListener [use quick fix]
//Add unimplemented methods [use quick fix]
//Put JOptionPane pop-up inside actionPerformed() method
//
//
//Generate a random number between 0 and 4: 
//int rand = new Random().nextInt(5);
//
//
//Depending on which random number, show one of the five fortunes.
//
//
//Quiz kids (using easy buttons as buzzers) on all of this.

public class FortuneCookie implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();

	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
		cookie.showButton();
	}

	public void showButton() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button.setText("Open fortune cookie");
		
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
		switch (rand) {
		case 0:
			JOptionPane.showMessageDialog(null, "You will have a good day");
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "You will learn something important");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "You will buy another fortune cookie");
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "You will get what you want for Christmas");
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "You will sleep in tomorrow");
			break;
		}
		
		
	}
	
	
}