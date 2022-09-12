import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class WelcomePage {
	JFrame frame = new JFrame();
	JLabel welcomelabel = new JLabel("Hello Universe!!");
	
	WelcomePage(String UserId){
		welcomelabel.setBounds(0,0,200,35);
		welcomelabel.setFont(new Font(null,Font.PLAIN,25));
		welcomelabel.setText("Hello "+UserId);
		
		frame.add(welcomelabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
