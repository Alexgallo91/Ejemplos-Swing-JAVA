
package gui4;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI4 {

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
        c.add(jtext);
        
    }
    
}
