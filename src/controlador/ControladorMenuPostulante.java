/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.frmMenuPostulante;

/**
 *
 * @author Max
 */
public class ControladorMenuPostulante {
    
    frmMenuPostulante fmenupost;
    
    ControladorMenuPostulante(frmMenuPostulante postu){
        
        this.fmenupost=postu;
        
    }
      public void iniciar(){
        this.fmenupost.setVisible(true);
        this.fmenupost.setSize(400, 400);
        
        this.fmenupost.setResizable(false);
        
        this.fmenupost.setLocationRelativeTo(null);
    }
    
}
