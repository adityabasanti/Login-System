import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginbutton = new JButton("Login");
	JButton resetbutton = new JButton("Reset");
	JTextField UserIdField = new JTextField();
	JPasswordField UserPasswordField = new JPasswordField();
	JLabel UserIdLabel = new JLabel("UserID: ");
	JLabel UserPasswordLabel = new JLabel("Password: ");
	JLabel MessageLabel = new JLabel();
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> lofinInfoOriginal){
		logininfo = lofinInfoOriginal; // Now we have cpy of hashmap that is globally available to our loginpage so other methods can use this thing
		UserIdLabel.setBounds(50,100,75,25);
		UserPasswordLabel.setBounds(50,150,75,25);
		
		MessageLabel.setBounds(125,250,250,35);
		MessageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		UserIdField.setBounds(125,100,200,25);
		UserPasswordField.setBounds(125, 150, 200, 25);
		
		loginbutton.setBounds(125,200,100,25);
		loginbutton.setFocusable(false);
		loginbutton.addActionListener(this);
		
		resetbutton.setBounds(225,200,100,25);
        resetbutton.setFocusable(false);
		resetbutton.addActionListener(this);
		
		
		frame.add(UserIdLabel);
		frame.add(UserPasswordLabel);
		frame.add(UserIdField);
		frame.add(UserPasswordField);
		frame.add(MessageLabel);
		frame.add(loginbutton);
		frame.add(resetbutton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetbutton) {
		UserIdField.setText(null);
		UserPasswordField.setText(null);
		}
		
		if(e.getSource()==loginbutton) {
			String UserId = UserIdField.getText();
			String Password = String.valueOf(UserPasswordField.getPassword());
			
			
			if(logininfo.containsKey(UserId)) {
				if(logininfo.get(UserId).equals(Password)) {
					MessageLabel.setForeground(Color.green);
					MessageLabel.setText("Login Succesfull");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(UserId);					
				}
				else {
					MessageLabel.setForeground(Color.red);
					MessageLabel.setText("Wrong Password");
					
				}				
			}
			else {
				MessageLabel.setForeground(Color.red);
				MessageLabel.setText("Username Not Found");
			}
		}
				
		
	}

}
