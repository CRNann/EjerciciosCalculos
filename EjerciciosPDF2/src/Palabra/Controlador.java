
package Palabra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener {
Vista v;

    public Controlador() {
         v = new Vista();
        v.setVisible(true);
        v.btnConcatenar.setActionCommand("CONCATENAR");
        v.btnConcatenar.addActionListener(this);
    }
    public static void main(String[] args) {
        Controlador c= new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==v.btnConcatenar){
            v.etiTexto.setText(v.txtPalabra1.getText()+" " +v.txtPalabra2.getText());
        }       
    }
    
}
