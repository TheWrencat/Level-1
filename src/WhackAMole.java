import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int molesHit = 0;

//	Make a drawButtons method that takes a random number as a parameter. It should make a GUI like this, but the “mole!” location is random.
//	[Hint: set the size of the frame rather than packing it.]
	void Setup(){
	
		int randomNum = new Random().nextInt(24);
		drawButtons(randomNum);
		frame.setSize(350, 200);
		
		
	}
	void drawButtons(int randomNum){
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(350, 200);
		
		for(int i = 0; i <24; i++){
			JButton button = new JButton();
			
			if(i== randomNum){
				button.setText("mole!");
			}
			panel.add(button);
			button.addActionListener(this);
			
		}	frame.add(panel);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		WhackAMole whack = new WhackAMole();
		whack.Setup();
		
	}


//If they click on a button other than “mole!”, use this speak() method to call them a dork. 
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}


//Dispose of the frame and draw the buttons anew.

//After they’ve whacked 10 moles, call this endGame() method.
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}

//Progressively insult them if they hit something other than the mole! button.
//If they get click an empty button twice, call them an idiot.
//If they click an empty button three times, call them a moron.
//If they click an empty button four times, call them a complete waste of atoms.
//[Use a switch statement for extra amazingness.]

//Call this playSound() method when they hit a mole.
private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
@Override
public void actionPerformed(ActionEvent e) {
	JButton but = (JButton) e.getSource();
	if(but.getText().equals("mole!")){
		//reset
		frame.dispose();
		int randomNum = new Random().nextInt(24);
		System.out.println(randomNum);
		drawButtons(randomNum);
		//counter
		
		
	}else{
		speak("really?");
	}
}


}
