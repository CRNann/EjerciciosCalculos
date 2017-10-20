
package Ventas1;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{
    
    JTextField txtUnidades, txtPrecio;
    JLabel etiIva, etiTotalS, etiTotalC;
    JButton btnCalcular;
    public Vista() {
        this.setTitle("VENTAS");
        this.setSize(350, 350);
        this.getContentPane().setLayout(new AbsoluteLayout()); 
        txtUnidades = new JTextField();
        this.getContentPane().add( txtUnidades, new AbsoluteConstraints(30, 80, 90, 30));
        txtPrecio = new JTextField();
        this.getContentPane().add( txtPrecio, new AbsoluteConstraints(30, 120, 90, 30));
        
        btnCalcular = new JButton("CALCULAR");
        this.getContentPane().add( btnCalcular, new AbsoluteConstraints(80, 190, 130, 30));
        
        etiTotalS = new JLabel();
        this.getContentPane().add( etiTotalS, new AbsoluteConstraints(200, 40, 90, 30));
         etiTotalS.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        etiIva = new JLabel();
        this.getContentPane().add( etiIva, new AbsoluteConstraints(200, 90, 90, 30));
         etiIva.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        etiTotalC = new JLabel();
        this.getContentPane().add( etiTotalC, new AbsoluteConstraints(200, 150, 90, 30));
         etiTotalC.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
    }
    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}