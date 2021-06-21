import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class StandardCalculator {

	private JFrame frame;
	private JTextField textField_num2;
	private JTextField textField_num1;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					StandardCalculator window = new StandardCalculator();
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
	public StandardCalculator() {
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
		
		textField_num2 = new JTextField();
		textField_num2.setBounds(293, 44, 126, 41);
		frame.getContentPane().add(textField_num2);
		textField_num2.setColumns(10);
		
		textField_num1 = new JTextField();
		textField_num1.setBounds(121, 44, 126, 41);
		frame.getContentPane().add(textField_num1);
		textField_num1.setColumns(10);
		
		JButton ADD = new JButton("+");
		ADD.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		ADD.setBackground(UIManager.getColor("Button.background"));
		ADD.setForeground(new Color(0, 0, 139));
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try  {
					num1 = Integer.parseInt(textField_num1.getText());
					num2 = Integer.parseInt(textField_num2.getText());
				    ans = num1 + num2;
				    textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e1){
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
				/*double num1,num2,answer;
				try  {
					num1 = Double.parseDouble(textField_num1.getText());
					num2 = Double.parseDouble(textField_num2.getText());
				    answer = num1 + num2;
				    textFieldAns.setText(Double.toString(ans));
				} catch (Exception e1){
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}*/
			}
		});
		ADD.setBounds(10, 98, 89, 45);
		frame.getContentPane().add(ADD);
		
		JButton MINUS = new JButton("-");
		MINUS.setBackground(UIManager.getColor("Button.background"));
		MINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try  {
					num1 = Integer.parseInt(textField_num1.getText());
					num2 = Integer.parseInt(textField_num2.getText());
				    ans = num1 - num2;
				    textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e1){
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
			}
		});
		MINUS.setBounds(121, 98, 89, 45);
		frame.getContentPane().add(MINUS);
		
		JButton DIVIDE = new JButton("/");
		DIVIDE.setBackground(UIManager.getColor("Button.background"));
		DIVIDE.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		DIVIDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,ans;
				try  {
					num1 = Double.parseDouble(textField_num1.getText());
					num2 = Double.parseDouble(textField_num2.getText());
				    ans = num1 / num2;
				    textFieldAns.setText(Double.toString(ans));
				} catch (Exception e1){
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
				
			}
		});
		DIVIDE.setBounds(330, 96, 89, 45);
		frame.getContentPane().add(DIVIDE);
		
		JButton MULTIPLY = new JButton("*");
		MULTIPLY.setBackground(UIManager.getColor("Button.background"));
		MULTIPLY.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		MULTIPLY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try  {
					num1 = Integer.parseInt(textField_num1.getText());
					num2 = Integer.parseInt(textField_num2.getText());
				    ans = num1 * num2;
				    textFieldAns.setText(Integer.toString(ans));
				} catch (Exception e1){
					JOptionPane.showMessageDialog(null,"Please Enter Valid Number");
				}
			}
		});
		MULTIPLY.setBounds(220, 98, 89, 45);
		frame.getContentPane().add(MULTIPLY);
		
		JLabel lblNewLabel = new JLabel("ANSWER");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(79, 188, 83, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(172, 184, 168, 52);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel IbINewLabel_1 = new JLabel("FROEBEL INTERNATIONAL PUPIL'S CALCULATOR");
		IbINewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		IbINewLabel_1.setBounds(10, 0, 414, 32);
		frame.getContentPane().add(IbINewLabel_1);
		
		JButton btnNewButton = new JButton("Message");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"You cannot divide by 0"
						+ "\n"
						+ "Natural numbers are the counting numbers eg. 1,2,3..."
						+ "\n"
						+ "Whole number are the counting numbers including zero eg. 0,1,2..."
						+ "\n"
						+ "Integers are negative and positive whole numbers. eg. ...-2,-1,0,1,2...");
			}
		});
		btnNewButton.setBounds(10, 44, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
