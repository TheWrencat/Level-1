import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class BinaryConverter implements ActionListener {
	
	JTextField text = new JTextField();
	JTextField Text = new JTextField();

	
	void Setup(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton but = new JButton();
	
	frame.add(panel);
	panel.add(text);
	panel.add(but);
	panel.add(Text);
	
	frame.setVisible(true);
	Dimension wordSize = new Dimension(500, 25);
	text.setPreferredSize(wordSize);
	Text.setPreferredSize(wordSize);
	Text.setEditable(false);
	but.setText("Convert");
	but.addActionListener(this);
	frame.pack();
	
	}
	
	public static void main(String[] args) {
		
		BinaryConverter binaryConverter = new BinaryConverter();
		binaryConverter.Setup();
	}
	
	int convert(String binary) {
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 if(!Pattern.matches("\\A[01]+\\Z", binary)) {
			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				return 0;
		 }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	String toTranslate = text.getText();
	int translated = convert(toTranslate);
	String translatedLetter = convertLetter(translated);
	Text.setText(translatedLetter);
		
	}
	
 String convertLetter(int asciiValue) {
  // 	 int asciiValue = Integer.parseInt(binary, 2);
   	 char theLetter = (char) asciiValue;
   	 return "" + theLetter;
    }

	
}
