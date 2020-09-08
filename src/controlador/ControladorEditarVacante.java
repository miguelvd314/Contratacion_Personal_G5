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
import vista.frmEditarVacante;
import vista.frmRrhh;
import vista.frmIngreso;

/**
 *
 * @author Max
 */
public class ControladorEditarVacante {
    
    
    frmEditarVacante vista;
    Vacante modelo;
    frmIngreso fingreso;

    public ControladorEditarVacante(frmEditarVacante vista, Vacante vacante) {
        this.vista =  vista;
        this.modelo = vacante;

        this.vista.BtnGrabar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                modelo.setCodigo(vista.TxtCodigo.getText().toUpperCase());
                modelo.setNombrev(vista.TxtNombre.getText().toUpperCase());
                modelo.setSalariov(vista.TxtSalario.getText().toUpperCase());
                modelo.setNumerov(vista.TxtNumerov.getText().toUpperCase());
                 modelo.setDescripcionv(vista.CuadroDescripcion.getText().toUpperCase());
                
                regrasar();
            }
        });
        
        this.vista.BtnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                regrasar();
            }
        });

        
    }
 
    private void regrasar(){
        frmRrhh vista = new frmRrhh();
       ControladorRrhh controlador = new ControladorRrhh(vista,Repositorio.modelovacante,fingreso);
       controlador.iniciar();
        vista.setVisible(true);        
        this.vista.dispose();
    }
    public void iniciar_vista(){
     

         this.vista.setSize(520, 450);
         this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
        vista.TxtCodigo.setText(modelo.getCodigo());
        vista.TxtNombre.setText(modelo.getNombrev());
        vista.TxtSalario.setText(modelo.getSalariov());
        vista.TxtNumerov.setText(modelo.getNumerov());
        vista.CuadroDescripcion.setText(modelo.getDescripcionv());

       /* DefaultComboBoxModel modelocombobox = new DefaultComboBoxModel();
        for( Object o : Repositorio.arreglotipousuario.getDatosCombo()){
            modelocombobox.addElement(o);
        }
        this.vista.cboTipoUsuario.setModel(modelocombobox);
        
        int indice_tmp = Repositorio.arreglotipousuario.find(modelo.getTipoUsuario().getDescripcion());
        vista.cboTipoUsuario.setSelectedIndex(indice_tmp);
          */          
        

    }
    
    
    
    
}
