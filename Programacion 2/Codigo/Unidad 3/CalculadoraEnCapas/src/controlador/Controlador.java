
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.Modelo;
import vista.Vista;

/**
 * Nicolas sallei 
 */
public class Controlador implements ActionListener {
private Vista vista;
private Modelo modelo;

    public Controlador (){
        this.vista = new Vista();
        this.modelo = new Modelo();
        this.vista.setVisible(true);
        
        this.vista.jB_Suma.addActionListener(this);
        this.vista.jB_Resta.addActionListener(this);
        this.vista.jBReset.addActionListener(this);
        
        this.vista.jB_multiplicacion.addActionListener(this);
        this.vista.jB_raiz.addActionListener(this);
        this.vista.jB_pow.addActionListener(this);
        this.vista.jB_division.addActionListener(this);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(modelo.ValidaDato(this.vista.jT1.getText()) && modelo.ValidaDato(this.vista.jT2.getText())){
         if(e.getSource().equals(vista.jB_Suma)){
            this.vista.jT_Resul.setText(String.valueOf(modelo.Suma(Double.parseDouble(this.vista.jT1.getText()), Double.parseDouble(this.vista.jT2.getText()))));
         }
         else if(e.getSource().equals(vista.jB_Resta)){
            this.vista.jT_Resul.setText(String.valueOf(modelo.Resta(Double.parseDouble(this.vista.jT1.getText()), Double.parseDouble(this.vista.jT2.getText()))));   
         }
         else if(e.getSource().equals(vista.jBReset)){
            this.vista.jT_Resul.setText("");  
            this.vista.jT1.setText(""); 
            this.vista.jT2.setText(""); 
         }
         else if(e.getSource().equals(vista.jB_multiplicacion)){
         this.vista.jT_Resul.setText(String.valueOf(modelo.Multiplicacion(Double.parseDouble(this.vista.jT1.getText()), Double.parseDouble(this.vista.jT2.getText()))));
         }
         else if(e.getSource().equals(vista.jB_pow)){
         this.vista.jT_Resul.setText(String.valueOf(modelo.Pow(Double.parseDouble(this.vista.jT1.getText()), Double.parseDouble(this.vista.jT2.getText()))));
         
         }
         else if (e.getSource().equals(vista.jB_raiz)){
         this.vista.jT_Resul.setText(String.valueOf(modelo.Raiz(Double.parseDouble(this.vista.jT1.getText()), Double.parseDouble(this.vista.jT2.getText()))));
         }else if (e.getSource().equals(vista.jB_division)){
         this.vista.jT_Resul.setText(String.valueOf(modelo.Division(Double.parseDouble(this.vista.jT1.getText()), Double.parseDouble(this.vista.jT2.getText()))));
         
         }
        
          
      }
      else{
           JOptionPane.showMessageDialog(null, "DEBE INGRESAR SOLO NUMEROS");
            this.vista.jT_Resul.setText("");  
            this.vista.jT1.setText(""); 
            this.vista.jT2.setText(""); 
      }
    }
    
    
    
}
