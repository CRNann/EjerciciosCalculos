
package Circulo;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Vista extends JFrame{
    
    JTextField txtRadio;
    JLabel etiArea, etiPerimetro;

    public Vista() {
        this.setTitle("RAIZ CUADRADA");
        this.setSize(250, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        txtRadio= new JTextField();
        this.getContentPane().add( txtRadio, new AbsoluteConstraints(30, 40, 90, 30));
        etiArea= new JLabel();
        this.getContentPane().add( etiArea, new AbsoluteConstraints(30, 90, 200, 30));
        etiArea.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        etiPerimetro= new JLabel();
        this.getContentPane().add( etiPerimetro, new AbsoluteConstraints(30, 130, 200, 30));
        etiPerimetro.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
    }
    public static void main(String[] args) {
        Vista v= new Vista();
        v.setVisible(true);
    }
 
    
    
    
}
