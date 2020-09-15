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
import javax.swing.JOptionPane;
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
                int a = fPostular.cboVacantes.getSelectedIndex();
                Repositorio.vVacante.PostulantesInscritos(a);
                System.out.println(a);
            }
            
        });
        
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
        
        this.fPostular.cboVacantes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int seleccion = fPostular.cboVacantes.getSelectedIndex();
                fPostular.jTextArea1.setText("");
                fPostular.jTextArea1.append(Repositorio.vVacante.TextArea(seleccion));
                Repositorio.vVacante.PostulantesInscritos(seleccion);
            }
            
        });
    }
    
    public void Iniciar(){
        DefaultComboBoxModel modelocombobox = new DefaultComboBoxModel();
        for( Object o : Repositorio.vVacante.getDatosCombo()){
            modelocombobox.addElement(o);
        }
        this.fPostular.cboVacantes.setModel(modelocombobox);
        //fPostular.cboVacantes.setSelectedIndex(-1);
    }
}
