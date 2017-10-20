
package Promedio;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{
    JTextField txtPrimer, txtSegundo, txtTercero;
    JLabel etiNota, etiResultado;
    JButton btnCalcular;

    public Vista() {
        this.setTitle("");
        this.setSize(350, 350);
        this.getContentPane().setLayout(new AbsoluteLayout()); 
        txtPrimer = new JTextField();
        this.getContentPane().add( txtPrimer, new AbsoluteConstraints(30, 40, 90, 30));
        txtSegundo = new JTextField();
        this.getContentPane().add( txtSegundo, new AbsoluteConstraints(30, 80, 90, 30));
        txtTercero = new JTextField();
        this.getContentPane().add( txtTercero, new AbsoluteConstraints(30, 120, 90, 30));
        btnCalcular = new JButton("CALCULAR");
        this.getContentPane().add( btnCalcular, new AbsoluteConstraints(80, 160, 110, 30));
        etiNota = new JLabel();
        this.getContentPane().add( etiNota, new AbsoluteConstraints(170, 55, 90, 30));
           etiNota.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        etiResultado = new JLabel();
        this.getContentPane().add( etiResultado, new AbsoluteConstraints(170, 105, 90, 30));
        etiResultado.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        
    }
     public static void main(String[] args) {
        Vista v= new Vista();
        v.setVisible(true);
    }
    
    
}
