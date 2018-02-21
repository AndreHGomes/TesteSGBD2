import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaResultado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResultado frame = new TelaResultado();
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
	public TelaResultado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 884, 562);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 255));
		panel_1.setBounds(0, 0, 879, 74);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Modelo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(102, 204, 255));
		lblNewLabel.setBounds(10, 11, 859, 52);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 74, 351, 460);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Referencia:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(102, 204, 255));
		lblNewLabel_1.setBounds(40, 20, 150, 20);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(new Color(102, 204, 255));
		lblTipo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTipo.setBounds(40, 50, 150, 20);
		panel_2.add(lblTipo);
		
		JLabel lblNomeDoModelo = new JLabel("Nome do Modelo:");
		lblNomeDoModelo.setForeground(new Color(102, 204, 255));
		lblNomeDoModelo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNomeDoModelo.setBounds(40, 80, 150, 20);
		panel_2.add(lblNomeDoModelo);
		
		JLabel lblConstrucao = new JLabel("Constru\u00E7\u00E3o:");
		lblConstrucao.setForeground(new Color(102, 204, 255));
		lblConstrucao.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblConstrucao.setBounds(40, 110, 150, 20);
		panel_2.add(lblConstrucao);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(200, 110, 150, 20);
		panel_2.add(lblNewLabel_2);
		
		JLabel label = new JLabel("New label");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label.setBounds(200, 80, 150, 20);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_1.setBounds(200, 50, 150, 20);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_2.setBounds(200, 20, 150, 20);
		panel_2.add(label_2);
		
		JLabel lblColecao = new JLabel("Cole\u00E7\u00E3o:");
		lblColecao.setForeground(new Color(102, 204, 255));
		lblColecao.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblColecao.setBounds(40, 140, 150, 20);
		panel_2.add(lblColecao);
		
		JLabel lblDataModelagem = new JLabel("Data Modelagem:");
		lblDataModelagem.setForeground(new Color(102, 204, 255));
		lblDataModelagem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDataModelagem.setBounds(40, 170, 150, 20);
		panel_2.add(lblDataModelagem);
		
		JLabel lblVendidoAoCliente = new JLabel("Vendido ao Cliente:");
		lblVendidoAoCliente.setForeground(new Color(102, 204, 255));
		lblVendidoAoCliente.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblVendidoAoCliente.setBounds(40, 200, 150, 20);
		panel_2.add(lblVendidoAoCliente);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_3.setBounds(200, 140, 150, 20);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_4.setBounds(200, 170, 150, 20);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_5.setBounds(200, 200, 150, 20);
		panel_2.add(label_5);
		
		JLabel lblComentarios = new JLabel("Detalhes Tecnicos:");
		lblComentarios.setBackground(new Color(255, 255, 255));
		lblComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblComentarios.setForeground(new Color(102, 204, 255));
		lblComentarios.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblComentarios.setBounds(40, 230, 228, 20);
		panel_2.add(lblComentarios);
		
		JButton btnNewButton = new JButton("Ficha Tecnica do Produto");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 204, 255));
		btnNewButton.setBounds(40, 274, 228, 23);
		panel_2.add(btnNewButton);
		
		JButton btnListaDeMateriais = new JButton("Lista de  Materiais");
		btnListaDeMateriais.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnListaDeMateriais.setForeground(Color.WHITE);
		btnListaDeMateriais.setBackground(new Color(102, 204, 255));
		btnListaDeMateriais.setBounds(40, 324, 228, 23);
		panel_2.add(btnListaDeMateriais);
		
		JButton btnFormularioDeCompras = new JButton("Formulario de Compras e Custos");
		btnFormularioDeCompras.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnFormularioDeCompras.setForeground(Color.WHITE);
		btnFormularioDeCompras.setBackground(new Color(102, 204, 255));
		btnFormularioDeCompras.setBounds(40, 374, 228, 23);
		panel_2.add(btnFormularioDeCompras);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(350, 333, 529, 201);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Lista dos Modelos do Produto:");
		lblNewLabel_3.setForeground(new Color(102, 204, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(5, 5, 211, 20);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Modelo 1");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1.setBounds(15, 45, 150, 23);
		panel_3.add(btnNewButton_1);
		
		JButton button = new JButton("Modelo 1");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setBackground(new Color(102, 204, 255));
		button.setBounds(15, 80, 150, 23);
		panel_3.add(button);
		
		JButton button_1 = new JButton("Modelo 1");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_1.setBackground(new Color(102, 204, 255));
		button_1.setBounds(15, 115, 150, 23);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("Modelo 1");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_2.setBackground(new Color(102, 204, 255));
		button_2.setBounds(15, 150, 150, 23);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Modelo 1");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_3.setBackground(new Color(102, 204, 255));
		button_3.setBounds(188, 45, 150, 23);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("Modelo 1");
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_4.setBackground(new Color(102, 204, 255));
		button_4.setBounds(188, 80, 150, 23);
		panel_3.add(button_4);
		
		JButton button_5 = new JButton("Modelo 1");
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_5.setBackground(new Color(102, 204, 255));
		button_5.setBounds(188, 115, 150, 23);
		panel_3.add(button_5);
		
		JButton button_6 = new JButton("Modelo 1");
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_6.setBackground(new Color(102, 204, 255));
		button_6.setBounds(188, 150, 150, 23);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("Modelo 1");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_7.setBackground(new Color(102, 204, 255));
		button_7.setBounds(360, 45, 150, 23);
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("Modelo 1");
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_8.setBackground(new Color(102, 204, 255));
		button_8.setBounds(360, 80, 150, 23);
		panel_3.add(button_8);
		
		JButton button_9 = new JButton("Modelo 1");
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_9.setBackground(new Color(102, 204, 255));
		button_9.setBounds(360, 115, 150, 23);
		panel_3.add(button_9);
		
		JButton button_10 = new JButton("Modelo 1");
		button_10.setForeground(Color.WHITE);
		button_10.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_10.setBackground(new Color(102, 204, 255));
		button_10.setBounds(360, 150, 150, 23);
		panel_3.add(button_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 204, 255));
		panel_4.setBounds(350, 74, 265, 259);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		ImageIcon ic2 = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
		Image i2 = ic2.getImage();
		Image ni2 = i2.getScaledInstance(254, 249, java.awt.Image.SCALE_SMOOTH);
		ic2 = new ImageIcon(ni2);
		lblNewLabel_5.setIcon(ic2);
		lblNewLabel_5.setBounds(5, 5, 254, 249);
		panel_4.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 204, 255));
		panel_5.setBounds(615, 74, 264, 259);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		ImageIcon ic = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		Image i = ic.getImage();
		Image ni = i.getScaledInstance(254, 249, java.awt.Image.SCALE_SMOOTH);
		ic = new ImageIcon(ni);
		lblNewLabel_4.setIcon(ic);
		lblNewLabel_4.setBounds(5, 5, 254, 249);
		panel_5.add(lblNewLabel_4);
	}
}
