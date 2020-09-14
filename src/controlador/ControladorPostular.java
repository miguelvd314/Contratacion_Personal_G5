/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import modelo.Vacante;
import modelo.VectorVacante;
import vista.frmMenuPostulante;
import vista.frmPostular;

/**
 *
 * @author mavd_
 */
public class ControladorPostular {
    frmPostular fPostular;
    
    ControladorPostular(frmPostular fPostular){
        this.fPostular = fPostular;
        int id = 0;
        
        this.fPostular.btnPostular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Vacante vacante = (Vacante)fPostular.cboVacantes.getSelectedItem();
            }
            
        });
        
        /*this.fPostular.cboVacantes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });*/
        
        this.fPostular.btnAtras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fPostular.setVisible(false);
                frmMenuPostulante fMenuPostulante = new frmMenuPostulante();
                fMenuPostulante.setVisible(true);
                ControladorMenuPostulante controladorMenuPostulante = new ControladorMenuPostulante(fMenuPostulante, id);
                controladorMenuPostulante.iniciar();
            }
            
        });
    }
    
    public void Iniciar(){
        DefaultComboBoxModel modelocombobox = new DefaultComboBoxModel();
        for( Object o : Repositorio.vVacante.getDatosCombo()){
            modelocombobox.addElement(o);
        }
        this.fPostular.cboVacantes.setModel(modelocombobox);
        fPostular.cboVacantes.setSelectedIndex(-1);
    }
}
