package gui2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI2 {
    
    public static void main(String[] args) {
         
        Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(900, 500);
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //pantalla centrada en cualquier pantalla
        frame.setBounds(ss.width / 2 - frameSize.width / 2,
                ss.height / 2 - frameSize.height / 2,
                frameSize.width,
                frameSize.height);

        //frame.setLocation(null);
        frame.setTitle("Primer frame");

        //estableciendo icono
        ImageIcon icono = new ImageIcon(frame.getClass().getResource(
                "/images/image1.png"));
        ImageIcon icono2 = new ImageIcon(frame.getClass().getResource(
                "/images/image2.jpg"));
        
        frame.setIconImage(icono.getImage());
        
        Container cont = frame.getContentPane();
        cont.setLayout(null);
        cont.setBackground(Color.black);

        //no se puede rededimensionar
        frame.setResizable(false);
        JLabel label = new JLabel("Hola soy una etiqueta");
        label.setForeground(Color.white);
        label.setBounds(300, 300, 300, 30);
        cont.add(label);
        
        /*cambiando el texto de la etiqueta*/
        label.setText("Hola cambie el texto");
        //estableciendo fuente
        Font f = new Font("Arial", Font.PLAIN, 30);
        label.setFont(f);
        
        //estableciendo una imagen a un jlabel
        JLabel imagenEtiqueta = new JLabel(icono2);
        //frame.add(imagenEtiqueta);
        imagenEtiqueta.setBounds(20,20,400,400);
    }
}
