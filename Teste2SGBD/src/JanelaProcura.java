import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class JanelaProcura extends JFrame {
	private JTextField txtLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaProcura frame = new JanelaProcura();
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
	public JanelaProcura() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setForeground(new Color(211, 211, 211));
		txtLogin.setText("Usuario");
		txtLogin.setBounds(130, 91, 159, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(211, 211, 211));
		passwordField.setToolTipText("");
		passwordField.setColumns(10);
		passwordField.setBounds(130, 131, 159, 20);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(130, 210, 159, 20);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\cadeado.png"));
		lblNewLabel.setBounds(110, 0, 200, 200);
		getContentPane().add(lblNewLabel);
	}
}
