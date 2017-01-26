import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JButton butOne = new JButton();
	JButton butTwo = new JButton();
	JButton butThree = new JButton();
	public void Setup(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
	
		frame.setVisible(true);
		frame.add(panel);
		panel.add(butOne);
		panel.add(butTwo);
		panel.add(butThree);
		butOne.setText("Fart One");
		butTwo.setText("Fart Two");
		butThree.setText("Fart Three");
		butOne.addActionListener(this);
		butTwo.addActionListener(this);
		butThree.addActionListener(this);
		frame.pack();
	}
	
	public static void main(String[] args) {
		TootMachine toot = new TootMachine();
		toot.Setup();
		
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		if (clicked == butOne){
		playSound("fart.wav");
		}
		if (clicked == butTwo){
			playSound("FartTwo.wav");
			}
		if (clicked == butThree){
			playSound("FartThree.wav");
			}
	}

}
