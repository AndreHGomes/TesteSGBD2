import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;

public class Panel extends JFrame {
	
	public Panel() {
		
	}
	
	public void addImagem(byte[] image) {
		
        JPanel pane = new JPanel();

        JLabel label1 = new JLabel("help");
        JLabel label2 = new JLabel("33");
        pane.add(label1);
        pane.add(label2);


        setVisible(true);
        add(pane);
	
	 Image img = Toolkit.getDefaultToolkit().createImage(image);
	 ImageIcon icon =  new ImageIcon(img);
	 JLabel lPhoto = new JLabel();
	 lPhoto.setIcon(icon);
	 add(lPhoto);
	 
	 setVisible(true);
	 
	}
}
