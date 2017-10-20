
package Palabra;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{
    
    JTextField txtPalabra1, txtPalabra2;
    JButton btnConcatenar;
    JLabel etiTexto;

    public Vista() {
        this.setTitle("");
        this.setSize(350, 350);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        
        txtPalabra1= new JTextField();
        this.getContentPane().add( txtPalabra1, new AbsoluteConstraints(30, 40, 110, 30));
        txtPalabra2= new JTextField();
        this.getContentPane().add( txtPalabra2, new AbsoluteConstraints(160, 40, 110, 30));
        btnConcatenar= new JButton("CONCATENAR");
        this.getContentPane().add(btnConcatenar, new AbsoluteConstraints(90, 90, 140, 30));
        etiTexto= new JLabel();
        this.getContentPane().add( etiTexto, new AbsoluteConstraints(30, 140, 230, 30));
        etiTexto.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
    }
    
    public static void main(String[] args) {
        Vista v= new Vista();
        v.setVisible(true);
    }
    
    
}
