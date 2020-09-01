/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.VectorUsuario;
import vista.frmUsuariosRegistrados;

/**
 *
 * @author mavd_
 */
public class ControladorUsuariosRegistrados {
    frmUsuariosRegistrados fURegistrados;
    VectorUsuario vUsuario;
    
    public ControladorUsuariosRegistrados(frmUsuariosRegistrados fURegistrados){
        this.fURegistrados = fURegistrados;
        
        this.fURegistrados.btnAtras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        });
        
        this.fURegistrados.btnMostrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        });
        
        this.fURegistrados.btnBuscar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        });
        
        this.fURegistrados.btnEditar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        });
    }
    
    private void llenarTabla(){
        DefaultTableModel modelotabla = new DefaultTableModel(this.vUsuario.getDatos(),this.vUsuario.getCabecera());
        this.fURegistrados.tblUsuarios.setModel(modelotabla);
    }
    
}
