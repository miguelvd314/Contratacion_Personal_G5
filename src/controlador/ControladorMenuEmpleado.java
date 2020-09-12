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
import vista.frmMenuEmpleado;
import vista.frmCrearVacante;
import vista.frmIngreso;
/**
 *
 * @author Max
 */
public class ControladorMenuEmpleado {
    
    frmMenuEmpleado fMenuEmpleado;
    int id;
    
    ControladorMenuEmpleado(frmMenuEmpleado fMenuEmpleado, int id){
        this.fMenuEmpleado = fMenuEmpleado;
        this.id = id;

        this.fMenuEmpleado.BtnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fMenuEmpleado.dispose();
                frmIngreso fingreso = new frmIngreso();
                ControladorIngreso cIngreso = new ControladorIngreso(fingreso);
                cIngreso.iniciar();
                Repositorio.vEmpleado.empleado[id].salir();
            }  
        });

        this.fMenuEmpleado.BtnCrearVacante.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //boolean a = false;
                    fMenuEmpleado.dispose();
                    frmCrearVacante fCrearVacante = new frmCrearVacante();
                    ControladorCrearVacante cCrearVacante = new ControladorCrearVacante(fCrearVacante, id);
                    
                    cCrearVacante.iniciar();
                    
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
