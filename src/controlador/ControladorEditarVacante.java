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
import vista.frmCrearVacante;
import vista.frmIngreso;
import vista.frmMenuEmpleado;

/**
 *
 * @author Max
 */
public class ControladorEditarVacante {
    
    
    frmEditarVacante fEditarVacante;
    Vacante editVacante;
    int id;

    public ControladorEditarVacante(frmEditarVacante fEditarVacante, int id, Vacante vacante) {
        this.fEditarVacante =  fEditarVacante;
        this.id = id;
        this.editVacante = vacante;

        this.fEditarVacante.BtnGrabar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                editVacante.setCodigo(fEditarVacante.TxtCodigo.getText().toUpperCase());
                editVacante.setNombrev(fEditarVacante.TxtNombre.getText().toUpperCase());
                editVacante.setSalariov(fEditarVacante.TxtSalario.getText().toUpperCase());
                editVacante.setNumerov(fEditarVacante.TxtNumerov.getText().toUpperCase());
                editVacante.setDescripcionv(fEditarVacante.CuadroDescripcion.getText().toUpperCase());
                
                regresar();
            }
        });
        
        this.fEditarVacante.BtnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                regresar();
            }
        });

        
    }
 
    private void regresar(){
        frmCrearVacante fCrearVacante = new frmCrearVacante();
        ControladorCrearVacante cCrearVacante = new ControladorCrearVacante(fCrearVacante,id);
        cCrearVacante.iniciar();       
        this.fEditarVacante.dispose();
    }
    public void iniciar(){
     

        this.fEditarVacante.setSize(520, 450);
        this.fEditarVacante.setLocationRelativeTo(null);
        this.fEditarVacante.setVisible(true);
        
        fEditarVacante.TxtCodigo.setText(editVacante.getCodigo());
        fEditarVacante.TxtNombre.setText(editVacante.getNombrev());
        fEditarVacante.TxtSalario.setText(editVacante.getSalariov());
        fEditarVacante.TxtNumerov.setText(editVacante.getNumerov());
        fEditarVacante.CuadroDescripcion.setText(editVacante.getDescripcionv());

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
