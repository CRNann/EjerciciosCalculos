
package Promedio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
      Vista v;
   
    double promedio,n1 = 0, n2 = 0, n3=0, suma;

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
             n1 = esNumero(v.txtPrimer.getText().toString());
              n2 = esNumero(v.txtSegundo.getText().toString());
               n3 = esNumero(v.txtTercero.getText().toString());
            suma=n1+n2+n3;
            promedio=suma/3;
            v.etiResultado.setText(" " + promedio);
            
            if(promedio<5){
            v.etiNota.setBackground(Color.RED);    
        }else{
            v.etiNota.setBackground(Color.BLACK);
        }
        }
        
           
    }
}
