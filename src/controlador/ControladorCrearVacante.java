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
import vista.frmCrearVacante;
import vista.frmIngreso;
import vista.frmMenuEmpleado;
/**
 *
 * @author Max
 */
public class ControladorCrearVacante {
    
    frmCrearVacante fCrearVacante;
    int id;
    
    public ControladorCrearVacante(frmCrearVacante fCrearVacante, int id) {
        this.fCrearVacante = fCrearVacante;
        this.id = id;
        
        this.fCrearVacante.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(validar()){
                    if(Repositorio.vVacante.find(fCrearVacante.txtCodigo.getText())== -1 ){
                        String codigo = fCrearVacante.txtCodigo.getText().toUpperCase();
                        String nombres = fCrearVacante.TxtNombre.getText().toUpperCase();
                        String salario = fCrearVacante.TxtSalario.getText().toUpperCase();
                        String numerov = fCrearVacante.TxtNumeroVacante.getText().toUpperCase();
                        String descripcionv = fCrearVacante.CuadroTxtDescripcion.getText().toUpperCase();
                        
                        
        
                        Repositorio.vVacante.add( new Vacante(codigo, nombres, salario, numerov, descripcionv));
                        JOptionPane.showMessageDialog(fCrearVacante, "Registro exitoso" , "Agregar Persona" , JOptionPane.INFORMATION_MESSAGE);
                        limpiarControles();
                    }else{
                        JOptionPane.showMessageDialog(fCrearVacante, "Cóodigo ya esta registrado" , "Agregar Persona" , JOptionPane.ERROR_MESSAGE);
                    }

                }else{
                    JOptionPane.showMessageDialog(fCrearVacante,"Debe ingresar valores en todos los campos ", "Agregar Persona" , JOptionPane.ERROR_MESSAGE  );
                }
            }
        });
                
        this.fCrearVacante.BtnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int fila = fCrearVacante.TablaVacantes.getSelectedRow();
                int columna = fCrearVacante.TablaVacantes.getSelectedColumn();
                if( fila >= 0 ){
                    if( fCrearVacante.BtnActualizar.getText().equalsIgnoreCase("Actualizar")){
                        String codigoeliminar = fCrearVacante.TablaVacantes.getValueAt(fila, 0).toString();
                        Repositorio.vVacante.remove(codigoeliminar);
                        limpiarControles();
                        JOptionPane.showMessageDialog(fCrearVacante,"Registro eliminado", "Elimiar Persona" , JOptionPane.INFORMATION_MESSAGE );
                    }
                    else{
                        JOptionPane.showMessageDialog(fCrearVacante, "Estas actualizando un registro de persona", "Elimiar Persona" , JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    if(Repositorio.vVacante.isVacio()){
                        JOptionPane.showMessageDialog(fCrearVacante,"No existen registros para eliminar" , "Elimiar Persona" , JOptionPane.WARNING_MESSAGE );
                    }else{
                        JOptionPane.showMessageDialog(fCrearVacante,"Selecciones una fila de la tabla ", "Elimiar Persona" , JOptionPane.ERROR_MESSAGE );
                    }
                }
            }
        });
        
       this.fCrearVacante.BtnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int fila = fCrearVacante.TablaVacantes.getSelectedRow();
                int columna = fCrearVacante.TablaVacantes.getSelectedColumn();
                if( fila >= 0  &&  fCrearVacante.BtnEditar.getText().equalsIgnoreCase("Actualizar")){
                    Vacante v = Repositorio.vVacante.getPersona(fCrearVacante.TablaVacantes.getValueAt(fila, 0).toString());
                    fCrearVacante.txtCodigo.setText(v.getCodigo());
                    fCrearVacante.TxtNombre.setText(v.getNombrev());
                    fCrearVacante.TxtSalario.setText(v.getSalariov());
                    fCrearVacante.TxtNumeroVacante.setText(v.getNumerov());
                    fCrearVacante.CuadroTxtDescripcion.setText(v.getDescripcionv());
                    
                   // int indice_tmp = Repositorio.arreglotipousuario.find(p.getTipoUsuario().getDescripcion());
                    //vista.cboTipoUsuario.setSelectedIndex(indice_tmp);
                    habilitarControlesEdicion(true);
                    
                }else if( fCrearVacante.BtnActualizar.getText().equalsIgnoreCase("Grabar")) {
                    if(validar()){
                        String codigov = fCrearVacante.txtCodigo.getText().toUpperCase();
                        String nombres = fCrearVacante.TxtNombre.getText().toUpperCase();
                        String salario = fCrearVacante.TxtSalario.getText().toUpperCase();
                        String numerov = fCrearVacante.TxtNumeroVacante.getText().toUpperCase();
                        String descripcion=fCrearVacante.CuadroTxtDescripcion.getText().toUpperCase();
                     
                      
                        Vacante vac = new Vacante(codigov, nombres, salario, numerov, descripcion);
                        Repositorio.vVacante.update(vac);
                        
                        limpiarControles();
                        habilitarControlesEdicion(false);
                        JOptionPane.showMessageDialog(fCrearVacante,"Actualizacion exitosa", "Actualizar Persona" , JOptionPane.INFORMATION_MESSAGE );
                    }else {
                        JOptionPane.showMessageDialog(fCrearVacante, "Debe ingresar valores en todos los campos" , "Actualizar Persona" , JOptionPane.WARNING_MESSAGE );
                    }
                
                }
                else  {
                    if(Repositorio.vVacante.isVacio()){
                        JOptionPane.showMessageDialog(fCrearVacante,"No existen registros para actualizar" , "Actualizar Persona" , JOptionPane.WARNING_MESSAGE );
                    }else{
                        JOptionPane.showMessageDialog(fCrearVacante,"Selecciones una fila de la tabla para Actualizar: ", "Actualizar Persona" , JOptionPane.ERROR_MESSAGE );
                    }
                }
            }
        });
        
         this.fCrearVacante.BtnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                limpiarControles();
                frmMenuEmpleado fMenuEmpleado = new frmMenuEmpleado();
                ControladorMenuEmpleado cMenuEmpleado = new ControladorMenuEmpleado(fMenuEmpleado, id);
                fCrearVacante.dispose();
                cMenuEmpleado.iniciar();
            }
        });
        
        this.fCrearVacante.BtnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila = fCrearVacante.TablaVacantes.getSelectedRow();
                if( fila >= 0) {              
                    
                    Vacante  vacante =  Repositorio.vVacante.getPersona(fCrearVacante.TablaVacantes.getValueAt(fila, 0).toString());
                    frmEditarVacante fEditarVacante = new frmEditarVacante();
                    ControladorEditarVacante cEditarVacante = new ControladorEditarVacante(fEditarVacante, id, vacante);
                    cEditarVacante.iniciar();
                    fCrearVacante.dispose();
                }else {
                    JOptionPane.showMessageDialog(fCrearVacante,"Selecciones una fila de la tabla para Editar: ", "Editar Persona" , JOptionPane.ERROR_MESSAGE );                    
                    }
                }
            }
        
        
        );
        
        
        this.fCrearVacante.TablaVacantes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String codigo=null;
                int fila = fCrearVacante.TablaVacantes.rowAtPoint(e.getPoint());
                int columna = fCrearVacante.TablaVacantes.columnAtPoint(e.getPoint());
                if (fila > -1 ){
                        System.out.println(fCrearVacante.TablaVacantes.getValueAt(fila,1));
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

    private void limpiarControles() {
        fCrearVacante.txtCodigo.setText("");
        fCrearVacante.TxtNombre.setText("");
        fCrearVacante.TxtSalario.setText("");
        fCrearVacante.TxtNumeroVacante.setText("");
        fCrearVacante.CuadroTxtDescripcion.setText("");
       // vista.cboTipoUsuario.setSelectedIndex(-1);
        DefaultTableModel modelotabla = new DefaultTableModel(Repositorio.vVacante.getDatos(),Repositorio.vVacante.getCabecera());
        this.fCrearVacante.TablaVacantes.setModel(modelotabla);
        this.fCrearVacante.txtCodigo.requestFocus();
        this.fCrearVacante.txtCodigo.selectAll();

        
    }
    private void habilitarControlesEdicion(boolean editar){
        if (editar){
            fCrearVacante.btnAgregar.setEnabled(false);
            fCrearVacante.BtnEliminar.setEnabled(false);
            fCrearVacante.BtnEditar.setEnabled(true);
            fCrearVacante.BtnAtras.setEnabled(true);
            fCrearVacante.BtnEditar.setText("Grabar");
            fCrearVacante.txtCodigo.setEnabled(false);
            this.fCrearVacante.TxtNombre.requestFocus();
            this.fCrearVacante.TxtNombre.selectAll();
        }
        else {
            fCrearVacante.btnAgregar.setEnabled(true);
            fCrearVacante.BtnEliminar.setEnabled(true);
            fCrearVacante.BtnEditar.setEnabled(true);
            fCrearVacante.BtnAtras.setEnabled(false);
            fCrearVacante.BtnEditar.setText("Actualizar");
            fCrearVacante.txtCodigo.setEnabled(true);
            this.fCrearVacante.txtCodigo.requestFocus();
            this.fCrearVacante.txtCodigo.selectAll();
        }
    }

   private boolean validar() {
        boolean resultado = false;
        if (this.fCrearVacante.txtCodigo.getText().length()!= 0 &&
                this.fCrearVacante.txtCodigo.getText().length()!= 0 &&
                this.fCrearVacante.TxtNombre.getText().length()!= 0 &&
                this.fCrearVacante.TxtSalario.getText().length()!= 0 &&
                this.fCrearVacante.TxtNumeroVacante.getText().length()!= 0 &&
                 this.fCrearVacante.CuadroTxtDescripcion.getText().length()!= 0 
                //this.vista.cboTipoUsuario.getSelectedIndex() != -1
                ){
            resultado = true;
        }
        return resultado;
    }
    
        public void iniciar(){
        this.fCrearVacante.setVisible(true);
        this.fCrearVacante.setSize(720, 500);
        this.fCrearVacante.setResizable(false);
        this.fCrearVacante.setLocationRelativeTo(null);
        this.fCrearVacante.TablaVacantes.setAutoCreateRowSorter(true);
        //Repositorio.modelovacante.sort();  
        limpiarControles();
        //habilitarControlesEdicion(false);
    }
        
    
    
    
    
    
    
    
    
}
