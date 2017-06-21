package gui3;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class GUI3 {
    
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("etiqueta con imagen");
        ImageIcon icono = new ImageIcon(ventana.getClass().
                          getResource("/gui3/images/image1.png"));
        
        /*bordes*/
        Border blackline, raisedetched, lowerdetched, raisedbevel, lowerbevel;
        
        blackline = BorderFactory.createLineBorder(Color.black);
        raisedbevel = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
        lowerdetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        lowerbevel = BorderFactory.createLoweredBevelBorder();
        
        /*etiquetas*/
        
        JLabel label = new JLabel("Texto de la etiqueta",
                                  icono, JLabel.LEFT);
        label.setBorder(blackline);
        
        JLabel label2 = new JLabel("Texto de la etiqueta",
                                  icono, JLabel.RIGHT);
        label2.setBorder(raisedbevel);
        
        JLabel label3 = new JLabel("Texto de la etiqueta",
                                  icono, JLabel.CENTER);
        label3.setBorder(lowerbevel);
        
        JLabel label4 = new JLabel("Texto de la etiqueta",
                                  icono, JLabel.LEADING);
        label4.setBorder(raisedbevel);
        
        JLabel label5 = new JLabel("Texto de la etiqueta",
                                  icono, JLabel.TRAILING);
        label5.setBorder(lowerbevel);
        
        ventana.add(label);
        ventana.add(label2);
        ventana.add(label3);
        ventana.add(label4);
        ventana.add(label5);
       
        ventana.setSize(400,700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new GridLayout(5, 0));
     
    }
}
