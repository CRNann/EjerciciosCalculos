
package Potencia;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame{
    JTextField txtBase, txtExponente;
    JButton btnCalcular;
    JLabel etiResultado;

    public Vista() {
        this.setTitle("POTENCIAS");
        this.setSize(350, 350);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        txtBase= new JTextField(20);
        this.getContentPane().add( txtBase, new AbsoluteConstraints(30, 40, 90, 30));
        txtExponente= new JTextField(20);
        this.getContentPane().add( txtExponente, new AbsoluteConstraints(30, 100, 90, 30));
        btnCalcular= new JButton("CALCULAR");
        this.getContentPane().add( btnCalcular, new AbsoluteConstraints(80, 150 , 110, 30));
        etiResultado= new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(150, 70, 90, 30));
        etiResultado.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
    }
    
    public static void main(String[] args) {
        Vista v= new Vista();
        v.setVisible(true);
    }
    
}
