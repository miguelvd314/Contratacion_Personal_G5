
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Vacante;
import modelo.VectorUsuario;
import modelo.Vectorvacante;
import vista.frmIngreso;
import vista.frmRegistro;
import vista.frmRrhh;
import vista.frmEmpleado;
import vista.frmUsuariosRegistrados;

public class ControladorIngreso {
    VectorUsuario usuario;
    frmIngreso fIngreso;
    frmRegistro fRegistro;
    frmRrhh frrhh;
    Vectorvacante vvacante;
    frmEmpleado fEmpleado;
    frmUsuariosRegistrados fURegistrados;
    
    
    public ControladorIngreso(VectorUsuario usuario, frmIngreso fIngreso, frmRegistro fRegistro,frmRrhh frrhh,Vectorvacante vvacante,frmEmpleado fEmpleado, frmUsuariosRegistrados fURegistrados){
        this.usuario = usuario;
        this.fIngreso = fIngreso;
        this.fRegistro = fRegistro;
        this.frrhh = frrhh;
        this.vvacante = vvacante;
        this.fEmpleado = fEmpleado;
        this.fURegistrados = fURegistrados;
        
        ControladorRegistro  rcontrolador = new ControladorRegistro(usuario, fRegistro, fIngreso);
        ControladorVacante vcontrolador = new ControladorVacante(frrhh, fIngreso, fRegistro, vvacante);
        ControladorIngresoempleado econtrolador = new ControladorIngresoempleado(usuario, fIngreso, frrhh, vvacante, fEmpleado, fURegistrados);
        this.fIngreso.cancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }  
        });
        this.fIngreso.aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(usuario.validarUsuario(fIngreso.txtNombre.getText(), fIngreso.txtContra.getText(),0)){
                    JOptionPane.showMessageDialog(null,"Usuario válido");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Usuario inválido");
                }
            }
        });
        this.fIngreso.registrarse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //RegistroControlador  rcontrolador = new RegistroControlador(usuario, fRegistro, fIngreso);
                rcontrolador.iniciar();
                limpiar();
                fIngreso.setVisible(false);
                
            }   
        });
        this.fIngreso.Empleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                econtrolador.iniciar();
                limpiar();
                fIngreso.setVisible(false);
            }
        });
        
        
    }
    
    public void iniciar(){
        this.fIngreso.setVisible(true);
        this.fIngreso.setSize(370, 450);
        
        this.fIngreso.setResizable(false);
        
        this.fIngreso.setLocationRelativeTo(null);
         
    }
    public void limpiar(){
       fIngreso.txtNombre.setText("");
       fIngreso.txtContra.setText("");
    
    }
}
