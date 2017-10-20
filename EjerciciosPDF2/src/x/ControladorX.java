
package x;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ControladorX implements ActionListener, MouseListener{
    VistaX v;
    String x="";
    
    public ControladorX() {
        v = new VistaX();
        v.setVisible(true);
        v.btnBorrar.addActionListener(this);
        v.eti1.addMouseListener(this);
        v.eti2.addMouseListener(this);
        v.eti3.addMouseListener(this);
        v.eti4.addMouseListener(this);
        v.eti5.addMouseListener(this);
        v.eti6.addMouseListener(this);
        v.eti7.addMouseListener(this);
        v.eti8.addMouseListener(this);
        v.eti9.addMouseListener(this);
        v.eti10.addMouseListener(this);
        v.btnBorrar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == v.btnBorrar) {
             
             v.txtNumero.setText(" ");
             x=(" ");
              
         
         }
        
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == v.eti1) {
            x+=0;
        }
         if (me.getSource() == v.eti2) {
            x+=1;;
        }
          if (me.getSource() == v.eti3) {
            x+=2;
        }
           if (me.getSource() == v.eti4) {
           x+=3;
        }
            if (me.getSource() == v.eti5) {
           x+=4;
        }
             if (me.getSource() == v.eti6) {
           x+=5;
        }
              if (me.getSource() == v.eti7) {
            x+=6;
        }
               if (me.getSource() == v.eti8) {
            x+=7;
        }
                  if (me.getSource() == v.eti9) {
            x+=8;
        }
                     if (me.getSource() == v.eti10) {
            x+=9;
        }
          v.txtNumero.setText(x);             
       
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    public static void main(String[] args) {
        ControladorX c=new ControladorX();
    }

}
