package x;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class VistaX extends JFrame {

    JLabel eti1, eti2, eti3, eti4, eti5, eti6, eti7, eti8, eti9, eti10;
    JTextField txtNumero;
    JButton btnBorrar;

    public static void main(String[] args) {
        VistaX v = new VistaX();
        v.setVisible(true);
    }

    public VistaX() {
        this.setTitle("EJERCICIO 7");
        this.setSize(600, 600);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(30, 420, 90, 30));
        eti1 = new JLabel();
        this.getContentPane().add(eti1, new AbsoluteConstraints(30, 20, 90, 30));
        eti1.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti2 = new JLabel();
        this.getContentPane().add(eti2, new AbsoluteConstraints(30, 60, 90, 30));
        eti2.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti3 = new JLabel();
        this.getContentPane().add(eti3, new AbsoluteConstraints(30, 100, 90, 30));
        eti3.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti4 = new JLabel();
        this.getContentPane().add(eti4, new AbsoluteConstraints(30, 140, 90, 30));
        eti4.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti5 = new JLabel();
        this.getContentPane().add(eti5, new AbsoluteConstraints(30, 180, 90, 30));
        eti5.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti6 = new JLabel();
        this.getContentPane().add(eti6, new AbsoluteConstraints(30, 220, 90, 30));
        eti6.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti7 = new JLabel();
        this.getContentPane().add(eti7, new AbsoluteConstraints(30, 260, 90, 30));
        eti7.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti8 = new JLabel();
        this.getContentPane().add(eti8, new AbsoluteConstraints(30, 300, 90, 30));
        eti8.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti9 = new JLabel();
        this.getContentPane().add(eti9, new AbsoluteConstraints(30, 340, 90, 30));
        eti9.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        eti10 = new JLabel();
        this.getContentPane().add(eti10, new AbsoluteConstraints(30, 380, 90, 30));
        eti10.setBorder(new LineBorder(Color.LIGHT_GRAY, 5, true));
        btnBorrar = new JButton("BORRAR");
        this.getContentPane().add(btnBorrar, new AbsoluteConstraints(150, 90, 90, 30));

    }

}
