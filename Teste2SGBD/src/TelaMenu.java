import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
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
	public TelaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 884, 560);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setIcon(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(102, 204, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		lblNewLabel.setBounds(342, 80, 200, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REGISTRAR ITEM");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 204, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(342, 230, 200, 30);
		panel.add(btnNewButton);
		
		JButton btnProcurarProduto = new JButton("PROCURAR ITEM");
		btnProcurarProduto.setForeground(Color.WHITE);
		btnProcurarProduto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnProcurarProduto.setBackground(new Color(102, 204, 255));
		btnProcurarProduto.setBounds(342, 280, 200, 30);
		panel.add(btnProcurarProduto);
		
		JButton btnDeletarProduto = new JButton("EDITAR ITEM");
		btnDeletarProduto.setForeground(Color.WHITE);
		btnDeletarProduto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnDeletarProduto.setBackground(new Color(102, 204, 255));
		btnDeletarProduto.setBounds(342, 330, 200, 30);
		panel.add(btnDeletarProduto);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancelar.setBackground(new Color(128, 128, 128));
		btnCancelar.setBounds(342, 459, 200, 30);
		panel.add(btnCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\pontehercilioluz.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 884, 560);
		panel.add(lblNewLabel_1);
	}
}
