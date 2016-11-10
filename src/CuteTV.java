import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuteTV implements ActionListener {
public static void main(String[] args) {
	CuteTV CuteTV = new CuteTV();
	CuteTV.showCuteTV();
}
	
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();

	void showCuteTV(){
	frame.setVisible(true);

	frame.add(panel);
	panel.add(one);
	panel.add(two);
	panel.add(three);
	one.setText("Ducks");
	two.setText("Frog");
	three.setText("Fluffy Unicorns");
	frame.pack();
	
	one.addActionListener(this);
	two.addActionListener(this);
	three.addActionListener(this);
	}
	void showDucks() {
			playVideo("Drirjl5K9Yk");
		}


		void showFrog() {
			playVideo("aSjCb-FfxhI");
		}
		
		void showFluffyUnicorns() {
			playVideo("qRC4Vk6kisY");
		}


		void playVideo(String videoID) {
			try {
		URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object button = e.getSource();
			if(button.equals(one)){
				showDucks();
			}
			if(button.equals(two)){
				showFrog();
			}
			if(button.equals(three)){
				showFluffyUnicorns();
			}
			
		}



}
