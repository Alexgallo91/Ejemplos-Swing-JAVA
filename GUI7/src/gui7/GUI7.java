/*JPasswordField*/
package gui7;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI7 {

    public static void main(String[] args) {
        
        JPasswordField pass = new JPasswordField();
        JFrame m = new JFrame("JTextField"); //marco
        JButton boton1 = new JButton();
        JButton boton2;
        ImageIcon imagen = new ImageIcon(m.getClass().
                           getResource("/gui7/images/image1.png"));
        Image imagenReducida = obtenerImage(imagen.getImage(), 100, 100);
        
        boton2 = new JButton(imagen);
        boton2.setSize(imagen.getIconWidth(), imagen.getIconHeight());

        //imagen en boton
        boton1.setIcon(new ImageIcon(imagenReducida));
        boton1.setBounds(50,200,100,100);
        boton1.setOpaque(false);
        boton1.setContentAreaFilled(false);
        boton1.setBorderPainted(false);
        
        
        m.setVisible(true);
        m.setSize(500,500);
        m.setDefaultCloseOperation(m.EXIT_ON_CLOSE);
        m.setLocationRelativeTo(null);
        
        Container c = m.getContentPane();
        c.setLayout(null);
        pass.setBounds(100,100,300,30);
        pass.setFont(new Font("Arial", Font.PLAIN, 30));
        pass.setBackground(Color.black);
        pass.setForeground(Color.green);
        c.add(pass);
        c.add(boton1);
       // c.add(boton2);
    }
    
    /*obttiene el image redimensionado*/
    public static Image obtenerImage(Image img, int w, int h)
    {
        BufferedImage imagenReducida = new BufferedImage(w,h,
                                           BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = imagenReducida.createGraphics();
        g2.drawImage(img,0,0, w, h, null);
        g2.dispose();
        
        return imagenReducida;
    }
    
}
