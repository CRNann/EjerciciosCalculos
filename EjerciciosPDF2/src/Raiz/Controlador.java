
package Raiz;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlador implements KeyListener{
    
    Vista v;

    public Controlador() {
         v = new Vista();
        v.setVisible(true);
        v.etiRaiz.addKeyListener(this);
        v.txtNumero.addKeyListener(this);
    }
    
    

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       
    }

    @Override
    public void keyReleased(KeyEvent ke) {
         try{
           double base, resultado;
           
           base=
                   Double.parseDouble(v.txtNumero.getText());
    
           resultado=Math.sqrt(base);
           v.etiRaiz.setText(String.valueOf(resultado));
       }
       catch(Exception E){
           v.etiRaiz.setText("ERROR");
       }
       
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
    
}
