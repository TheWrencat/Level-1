import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {

	public static void main(String[] args) {
		Chuckle_Clicker chuckleClicker = new Chuckle_Clicker();
		chuckleClicker.makeButtons();
		
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
	void makeButtons(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.setText("Joke");
		punchline.setText("Punchline");
		frame.pack();
		joke.addActionListener(this);
		punchline.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == joke){
			JOptionPane.showMessageDialog(null, "What do you call Chewbacca when he gets chocolate in his fur?");

		}
		if(e.getSource() == punchline){
			JOptionPane.showMessageDialog(null, "A chocolate chip wookie!");

		
		}

	}
}
