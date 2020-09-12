/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmMenuPostulante;
import vista.frmlistaVacante;
import modelo.VectorVacante;
import vista.frmCrearVacante;
import vista.frmIngreso;
/**
 *
 * @author Max
 */
public class ControladorMenuPostulante {
    
    frmMenuPostulante fMenuPostulante;
    int id;
    
    ControladorMenuPostulante(frmMenuPostulante fMenuPostulante, int id){
        
        this.fMenuPostulante = fMenuPostulante;
        this.id = id;
        
        this.fMenuPostulante.btnVacante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                     frmlistaVacante fListaVacante = new frmlistaVacante();
                     ControladorListaVacante cListaVacante = new ControladorListaVacante(fListaVacante, id);
                     cListaVacante.iniciar();
                     fMenuPostulante.dispose();
            }
        });
        
        this.fMenuPostulante.salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Repositorio.vUsuario.usuario[id].salir();
                frmIngreso fIngreso = new frmIngreso();
                ControladorIngreso cIngreso = new ControladorIngreso(fIngreso);
                cIngreso.iniciar();
                fMenuPostulante.dispose();
            }
        });
        
    }
    public void iniciar(){
        this.fMenuPostulante.setVisible(true);
        this.fMenuPostulante.setSize(400, 400);
        
        this.fMenuPostulante.setResizable(false);
        
        this.fMenuPostulante.setLocationRelativeTo(null);
    }
    
}
