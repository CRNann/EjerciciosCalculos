
package Ecuacion;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JTextField txtA, txtB, txtC;
    JLabel etiX;
    JButton btnAceptar;

    public Vista() {
        this.setTitle("ECUACION DE SEGUNDO GRADO");
        this.setSize(450, 350);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtA = new JTextField(0);
        txtB = new JTextField(0);
        txtC = new JTextField(0);
        etiX = new JLabel("");
        btnAceptar = new JButton("Aceptar");
        this.getContentPane().add(txtA, new AbsoluteConstraints(20, 20, 50, 30));
        this.getContentPane().add(txtB, new AbsoluteConstraints(20, 70, 50, 30));
        this.getContentPane().add(txtC, new AbsoluteConstraints(20, 120, 50, 30));
        this.getContentPane().add(etiX, new AbsoluteConstraints(100, 70, 260, 50));
        etiX.setBackground(Color.white);
        this.getContentPane().add(btnAceptar, new AbsoluteConstraints(100, 175, 90, 50));

    }

    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
    }

}
