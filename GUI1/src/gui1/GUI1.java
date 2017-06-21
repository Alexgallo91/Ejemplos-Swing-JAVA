package gui1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI1 {
   
    public static void main(String[] args) {
        
        Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension(900, 500);
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //pantalla centrada en cualquier pantalla
        frame.setBounds(ss.width/2 - frameSize.width/2, 
                        ss.height/2 - frameSize.height/2, 
                        frameSize.width, 
                        frameSize.height);
        
        //frame.setLocation(null);
        frame.setTitle("Primer frame");
        
        //estableciendo icono
        ImageIcon icono = new ImageIcon(frame.getClass().getResource(
                              "/images/image1.png"));
        
        frame.setIconImage(icono.getImage());
        
        Container cont = frame.getContentPane();
        cont.setBackground(Color.black);
        
        //no se puede rededimensionar
        frame.setResizable(false);
        
    }
    
}
