import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {
	JButton button;

	public static void main(String[] args) {
		LotteryNumbers LotteryNumbers = new LotteryNumbers();
		LotteryNumbers.showLotteryNumbers();
	}
		
	void showLotteryNumbers(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		button = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.setText("Generate random numbers");
		frame.pack();

		
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object buttonE = e.getSource();
		if(buttonE.equals(button)){
			String random = "";
			for(int i=0; i<7; i++){
			random += number()+" ";
			
			
			}
			JOptionPane.showMessageDialog(null, random);

		}
	}
	
	public int number(){
		return new Random().nextInt(49);
	}
	
	
}
