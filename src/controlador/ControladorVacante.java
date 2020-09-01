/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmIngreso;
import vista.frmRegistro;
import vista.frmRrhh;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.Vacante;
import modelo.Vectorvacante;

/**
 *
 * @author Master
 */
public class ControladorVacante {
    frmRrhh frrhh;
    frmIngreso fIngreso;
    frmRegistro fRegistro;
    Vectorvacante vvacante;

    public ControladorVacante(frmRrhh frrhh, frmIngreso fIngreso, frmRegistro fRegistro, Vectorvacante vvacante) {
        this.frrhh = frrhh;
        this.fIngreso = fIngreso;
        this.fRegistro = fRegistro;
        this.vvacante = vvacante;
       
    
        
         
         this.frrhh.guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                vvacante.agregarVacante(Integer.parseInt(frrhh.t1.getText()), frrhh.t2.getText(), Integer.parseInt(frrhh.t3.getText()), Integer.parseInt(frrhh.t4.getText()));
                frrhh.setVisible(false);
                    frrhh.t1.setText("");
                    frrhh.t2.setText("");
                    frrhh.t3.setText("");
                    frrhh.t4.setText("");
                    frrhh.setVisible(true);
                    
                    
            }
        
         
                 });
         this.frrhh.cancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frrhh.setVisible(false);
                frrhh.t1.setText("");
                frrhh.t2.setText("");
                frrhh.t3.setText("");
                frrhh.t4.setText("");
                fIngreso.setVisible(true);
            }            
        });
       
    
  
    
   
    
   
    
}
public void iniciar(){
        this.frrhh.setVisible(true);
        this.frrhh.setLocationRelativeTo(null);
        
    }}
