
package Raiz;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{
    JTextField txtNumero;
    JLabel etiRaiz;

    public Vista() {
        this.setTitle("RAIZ CUADRADA");
        this.setSize(250, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        txtNumero= new JTextField();
        this.getContentPane().add( txtNumero, new AbsoluteConstraints(30, 40, 90, 30));
        etiRaiz= new JLabel();
        this.getContentPane().add( etiRaiz, new AbsoluteConstraints(30, 90, 90, 30));
        etiRaiz.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
    }
   
    public static void main(String[] args) {
        Vista v= new Vista();
        v.setVisible(true);
    }
    
}
