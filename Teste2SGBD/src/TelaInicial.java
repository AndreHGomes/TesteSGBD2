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
import javax.swing.border.LineBorder;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textReferencia;
	private JTextField textTipo;
	private JTextField textNomeModelo;
	private JTextField textConstrucao;
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
		setBounds(100, 100, 900, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		openFileChooser = new JFileChooser();
		openFileChooser.setCurrentDirectory(new File("c:\\temp"));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBounds(0, 0, 884, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegistroProduto = new JLabel("Registrar Item");
		lblRegistroProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroProduto.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblRegistroProduto.setBackground(new Color(0, 0, 255));
		lblRegistroProduto.setForeground(new Color(255, 255, 255));
		lblRegistroProduto.setBounds(308, 11, 268, 52);
		panel.add(lblRegistroProduto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 74, 884, 492);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textReferencia = new JTextField();
		textReferencia.setBackground(new Color(245, 245, 245));
		textReferencia.setBounds(220, 32, 157, 20);
		panel_1.add(textReferencia);
		textReferencia.setColumns(10);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBackground(new Color(245, 245, 245));
		textTipo.setBounds(220, 74, 157, 20);
		panel_1.add(textTipo);
		
		textNomeModelo = new JTextField();
		textNomeModelo.setColumns(10);
		textNomeModelo.setBackground(new Color(245, 245, 245));
		textNomeModelo.setBounds(220, 116, 157, 20);
		panel_1.add(textNomeModelo);
		
		textConstrucao = new JTextField();
		textConstrucao.setColumns(10);
		textConstrucao.setBackground(new Color(245, 245, 245));
		textConstrucao.setBounds(220, 158, 157, 20);
		panel_1.add(textConstrucao);
		
		JLabel lblReferencia = new JLabel("Refer\u00EAncia:");
		lblReferencia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblReferencia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblReferencia.setForeground(new Color(102, 204, 255));
		lblReferencia.setBounds(60, 32, 150, 20);
		panel_1.add(lblReferencia);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(new Color(102, 204, 255));
		lblTipo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTipo.setBackground(new Color(255, 255, 255));
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(60, 74, 150, 20);
		panel_1.add(lblTipo);
		
		JLabel lblNomeModelo = new JLabel("Nome do Modelo:");
		lblNomeModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeModelo.setForeground(new Color(102, 204, 255));
		lblNomeModelo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNomeModelo.setBackground(Color.WHITE);
		lblNomeModelo.setBounds(60, 116, 150, 20);
		panel_1.add(lblNomeModelo);
		
		JLabel lblConstrucao = new JLabel("Constru\u00E7\u00E3o:");
		lblConstrucao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConstrucao.setForeground(new Color(102, 204, 255));
		lblConstrucao.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblConstrucao.setBackground(Color.WHITE);
		lblConstrucao.setBounds(60, 158, 150, 20);
		panel_1.add(lblConstrucao);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setOpaque(true);
		dateChooser.setBackground(new Color(245, 245, 245));
		dateChooser.setBounds(220, 200, 157, 20);
		panel_1.add(dateChooser);
		
		JLabel lblDatModelagem = new JLabel("Data da Modelagem:");
		lblDatModelagem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatModelagem.setForeground(new Color(102, 204, 255));
		lblDatModelagem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDatModelagem.setBackground(Color.WHITE);
		lblDatModelagem.setBounds(60, 200, 150, 20);
		panel_1.add(lblDatModelagem);
		
		JLabel lblFichaTecnica = new JLabel("Ficha Tecnica:");
		lblFichaTecnica.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFichaTecnica.setForeground(new Color(102, 204, 255));
		lblFichaTecnica.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFichaTecnica.setBackground(Color.WHITE);
		lblFichaTecnica.setBounds(60, 242, 150, 20);
		panel_1.add(lblFichaTecnica);
		
		JLabel lblFichaTecnica_show = new JLabel("");
		lblFichaTecnica_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblFichaTecnica_show.setOpaque(true);
		lblFichaTecnica_show.setForeground(new Color(0, 0, 0));
		lblFichaTecnica_show.setBackground(new Color(245, 245, 245));
		lblFichaTecnica_show.setBounds(220, 242, 135, 20);
		panel_1.add(lblFichaTecnica_show);
		
		JButton btnFichaTecnica = new JButton("...");
		btnFichaTecnica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnFichaTecnica.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblFichaTecnica_show.setText(txt);
						
					}else {
						lblFichaTecnica_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnFichaTecnica.setBounds(357, 242, 20, 20);
		panel_1.add(btnFichaTecnica);
		
		JLabel lblFormularioCustos_show = new JLabel("");
		lblFormularioCustos_show.setOpaque(true);
		lblFormularioCustos_show.setForeground(Color.BLACK);
		lblFormularioCustos_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblFormularioCustos_show.setBackground(new Color(245, 245, 245));
		lblFormularioCustos_show.setBounds(220, 284, 135, 20);
		panel_1.add(lblFormularioCustos_show);
		
		JLabel lblFormularioDeCompras = new JLabel("Formulario de Custos:");
		lblFormularioDeCompras.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormularioDeCompras.setForeground(new Color(102, 204, 255));
		lblFormularioDeCompras.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFormularioDeCompras.setBackground(Color.WHITE);
		lblFormularioDeCompras.setBounds(60, 284, 150, 20);
		panel_1.add(lblFormularioDeCompras);
		
		JLabel lblListaMateriais_show = new JLabel("");
		lblListaMateriais_show.setOpaque(true);
		lblListaMateriais_show.setForeground(Color.BLACK);
		lblListaMateriais_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblListaMateriais_show.setBackground(new Color(245, 245, 245));
		lblListaMateriais_show.setBounds(561, 284, 135, 20);
		panel_1.add(lblListaMateriais_show);
		
		JLabel lblListaDeMateriais = new JLabel("Lista de Materiais:");
		lblListaDeMateriais.setHorizontalAlignment(SwingConstants.RIGHT);
		lblListaDeMateriais.setForeground(new Color(102, 204, 255));
		lblListaDeMateriais.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblListaDeMateriais.setBackground(Color.WHITE);
		lblListaDeMateriais.setBounds(401, 284, 150, 20);
		panel_1.add(lblListaDeMateriais);
		
		JButton btnFormularioCustos = new JButton("...");
		btnFormularioCustos.setBounds(357, 284, 20, 20);
		btnFormularioCustos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnFormularioCustos.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblFormularioCustos_show.setText(txt);
						
					}else {
						lblFormularioCustos_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		
		panel_1.add(btnFormularioCustos);
		
		JButton btnListaMateriais = new JButton("...");
		btnListaMateriais.setBounds(698, 284, 20, 20);
		btnListaMateriais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnListaMateriais.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblListaMateriais_show.setText(txt);
						
					}else {
						lblListaMateriais_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		panel_1.add(btnListaMateriais);
		
		JLabel lblModelo_1_show = new JLabel("");
		lblModelo_1_show.setOpaque(true);
		lblModelo_1_show.setForeground(Color.BLACK);
		lblModelo_1_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblModelo_1_show.setBackground(new Color(245, 245, 245));
		lblModelo_1_show.setBounds(561, 32, 135, 20);
		panel_1.add(lblModelo_1_show);
		
		JButton btnModelo_1 = new JButton("...");
		btnModelo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnModelo_1.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblModelo_1_show.setText(txt);
						
					}else {
						lblModelo_1_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnModelo_1.setBounds(698, 32, 20, 20);
		panel_1.add(btnModelo_1);
		
		JLabel lblModelo_1 = new JLabel("Modelo 1:");
		lblModelo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_1.setForeground(new Color(102, 204, 255));
		lblModelo_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblModelo_1.setBackground(Color.WHITE);
		lblModelo_1.setBounds(401, 32, 150, 20);
		panel_1.add(lblModelo_1);
		
		JLabel lblModelo_2_show = new JLabel("");
		lblModelo_2_show.setOpaque(true);
		lblModelo_2_show.setForeground(Color.BLACK);
		lblModelo_2_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblModelo_2_show.setBackground(new Color(245, 245, 245));
		lblModelo_2_show.setBounds(561, 74, 135, 20);
		panel_1.add(lblModelo_2_show);
		
		JButton btnModelo_2 = new JButton("...");
		btnModelo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnModelo_2.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblModelo_2_show.setText(txt);
						
					}else {
						lblModelo_2_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnModelo_2.setBounds(698, 74, 20, 20);
		panel_1.add(btnModelo_2);
		
		JLabel lblModelo_2 = new JLabel("Modelo 2:");
		lblModelo_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_2.setForeground(new Color(102, 204, 255));
		lblModelo_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblModelo_2.setBackground(Color.WHITE);
		lblModelo_2.setBounds(401, 74, 150, 20);
		panel_1.add(lblModelo_2);
		
		JLabel lblModelo_3 = new JLabel("Modelo 3:");
		lblModelo_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_3.setForeground(new Color(102, 204, 255));
		lblModelo_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblModelo_3.setBackground(Color.WHITE);
		lblModelo_3.setBounds(401, 116, 150, 20);
		panel_1.add(lblModelo_3);
		
		JLabel lblModelo_3_show = new JLabel("");
		lblModelo_3_show.setOpaque(true);
		lblModelo_3_show.setForeground(Color.BLACK);
		lblModelo_3_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblModelo_3_show.setBackground(new Color(245, 245, 245));
		lblModelo_3_show.setBounds(561, 116, 135, 20);
		panel_1.add(lblModelo_3_show);
		
		JButton btnModelo_3 = new JButton("...");
		btnModelo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnModelo_3.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblModelo_3_show.setText(txt);
						
					}else {
						lblModelo_3_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnModelo_3.setBounds(698, 115, 20, 20);
		panel_1.add(btnModelo_3);
		
		JLabel lblModelo_4 = new JLabel("Modelo 4:");
		lblModelo_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_4.setForeground(new Color(102, 204, 255));
		lblModelo_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblModelo_4.setBackground(Color.WHITE);
		lblModelo_4.setBounds(401, 158, 150, 20);
		panel_1.add(lblModelo_4);
		
		JLabel lblModelo_4_show = new JLabel("");
		lblModelo_4_show.setOpaque(true);
		lblModelo_4_show.setForeground(Color.BLACK);
		lblModelo_4_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblModelo_4_show.setBackground(new Color(245, 245, 245));
		lblModelo_4_show.setBounds(561, 158, 135, 20);
		panel_1.add(lblModelo_4_show);
		
		JButton btnModelo_4 = new JButton("...");
		btnModelo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnModelo_4.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblModelo_4_show.setText(txt);
						
					}else {
						lblModelo_4_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnModelo_4.setBounds(698, 157, 20, 20);
		panel_1.add(btnModelo_4);
		
		JLabel lblModelo_5 = new JLabel("Modelo 5:");
		lblModelo_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_5.setForeground(new Color(102, 204, 255));
		lblModelo_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblModelo_5.setBackground(Color.WHITE);
		lblModelo_5.setBounds(401, 200, 150, 20);
		panel_1.add(lblModelo_5);
		
		JLabel lblModelo_5_show = new JLabel("");
		lblModelo_5_show.setOpaque(true);
		lblModelo_5_show.setForeground(Color.BLACK);
		lblModelo_5_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblModelo_5_show.setBackground(new Color(245, 245, 245));
		lblModelo_5_show.setBounds(561, 200, 135, 20);
		panel_1.add(lblModelo_5_show);
		
		JButton btnModelo_5 = new JButton("...");
		btnModelo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnModelo_5.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblModelo_5_show.setText(txt);
						
					}else {
						lblModelo_5_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnModelo_5.setBounds(698, 200, 20, 20);
		panel_1.add(btnModelo_5);
		
		JLabel lblModelo_6 = new JLabel("Modelo 6:");
		lblModelo_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo_6.setForeground(new Color(102, 204, 255));
		lblModelo_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblModelo_6.setBackground(Color.WHITE);
		lblModelo_6.setBounds(401, 242, 150, 20);
		panel_1.add(lblModelo_6);
		
		JLabel lblModelo_6_show = new JLabel("");
		lblModelo_6_show.setOpaque(true);
		lblModelo_6_show.setForeground(Color.BLACK);
		lblModelo_6_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblModelo_6_show.setBackground(new Color(245, 245, 245));
		lblModelo_6_show.setBounds(561, 242, 135, 20);
		panel_1.add(lblModelo_6_show);
		
		JButton btnModelo_6 = new JButton("...");
		btnModelo_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int choosenFile = openFileChooser.showOpenDialog((btnModelo_6.getParent()).getParent());
					if(choosenFile == JFileChooser.APPROVE_OPTION) {
						File fopen = openFileChooser.getSelectedFile();
						String txt = fopen.getAbsolutePath();
						lblModelo_6_show.setText(txt);
						
					}else {
						lblModelo_6_show.setText("Nenhum Arquivo Selecionado.");
					}
				}catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
		btnModelo_6.setBounds(698, 242, 20, 20);
		panel_1.add(btnModelo_6);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setOpaque(true);
		btnCancelar.setBackground(new Color(128, 128, 128));
		btnCancelar.setBounds(266, 423, 150, 36);
		panel_1.add(btnCancelar);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRegistrar.setOpaque(true);
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(new Color(102, 204, 255));
		btnRegistrar.setBounds(462, 423, 150, 36);
		panel_1.add(btnRegistrar);
		
		JLabel lblImgProduto_1 = new JLabel("Imagem do Produto:");
		lblImgProduto_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImgProduto_1.setForeground(new Color(102, 204, 255));
		lblImgProduto_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblImgProduto_1.setBackground(Color.WHITE);
		lblImgProduto_1.setBounds(60, 326, 150, 20);
		panel_1.add(lblImgProduto_1);
		
		JLabel lblImgProduto_1_show = new JLabel("");
		lblImgProduto_1_show.setOpaque(true);
		lblImgProduto_1_show.setForeground(Color.BLACK);
		lblImgProduto_1_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblImgProduto_1_show.setBackground(new Color(245, 245, 245));
		lblImgProduto_1_show.setBounds(220, 326, 135, 20);
		panel_1.add(lblImgProduto_1_show);
		
		JButton btnImgProduto_1 = new JButton("...");
		btnImgProduto_1.setBounds(357, 326, 20, 20);
		panel_1.add(btnImgProduto_1);
		
		JLabel lblImgProduto_2_show = new JLabel("");
		lblImgProduto_2_show.setOpaque(true);
		lblImgProduto_2_show.setForeground(Color.BLACK);
		lblImgProduto_2_show.setBorder(new LineBorder(new Color(169, 169, 169)));
		lblImgProduto_2_show.setBackground(new Color(245, 245, 245));
		lblImgProduto_2_show.setBounds(561, 326, 135, 20);
		panel_1.add(lblImgProduto_2_show);
		
		JButton btnImgProduto_2 = new JButton("...");
		btnImgProduto_2.setBounds(698, 326, 20, 20);
		panel_1.add(btnImgProduto_2);
		
		JLabel lblImgProduto_2 = new JLabel("Imagem do Produto:");
		lblImgProduto_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImgProduto_2.setForeground(new Color(102, 204, 255));
		lblImgProduto_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblImgProduto_2.setBackground(Color.WHITE);
		lblImgProduto_2.setBounds(401, 326, 150, 20);
		panel_1.add(lblImgProduto_2);
		
	}
}
