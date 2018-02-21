import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaProcura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProcura frame = new TelaProcura();
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
	public TelaProcura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 884, 562);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 255));
		panel_1.setBounds(0, 0, 884, 74);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Procurar Item");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(102, 204, 255));
		lblNewLabel.setBounds(10, 11, 859, 52);
		panel_1.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Produto", "Colecao", "Cliente"}));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setBounds(170, 300, 150, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Referencia", "Modelo", "Tipo", "Construcao", "Nome", "Cidade", "Estado", "Estacao", "Ano"}));
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(335, 300, 150, 20);
		panel.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(500, 300, 200, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("PROCURAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(102, 204, 255));
		btnNewButton.setBounds(452, 385, 150, 30);
		panel.add(btnNewButton);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancelar.setBackground(new Color(128, 128, 128));
		btnCancelar.setBounds(282, 385, 150, 30);
		panel.add(btnCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("Procurar por...");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(102, 204, 255));
		lblNewLabel_1.setBounds(170, 263, 150, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblOnde = new JLabel("onde...");
		lblOnde.setForeground(new Color(102, 204, 255));
		lblOnde.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblOnde.setBounds(335, 263, 150, 20);
		panel.add(lblOnde);
		
		JLabel lblIgualA = new JLabel("\u00E9 igual a...");
		lblIgualA.setForeground(new Color(102, 204, 255));
		lblIgualA.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblIgualA.setBounds(500, 263, 150, 20);
		panel.add(lblIgualA);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		ImageIcon ic3 = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\lupa.png");
		Image i3 = ic3.getImage();
		Image ni3 = i3.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		ic3 = new ImageIcon(ni3);
		lblNewLabel_2.setIcon(ic3);
		lblNewLabel_2.setBounds(342, 85, 200, 200);
		panel.add(lblNewLabel_2);
	}
}
