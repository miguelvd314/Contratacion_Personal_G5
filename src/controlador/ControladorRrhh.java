/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Vacante;
import modelo.VectorVacante;
import vista.frmEditarVacante;
import vista.frmRrhh;

/**
 *
 * @author Max
 */
public class ControladorRrhh {
    
    frmRrhh vista;
    VectorVacante modelo;
    
    
    
    public ControladorRrhh(frmRrhh vista, VectorVacante modelo ) {
        this.vista = vista;
        this.modelo = modelo;
        
    
        this.vista.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(validar()){
                    if(modelo.find(vista.txtCodigo.getText())== -1 ){
                        String codigo = vista.txtCodigo.getText().toUpperCase();
                        String nombres = vista.TxtNombre.getText().toUpperCase();
                        String salario = vista.TxtSalario.getText().toUpperCase();
                        String numerov = vista.TxtNumeroVacante.getText().toUpperCase();
                        String descripcionv = vista.CuadroTxtDescripcion.getText().toUpperCase();
                        
                        
        
                        modelo.add( new Vacante(codigo, nombres, salario, numerov, descripcionv));
                        JOptionPane.showMessageDialog(vista, "Registro exitoso" , "Agregar Persona" , JOptionPane.INFORMATION_MESSAGE);
                        limpiarcontroles();
                    }else{
                        JOptionPane.showMessageDialog(vista, "Cóodigo ya esta registrado" , "Agregar Persona" , JOptionPane.ERROR_MESSAGE);
                    }

                }else{
                    JOptionPane.showMessageDialog(vista,"Debe ingresar valores en todos los campos ", "Agregar Persona" , JOptionPane.ERROR_MESSAGE  );
                }
            }
        });
                
        this.vista.BtnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int fila = vista.TablaVacantes.getSelectedRow();
                int columna = vista.TablaVacantes.getSelectedColumn();
                if( fila >= 0 ){
                    if( vista.BtnActualizar.getText().equalsIgnoreCase("Actualizar")){
                        String codigoeliminar = vista.TablaVacantes.getValueAt(fila, 0).toString();
                        modelo.remove(codigoeliminar);
                        limpiarcontroles();
                        JOptionPane.showMessageDialog(vista,"Registro eliminado", "Elimiar Persona" , JOptionPane.INFORMATION_MESSAGE );
                    }
                    else{
                        JOptionPane.showMessageDialog(vista, "Estas actualizando un registro de persona", "Elimiar Persona" , JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    if(modelo.isVacio()){
                        JOptionPane.showMessageDialog(vista,"No existen registros para eliminar" , "Elimiar Persona" , JOptionPane.WARNING_MESSAGE );
                    }else{
                        JOptionPane.showMessageDialog(vista,"Selecciones una fila de la tabla ", "Elimiar Persona" , JOptionPane.ERROR_MESSAGE );
                    }
                }
            }
        });
        
       this.vista.BtnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int fila = vista.TablaVacantes.getSelectedRow();
                int columna = vista.TablaVacantes.getSelectedColumn();
                if( fila >= 0  &&  vista.BtnEditar.getText().equalsIgnoreCase("Actualizar")){
                    Vacante v = modelo.getPersona(vista.TablaVacantes.getValueAt(fila, 0).toString());
                    vista.txtCodigo.setText(v.getCodigo());
                    vista.TxtNombre.setText(v.getNombrev());
                    vista.TxtSalario.setText(v.getSalariov());
                    vista.TxtNumeroVacante.setText(v.getNumerov());
                    vista.CuadroTxtDescripcion.setText(v.getDescripcionv());
                    
                   // int indice_tmp = Repositorio.arreglotipousuario.find(p.getTipoUsuario().getDescripcion());
                    //vista.cboTipoUsuario.setSelectedIndex(indice_tmp);
                    habilitarControlesEdicion(true);
                    
                }else if( vista.BtnActualizar.getText().equalsIgnoreCase("Grabar")) {
                    if(validar()){
                        String codigov = vista.txtCodigo.getText().toUpperCase();
                        String nombres = vista.TxtNombre.getText().toUpperCase();
                        String salario = vista.TxtSalario.getText().toUpperCase();
                        String numerov = vista.TxtNumeroVacante.getText().toUpperCase();
                        String descripcion=vista.CuadroTxtDescripcion.getText().toUpperCase();
                     
                      
                        Vacante vac = new Vacante(codigov, nombres, salario, numerov, descripcion);
                        modelo.update(vac);
                        
                        limpiarcontroles();
                        habilitarControlesEdicion(false);
                        JOptionPane.showMessageDialog(vista,"Actualizacion exitosa", "Actualizar Persona" , JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(vista, "Debe ingresar valores en todos los campos" , "Actualizar Persona" , JOptionPane.WARNING_MESSAGE );
                    }
                
                }
                else  {
                    if(modelo.isVacio()){
                        JOptionPane.showMessageDialog(vista,"No existen registros para actualizar" , "Actualizar Persona" , JOptionPane.WARNING_MESSAGE );
                    }else{
                        JOptionPane.showMessageDialog(vista,"Selecciones una fila de la tabla para Actualizar: ", "Actualizar Persona" , JOptionPane.ERROR_MESSAGE );
                    }
                }
            }
        });
        
         this.vista.BtnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if( vista.BtnEditar.getText().equalsIgnoreCase("Grabar")){
                    limpiarcontroles();
                    habilitarControlesEdicion(false);
                    
                }
            }
        });
        
        this.vista.BtnEditar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = vista.TablaVacantes.getSelectedRow();
                if( fila >= 0) {
                    frmEditarVacante vacant = new frmEditarVacante();               
                    
                    Vacante  modelovacante =  modelo.getPersona(vista.TablaVacantes.getValueAt(fila, 0).toString());
                    ControladorEditarVacante controlador = new ControladorEditarVacante(vacant,modelovacante);
                    controlador.iniciar_vista();
                    vacant.setVisible(true);   
                    vista.dispose();
                }else {
                    JOptionPane.showMessageDialog(vista,"Selecciones una fila de la tabla para Editar: ", "Editar Persona" , JOptionPane.ERROR_MESSAGE );                    
                }    
            }
        }
        
        
        );
        
        
        this.vista.TablaVacantes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String codigo=null;
                int fila = vista.TablaVacantes.rowAtPoint(e.getPoint());
                int columna = vista.TablaVacantes.columnAtPoint(e.getPoint());
                if (fila > -1 ){
                        System.out.println(vista.TablaVacantes.getValueAt(fila,1));
                }
            }
        });
                
                
    }

   /* public void iniciar_vista(){
        vista.setTitle( "Registro de Persona" );
        vista.setLocationRelativeTo(null);      
        
        this.vista.TablaVacantes.setAutoCreateRowSorter(true);
        Repositorio.modelovacante.sort();        
        DefaultComboBoxModel modelocombobox = new DefaultComboBoxModel();
        for( Object o : Repositorio.arreglotipousuario.getDatosCombo()){
            modelocombobox.addElement(o);
        }
        //this.vista.cboTipoUsuario.setModel(modelocombobox);
        limpiarcontroles();
        habilitarControlesEdicion(false);
        
    }
*/

    private void limpiarcontroles() {
        vista.txtCodigo.setText("");
        vista.TxtNombre.setText("");
        vista.TxtSalario.setText("");
        vista.TxtNumeroVacante.setText("");
        vista.CuadroTxtDescripcion.setText("");
       // vista.cboTipoUsuario.setSelectedIndex(-1);
        DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(),this.modelo.getCabecera());
        this.vista.TablaVacantes.setModel(modelotabla);
        this.vista.txtCodigo.requestFocus();
        this.vista.txtCodigo.selectAll();

        
    }
    private void habilitarControlesEdicion(boolean editar){
        if (editar){
            vista.btnAgregar.setEnabled(false);
            vista.BtnEliminar.setEnabled(false);
            vista.BtnEditar.setEnabled(true);
            vista.BtnCancelar.setEnabled(true);
            vista.BtnEditar.setText("Grabar");
            vista.txtCodigo.setEnabled(false);
            this.vista.TxtNombre.requestFocus();
            this.vista.TxtNombre.selectAll();
        }
        else {
            vista.btnAgregar.setEnabled(true);
            vista.BtnEliminar.setEnabled(true);
            vista.BtnEditar.setEnabled(true);
            vista.BtnCancelar.setEnabled(false);
            vista.BtnEditar.setText("Actualizar");
            vista.txtCodigo.setEnabled(true);
            this.vista.txtCodigo.requestFocus();
            this.vista.txtCodigo.selectAll();
        }
    }

   private boolean validar() {
        boolean resultado = false;
        if (this.vista.txtCodigo.getText().length()!= 0 &&
                this.vista.txtCodigo.getText().length()!= 0 &&
                this.vista.TxtNombre.getText().length()!= 0 &&
                this.vista.TxtSalario.getText().length()!= 0 &&
                this.vista.TxtNumeroVacante.getText().length()!= 0 &&
                 this.vista.CuadroTxtDescripcion.getText().length()!= 0 
                //this.vista.cboTipoUsuario.getSelectedIndex() != -1
                ){
            resultado = true;
        }
        return resultado;
    }
    
        public void iniciar(){
        this.vista.setVisible(true);
        this.vista.setSize(720, 500);
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
        this.vista.TablaVacantes.setAutoCreateRowSorter(true);
        //Repositorio.modelovacante.sort();  
          limpiarcontroles();
        //habilitarControlesEdicion(false);
    }
        
    
    
    
    
    
    
    
    
}
