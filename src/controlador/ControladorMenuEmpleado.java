/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.VectorVacante;
import vista.frmEditarVacante;
import vista.frmMenuEmpleado;
import vista.frmMenuPostulante;
import vista.frmRrhh;

/**
 *
 * @author Max
 */
public class ControladorMenuEmpleado {
    
    frmMenuEmpleado fMenuEmpleado;
    frmRrhh fRrhh;
    frmEditarVacante fEditarVacante;
    VectorVacante modeloVacante;
    ControladorRrhh controladorRrhh;
    ControladorMenuEmpleado(frmMenuEmpleado fMenuEmpleado){
        this.fMenuEmpleado=fMenuEmpleado;
        this.modeloVacante=modeloVacante;
   
        
       
        this.fMenuEmpleado.BtnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }  
        });

        this.fMenuEmpleado.BtnCrearVacante.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean a = false;
         
                      frmRrhh vistaRrhh=new frmRrhh();  
                      ControladorRrhh controladorRrhh=new ControladorRrhh(vistaRrhh,modeloVacante);
                      controladorRrhh.iniciar();
                      vistaRrhh.setVisible(true); 
                      fMenuEmpleado.setVisible(false);
                   
                    
            
            }
        });
        

        
        
        
    }
  
    
        public void iniciar(){
        this.fMenuEmpleado.setVisible(true);
        this.fMenuEmpleado.setSize(400, 420);
        
        this.fMenuEmpleado.setResizable(false);
        
        this.fMenuEmpleado.setLocationRelativeTo(null);
    }
    
    
    
    
    
    
    
}
