/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmMenuPostulante;
import vista.frmlistaVacante;
import controlador.Controladorlista;
import modelo.VectorVacante;
import vista.frmCrearVacante;
import vista.frmIngreso;
/**
 *
 * @author Max
 */
public class ControladorMenuPostulante {
    
    frmMenuPostulante fmenupost;
    frmlistaVacante flista;
     frmCrearVacante vista;
    VectorVacante modelo;
    frmIngreso fingreso;
    
    
    ControladorMenuPostulante(frmMenuPostulante postu,frmlistaVacante flista,frmCrearVacante vista,VectorVacante modelo,frmIngreso fingreso){
        
        this.fmenupost=postu;
        this.flista=flista;
          this.modelo = modelo;
        this.vista = vista;
        this.fingreso= fingreso;
        this.fmenupost.vacante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                     frmlistaVacante lista = new frmlistaVacante();
                     Controladorlista clista = new Controladorlista(lista, vista, modelo,postu);
                     clista.iniciarla();
                     fmenupost.setVisible(false);
                     
               
            }
        });
        
        this.fmenupost.salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fingreso.setVisible(true);
               fmenupost.setVisible(false);
            }
        });
        
    }
      public void iniciar(){
        this.fmenupost.setVisible(true);
        this.fmenupost.setSize(400, 400);
        
        this.fmenupost.setResizable(false);
        
        this.fmenupost.setLocationRelativeTo(null);
    }
    
}
