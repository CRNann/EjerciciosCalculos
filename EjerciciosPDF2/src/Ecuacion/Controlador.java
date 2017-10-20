
package Ecuacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnAceptar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String res, res2;

        if (v.btnAceptar == ae.getSource()) {
            double r = 0, x = 0, x1 = 0;
            r = (Integer.parseInt(v.txtB.getText()) * Integer.parseInt(v.txtB.getText())) - (4 * (Integer.parseInt(v.txtA.getText()) * Integer.parseInt(v.txtC.getText())));
            try {
                res = "X:";
                res2 = "X1:";

                if (r == 0) {

                    x = (-1 * (Integer.parseInt(v.txtB.getText()))) / (2 * Integer.parseInt(v.txtA.getText()));
                    v.etiX.setText(res + " " + x);
                    
                }
                if (r > 0) {
                    double e = Math.sqrt(r);
                    x = ((-1 * (Integer.parseInt(v.txtB.getText()))) + e) / ((2 * Integer.parseInt(v.txtA.getText())));
                    x1 = ((-1 * (Integer.parseInt(v.txtB.getText()))) - e) / ((2 * Integer.parseInt(v.txtA.getText())));

                    v.etiX.setText(res + " " + x + " " + res2 + " " + x1);

                }
                if(r<0){
                     res = "I N C O R R E C T O";
                v.etiX.setText(res);
                }
            } catch (Exception e) {
                res = "I N C O R R E C T O";
                v.etiX.setText(res);
            }

        }
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
