import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Login {

	private JFrame frame;
	private JTextField UsernametextField;
	private JPasswordField PasswordtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("  User Name");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblUsername.setBounds(133, 55, 95, 25);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("  Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPassword.setBounds(133, 91, 95, 28);
		frame.getContentPane().add(lblPassword);
		
		UsernametextField = new JTextField();
		UsernametextField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		UsernametextField.setBounds(225, 58, 123, 22);
		frame.getContentPane().add(UsernametextField);
		UsernametextField.setColumns(10);
		
		PasswordtextField = new JPasswordField();
		PasswordtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		PasswordtextField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		PasswordtextField.setEchoChar('&');
		PasswordtextField.setBounds(225, 96, 123, 20);
		frame.getContentPane().add(PasswordtextField);
		
		JButton btnNewLogin = new JButton("Login");
		btnNewLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = UsernametextField.getText();
				String password = PasswordtextField.getText();
				
				if(password.contains("12345") && username.contains("Froebel"))
				{
					UsernametextField.setText(null);
					PasswordtextField.setText(null);
					StandardCalculator.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "  INVALID LOGIN   ","ERROR",JOptionPane.ERROR_MESSAGE);
					UsernametextField.setText(null);
					PasswordtextField.setText(null);
					
				}
				
					}
			
		});		btnNewLogin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewLogin.setBackground(UIManager.getColor("Button.background"));
		btnNewLogin.setBounds(240, 151, 89, 23);
		frame.getContentPane().add(btnNewLogin);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(180, 11, 116, 33);
		frame.getContentPane().add(lblNewLabel);
	}
}
