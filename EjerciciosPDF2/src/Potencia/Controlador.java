
package Potencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    Vista v;

    public Controlador() {
       v= new Vista();
       v.setVisible(true);
        v.btnCalcular.addActionListener(this);
    }
    
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       try{
           double base, exp, resultado;
           
           base=
                   Double.parseDouble(v.txtBase.getText());
           exp=
                   Double.parseDouble(v.txtExponente.getText());
           resultado=Math.pow(base,exp);
           v.etiResultado.setText(String.valueOf(resultado));
       }
       catch(Exception E){
           v.etiResultado.setText("ERROR");
       }
    }
    
}
