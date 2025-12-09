package cscorner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class InfoFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogingmailcom;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoFrame frame = new InfoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InfoFrame() {
		setTitle("INFO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 14));
		textField.setBounds(226, 62, 137, 25);
		textField.setText("17253252");
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtLogingmailcom = new JTextField();
		txtLogingmailcom.setFont(new Font("Dialog", Font.BOLD, 14));
		txtLogingmailcom.setBounds(35, 62, 168, 25);
		txtLogingmailcom.setText("Login@gmail.com");
		contentPane.add(txtLogingmailcom);
		txtLogingmailcom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Validation");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(166, 10, 106, 32);
		contentPane.add(lblNewLabel);

	}

}
