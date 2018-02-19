import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final JFileChooser openFileChooser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		openFileChooser = new JFileChooser();
		openFileChooser.setCurrentDirectory(new File("c:\\temp"));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 434, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistroProduto = new JLabel("Registrar Novo Produto");
		lblRegistroProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroProduto.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblRegistroProduto.setBackground(new Color(0, 0, 255));
		lblRegistroProduto.setForeground(new Color(255, 255, 255));
		lblRegistroProduto.setBounds(81, 11, 268, 52);
		panel.add(lblRegistroProduto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 74, 434, 451);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 245));
		textField.setBounds(220, 32, 157, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(245, 245, 245));
		textField_1.setBounds(220, 74, 157, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(245, 245, 245));
		textField_2.setBounds(220, 116, 157, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(245, 245, 245));
		textField_3.setBounds(220, 158, 157, 20);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Refer\u00EAncia:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(60, 32, 150, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(60, 74, 150, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblConstrucao = new JLabel("Modelo:");
		lblConstrucao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConstrucao.setForeground(Color.BLUE);
		lblConstrucao.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblConstrucao.setBackground(Color.WHITE);
		lblConstrucao.setBounds(60, 116, 150, 20);
		panel_1.add(lblConstrucao);
		
		JLabel lblConstrucao_1 = new JLabel("Constru\u00E7\u00E3o:");
		lblConstrucao_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConstrucao_1.setForeground(Color.BLUE);
		lblConstrucao_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblConstrucao_1.setBackground(Color.WHITE);
		lblConstrucao_1.setBounds(60, 158, 150, 20);
		panel_1.add(lblConstrucao_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(new Color(245, 245, 245));
		dateChooser.setBounds(220, 200, 157, 20);
		panel_1.add(dateChooser);
		
		JLabel lblDatModelagem = new JLabel("Data da Modelagem:");
		lblDatModelagem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatModelagem.setForeground(Color.BLUE);
		lblDatModelagem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDatModelagem.setBackground(Color.WHITE);
		lblDatModelagem.setBounds(60, 200, 150, 20);
		panel_1.add(lblDatModelagem);
		
		JLabel lblFichaTecnica = new JLabel("Ficha Tecnica:");
		lblFichaTecnica.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFichaTecnica.setForeground(Color.BLUE);
		lblFichaTecnica.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFichaTecnica.setBackground(Color.WHITE);
		lblFichaTecnica.setBounds(60, 242, 150, 20);
		panel_1.add(lblFichaTecnica);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(BorderFactory.createLineBorder(Color.black,1));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(245, 245, 245));
		lblNewLabel_2.setBounds(220, 242, 135, 20);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnNewButton.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblNewLabel_2.setText(txt);
						
					}else {
						lblNewLabel_2.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnNewButton.setBounds(357, 242, 20, 20);
		panel_1.add(btnNewButton);
		
	}
}
