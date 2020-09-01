/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.VectorUsuario;
import modelo.Vectorvacante;
import vista.frmIngreso;
import vista.frmRegistro;
import vista.frmRrhh;
import vista.frmEmpleado;
import vista.frmUsuariosRegistrados;
/**
 *
 * @author Master
 */
public class ControladorIngresoempleado {
     VectorUsuario usuario;
    frmIngreso fIngreso;
    frmRegistro fRegistro;
    frmRrhh frrhh;
    Vectorvacante vvacante;
    frmEmpleado fempleado;
    frmUsuariosRegistrados fURegistrados;

    public ControladorIngresoempleado(VectorUsuario usuario, frmIngreso fIngreso, frmRrhh frrhh, Vectorvacante vvacante, frmEmpleado fempleado, frmUsuariosRegistrados fURegistrados) {
        this.usuario = usuario;
        this.fIngreso = fIngreso;
        this.frrhh = frrhh;
        this.vvacante = vvacante;
        this.fempleado = fempleado;
        this.fURegistrados = fURegistrados;
    
        ControladorVacante vcontrolador = new ControladorVacante(frrhh, fIngreso, fRegistro, vvacante);
        ControladorUsuariosRegistrados uRControlador = new ControladorUsuariosRegistrados(fURegistrados);

  this.fempleado.Aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean a = false;
                
                    if(usuario.validarUsuario(fempleado.usuario.getText(),fempleado.psw.getText(),1)){
                        JOptionPane.showMessageDialog(null,"Usuario válido");
                        a = true;
                             vcontrolador.iniciar();
                             fURegistrados.setVisible(true);
                             
                             limpiar();
                              fempleado.setVisible(false);
                    }
                if(!a){
                    JOptionPane.showMessageDialog(null,"Usuario inválido");
                }
                
            }
        });
   

  }
              
     public void iniciar(){
        this.fempleado.setVisible(true);
        this.fempleado.setSize(370, 450);
        
        this.fempleado.setResizable(false);
        
        this.fempleado.setLocationRelativeTo(null);
    }
  public void limpiar()   {
  
             fempleado.usuario.setText("");
             fempleado.psw.setText("");
  
  }
}
