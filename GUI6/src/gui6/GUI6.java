/*Background y foreground*/
package gui6;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI6 {

    public static void main(String[] args) {
        
        JFrame m = new JFrame("JTextField"); //marco
        JTextField jtext = new JTextField();
        
        m.setVisible(true);
        m.setSize(500,500);
        m.setDefaultCloseOperation(m.EXIT_ON_CLOSE);
        m.setLocationRelativeTo(null);
        
        Container c = m.getContentPane();
        c.setLayout(null);
        jtext.setBounds(100,50,200,30);
        
        Font f = new Font("Arial", Font.BOLD, 25);
        jtext.setFont(f);
        
        jtext.setBackground(Color.black);
        jtext.setForeground(Color.green);
        
        c.add(jtext);
        
    }
    
}
