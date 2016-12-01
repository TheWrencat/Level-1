
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigTranslator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton butt = new JButton();
	JTextField text = new JTextField();
	JTextField words = new JTextField();

	public static void main(String[] args) {
		PigTranslator pig = new PigTranslator();
		pig.showButton();
	}

	public void showButton() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(text);
		panel.add(butt);
		panel.add(words);

		butt.setText("Translate");
		butt.addActionListener(this);

		text.setPreferredSize(new Dimension(500, 25));
		words.setPreferredSize(new Dimension(500, 25));
		words.setEditable(false);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PigLatinTranslator trans = new PigLatinTranslator();
		String theWords = text.getText();
		String translated = trans.translate(theWords);
		words.setText(translated);
	}

}
