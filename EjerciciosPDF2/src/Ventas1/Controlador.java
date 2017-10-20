
package Ventas1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;
    int n1 = 0, n2 = 0, ts;
    double ti, tc;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnCalcular.setActionCommand("CALCULAR");
        v.btnCalcular.addActionListener(this);
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    public int esNumero(String x) {
        int n = 0;
        try {
            n = Integer.parseInt(x);
            return n;
        } catch (Exception ae) {
            return 0;
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("CALCULAR".equals(ae.getActionCommand())) {

            n1 = esNumero(v.txtPrecio.getText().toString());
            n2 = esNumero(v.txtUnidades.getText().toString());
            ts = n1 * n2;
            ti = ts * .16;
            tc = ts + ti;
            v.etiTotalS.setText(" " + ts);
            v.etiIva.setText(" " + ti);
            v.etiTotalC.setText(" " + tc);

        }
    }
}
