import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CelebBodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Documents/workspace/Level-1/src/Screen Shot 2016-08-03 at 6.34.46 PM.png";
	String secondImage = "/Users/league/Documents/workspace/Level-1/src/Screen Shot 2016-08-03 at 6.35.57 PM.png";
	String thirdImage = "/Users/league/Documents/workspace/Level-1/src/Screen Shot 2016-08-03 at 6.37.15 PM.png";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		 window.setSize(300, 300);
		// Make an int variable to hold the score.
			int score = 0;
		// Ask the user who this person is and store their answer
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
			String one = JOptionPane.showInputDialog("What Pokemon is this?");
			if (one.equals("pikachu")){
				score++;
			}else{
				JOptionPane.showMessageDialog(null, "Sorry, thats incorrect.");
			}
			JOptionPane.showMessageDialog(null, "You have "+score+" points so far!");
			showNextImage();
			
			String two = JOptionPane.showInputDialog("What Pokemon is this?");
			if (two.equals("mudkip")){
				score++;
			}else{
				JOptionPane.showMessageDialog(null, "Sorry, thats incorrect.");
			}
			JOptionPane.showMessageDialog(null, "You have "+score+" points so far!");
			showNextImage();

			
			String three = JOptionPane.showInputDialog("What Pokemon is this?");
			if (three.equals("flareon")){
				score++;
			}else{
				JOptionPane.showMessageDialog(null, "Sorry, thats incorrect.");
			}
			JOptionPane.showMessageDialog(null, "You got "+score+" points, good job!");
			showNextImage();

			

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		CelebBodyPartQuiz quiz = new CelebBodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


