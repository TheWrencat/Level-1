 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String R2D2 = "https://upload.wikimedia.org/wikipedia/en/3/39/R2-D2_Droid.png";
		// 2. create a variable of type "Component" that will hold your image
		Component picOne;
		// 3. use the "createImage()" method below to initialize your Component
		picOne = createImage(R2D2);
		// 4. add the image to the quiz window
		quizWindow.add(picOne);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answerOne = JOptionPane.showInputDialog("Who is this?");
		// 7. print "CORRECT" if the user gave the right answer
		
		int score = 0;
		
		if(answerOne.equals("r2d2")){
			System.out.println("Correct");
			score++;
		}else{
			System.out.println("Incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(picOne);
		// 10. find another image and create it (might take more than one line of code)
		String bigDog = "http://www.militaryfactory.com/armor/imgs/boston-dynamics-bigdog.jpg";
		// 11. add the second image to the quiz window
		Component picTwo;
		picTwo = createImage(bigDog);
		quizWindow.add(picTwo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answerTwo = JOptionPane.showInputDialog("What's this robot called?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answerTwo.equals("big dog")){
			System.out.println("Correct");
			score++;
		}else{
			System.out.println("Incorrect");
		}
		System.out.println("You got " +score+"/2 right.");

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





