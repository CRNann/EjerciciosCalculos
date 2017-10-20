package Circulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlador implements ActionListener, KeyListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.txtRadio.addKeyListener(this);
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        System.out.println("Codigo: " + ke.getKeyCode());
        if (ke.getKeyCode() == 10) {
            double n = Double.parseDouble(v.txtRadio.getText());
            v.etiArea.setText("Area: " + redondear(Math.PI * n * n));
            v.etiPerimetro.setText("Perimetro: " + redondear(Math.PI * 2 * n));
        }
    }

    public double redondear(double a) {
        double x = 0;
        int b = (int) (a * 100);
        x = (double) b / 100;
        return x;
    }

}
