import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;

import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.CoreConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Main {
	
	// Conecta ao Banco de Dados
	
	/*private Connection conectar() {
		String url = "jdbc:sqlite:C://sqlite/SQLiteStudio/dbtests/test2.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}*/
	
	//Inserir os valores de tipo, modelo, construcao, data criacao e ref na tabela produto
	// SQL INSERT
	
	public void inserir(Connection conn, String tipo, String modelo, String construcao, String ref, String data_modelagem, String detalhes) {
		String sql = "INSERT INTO produto (ref_produto, tipo, modelo, construcao, data_modelagem, detalhes) VALUES(?,?,?,?,?,?)";
		//Connection conn = null;
		PreparedStatement pstmt =null;
		
		try{
			//conn = this.conectar();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ref);
			pstmt.setString(2, tipo);
			pstmt.setString(3, modelo);
			pstmt.setString(4, construcao);
			pstmt.setString(5, data_modelagem);
			pstmt.setString(6, detalhes);
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				pstmt.close();
				//conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	// Seleciona as determinadas colunas de uma tabela
	// SQL SLECT
	public void selecionar(Connection conn){
		String sql = "SELECT ref_produto, tipo, modelo FROM produto";
		//Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			//conn = this.conectar();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("ref_produto") + "\t" +
									rs.getString("tipo") + "\t" +
									rs.getString("modelo"));
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				//conn.close();
			}catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public void selecionarRef(Connection conn, String ref) {
		String sql = "SELECT ref_produto, tipo, modelo " +
				"FROM produto WHERE ref_produto = ?";
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			//conn = this. conectar();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,ref);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//
				System.out.println(rs.getString("ref_produto") + "\t" +
						rs.getString("tipo") + "\t" +
						rs.getString("modelo"));
				//
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				rs.close();
				pstmt.close();
				//conn.close();
			} catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
						
	}
	
	public void inserirColecao(Connection conn, String ref_colecao, String nome, String estacao, String ano) {
		// Criar colecao ou pegar uma pronta
		// Precisa criar o cliente primeiro ou mudar idcliente para aceitar null
		// Tirar quantidade de produtos
		// Usar REF como Primary Key
		String sqlColecao = "INSERT INTO colecao(ref_colecao, nome, estacao, ano) VALUES(?,?,?,?)";
		//Connection conn = null;
		PreparedStatement pstmt1 = null;
		
		try{
			//conn = this.conectar();
			pstmt1 = conn.prepareStatement(sqlColecao);
			pstmt1.setString(1, ref_colecao);
			pstmt1.setString(2, nome);
			pstmt1.setString(3, estacao);
			pstmt1.setString(4, ano);
			pstmt1.executeUpdate();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				pstmt1.close();
				//conn.close(); 
			}catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public void inserirProdutoColecao(Connection conn, String ref_colecao, String ref_produto) {
		
		String sqlItemColecao = "INSERT INTO item_colecao(ref_colecao, ref_produto) " + "VALUES(?,?)";
		//Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			//conn = this.conectar();
			pstmt = conn.prepareStatement(sqlItemColecao);
			pstmt.setString(1, ref_colecao);
			pstmt.setString(2,  ref_produto);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				pstmt.close();
				//conn.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	
	public void inserirCliente(Connection conn, Integer ref_cliente, String nome, String cidade, String estado, String pais, String endereco,
			Integer telefone, String email) {
		String sql = "INSERT INTO cliente (id_cliente, nome, cidade, estado, pais, endereco, telefone, email) VALUES(?,?,?,?,?,?,?,?)";
		//Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			//conn = this.conectar();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ref_cliente);
			pstmt.setString(2, nome);
			pstmt.setString(3, cidade);
			pstmt.setString(4, estado);
			pstmt.setString(5, pais);
			pstmt.setString(6, endereco);
			pstmt.setInt(7, telefone);
			pstmt.setString(8, email);
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				pstmt.close();
				//conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void selecionarItemColecao(Connection conn, String ref_colecao) {
		
		String sql = "SELECT ref_produto " +
				"FROM item_colecao WHERE ref_colecao = ?";
		
		String refproduto;
		//Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			//conn = this. conectar();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,ref_colecao);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				//
				System.out.println(rs.getString("ref_produto"));
				refproduto = rs.getString("ref_produto");
				this.selecionarRef(conn, refproduto);
				//
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				pstmt.close();
				//conn.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
			
		
		
	}
	
	/*private byte[] readPic(String file) {
		ByteArrayOutputStream bos = null; 
		FileInputStream fis = null;
		
		try {
			File f = new File(file);
			fis = new FileInputStream(f);
			byte[] buffer = new byte[1024];
			bos = new ByteArrayOutputStream();
			for(int tamanho; (tamanho = fis.read(buffer)) != -1;) {
				bos.write(buffer, 0, tamanho);
			}
			
		}catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}catch(IOException ex) {
			System.err.println(ex.getMessage());
		}finally {
			try {
				fis.close();
			}catch(IOException ex2) {
				System.err.println(ex2.getMessage());
			}
		}
		return bos != null? bos.toByteArray() : null;
			
	}*/
	
	/*public void updatePic(Connection conn, String ref_produto, String nomePic) {
		String sql = "UPDATE produto " +
				"SET detalhes = ? " +
				"WHERE ref_produto = ?";
		//Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			//conn = conectar();
			pstmt = conn.prepareStatement(sql);
			pstmt.setBytes(1, readPic(nomePic));
			pstmt.setString(2, ref_produto);
			System.out.println("aqui 2");
			((CoreConnection) conn).setBusyTimeout(10000);
			pstmt.executeUpdate();
			System.out.println("aqui 3");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				pstmt.close();
				//conn.close();
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
					
	}*/
	
	public ArrayList<byte[]> selectPic(Connection conn, String ref_produto) {
		
		//String sql = "SELECT img FROM imagem WHERE id =?";
		String sql = "SELECT detalhes FROM produto WHERE ref_produto=?";
		
		ResultSet rs = null;
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ArrayList<byte[]> list = new ArrayList();
		byte[] image = null;
		
		 try {
			 //conn = conectar();
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, ref_produto);
			 rs = pstmt.executeQuery();
			 
			 while(rs.next()) {
				 //image = rs.getBytes("img");
				 image = rs.getBytes("detalhes");
				 list.add(image);
				 image = null;
			 }
			 
			 //Image img = Toolkit.getDefaultToolkit().createImage(image);
			// ImageIcon icon =  new ImageIcon(img);
			// JLabel lPhoto = new JLabel();
			// lPhoto.setIcon(icon);
			// add(lPhoto);
			 //conn.close();
		 }catch(SQLException e) {
			 System.out.println(e.getMessage());
		 }finally {
			 try {
				 rs.close();
				 pstmt.close();
				 //conn.close();
			 }catch(SQLException ex) {
				 System.out.println(ex.getMessage());
			 }
		 }
		 
		 //setVisible(true);
		 //return image;
		 return list;
	}
	public void updateImagem(Connection conn, String ref_produto, String path) {
		try {
			FileInputStream fis;
			int num_rows = 0;
			File image = new File(path);
			fis = new FileInputStream(image);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			for(int readnum; (readnum = fis.read(buf)) != -1;) {
				bos.write(buf, 0, readnum);
			}
			
			fis.close();
			//PreparedStatement pstmt = conn.prepareStatement("INSERT INTO imagem (id, img) VALUES(?,?)");
			PreparedStatement pstmt = conn.prepareStatement("UPDATE produto SET detalhes = ? WHERE ref_produto =? " );
			pstmt.setBytes(1, bos.toByteArray());
			pstmt.setString(2, ref_produto);
			num_rows = pstmt.executeUpdate();
			if(num_rows > 0) {
				System.out.println("imagem salva");
			}
			
			pstmt.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}
	//GOOD TENTAR ASSIM
	// MUDAR PARA SALVAR OS PATH DOS ARQUIVOS COMO STRING
	public void abrirDocumento(String path) {
		
		try {
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	// USANDO DESKTOP
	public void abrirDocumento2(String path) {
		
		File f = new File(path);
		
		try {
			if(Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(f);
			}
			else {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
				//System.out.println("Ops");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// POSSIVEL USO PARA BACKUP ARQUIVO >> ARRAY BYTE >> ARQUIVO
	//
	public byte[] fileToArrayBytes(String path) {
		
		byte[] saida = new byte[1024];
		File f = new File(path);
		
		try {
			FileInputStream fis = new FileInputStream(f);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			
			for(int readNum; (readNum = fis.read(buf)) != -1;) {
				bos.write(buf, 0, readNum);
			}
			
			fis.close();
			saida = bos.toByteArray();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return saida;
	}
	
	public void arrayToFile(byte[] bites, String path) {
		
		File f = new File(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(bites);
			fos.flush();
			fos.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// ==========================================================================================
	public static void main(String[] args) {
		
		Connection conn = null;
		conn = SqliteDBConnection.conectar();
		Main m = new Main();
		
		//m.inserir(conn, "sapato", "modelo1","const1", "00123", "10/10/99", "TBD");
		//m.inserir(conn, "bolsa", "modelo2", "const1", "00124", "01/02/18", "TBD");
		//m.inserir(conn, "tenis", "modelo3", "const2", "00125", "20/11/15", "TBD");
		//m.inserir(conn, "sapato", "modelo2","const3", "00126", "05/07/08", "TBD");
		//m.inserir(conn, "sapato", "modelo3","const2", "00127", "18/09/17", "TBD");
		
		//m.selecionar(conn);
		
		//m.selecionarRef(conn, "00123");
		
		//Integer int1 = new Integer(9999999);
		//Integer int2 = new Integer(0000000);
		//m.inserirCliente(conn, int1, "Andre", "Canelinha", "SC", "Brasil", "Casa Bonita", int2, "andre@email");
		
		//m.inserirColecao(conn, "00001", "Colecao1", "verao", "01/01/18");
		//m.inserirColecao(conn, "00002", "Colecao2", "inverno", "02/02/18");
		
		//m.inserirProdutoColecao(conn, "00126", "00001");
		//m.inserirProdutoColecao(conn, "00001", "00125");
		
		//m.inserirProdutoColecao(conn, "00001", "00124");
		
		//m.selecionarItemColecao(conn, "00001");
		
		//m.selecionarRef(conn, "00127");
		/*m.updateImagem(conn, "00127", "C:\\sqlite\\Penguins.jpg");
		ArrayList<byte[]> images = m.selectPic(conn, "00127");
		Panel p = new Panel();
		int tam = images.size();
		for(int i=0; i<tam; i++) {
			byte[] image = images.get(i);
			p.addImagem(image);
		}*/
		
		//String p = "C:\\Users\\Acer\\Documents\\Registro de Pedidos Entrados no Mês.xlsx";
		String p2 = "C:\\sqlite\\Penguins.jpg";
		
		//String p3 = "C:\\Users\\Acer\\Documents\\Registro_teste.xlsx";
		String p4 = "C:\\sqlite\\Penguins_teste.jpg";
		
		byte[] b1 = m.fileToArrayBytes(p2);
		m.arrayToFile(b1, p4);
		m.abrirDocumento2(p4);
		//m.abrirDocumento2(p2);
		
	}

}
