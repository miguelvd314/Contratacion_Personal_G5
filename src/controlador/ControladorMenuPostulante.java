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
/**
 *
 * @author Max
 */
public class ControladorMenuPostulante {
    
    frmMenuPostulante fmenupost;
    frmlistaVacante flista;
    
    ControladorMenuPostulante(frmMenuPostulante postu,frmlistaVacante flista){
        
        this.fmenupost=postu;
        this.flista=flista;
        this.fmenupost.vacante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                     frmlistaVacante lista = new frmlistaVacante();
                     Controladorlista clista = new Controladorlista(lista);
                     clista.iniciarla();
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
