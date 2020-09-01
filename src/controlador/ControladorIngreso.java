
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

public class ControladorIngreso {
    VectorUsuario usuario;
    frmIngreso fIngreso;
    frmRegistro fRegistro;
    frmRrhh frrhh;
    Vectorvacante vvacante;
    frmEmpleado fEmpleado;
    
    
    public ControladorIngreso(VectorUsuario usuario, frmIngreso fIngreso, frmRegistro fRegistro,frmRrhh frrhh,Vectorvacante vvacante,frmEmpleado fEmpleado){
        this.usuario = usuario;
        this.fIngreso = fIngreso;
        this.fRegistro = fRegistro;
        this.frrhh = frrhh;
        this.vvacante = vvacante;
        this.fEmpleado = fEmpleado;
        ControladorRegistro  rcontrolador = new ControladorRegistro(usuario, fRegistro, fIngreso);
        ControladorVacante vcontrolador = new ControladorVacante(frrhh, fIngreso, fRegistro, vvacante);
        ControladorIngresoempleado econtrolador = new ControladorIngresoempleado(usuario, fIngreso, frrhh, vvacante, fEmpleado);
        this.fIngreso.cancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }  
        });
        this.fIngreso.aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean a = false;
                for(int i=0;i<usuario.usuario.length;i++){
                    if(usuario.usuario[i].getNombre().equals(fIngreso.txtNombre.getText())&&usuario.usuario[i].getDni().equals(fIngreso.txtContra.getText())){
                        JOptionPane.showMessageDialog(null,"Usuario válido");
                        a = true;
                     
                  
                    }
                }
                if(!a){
                    JOptionPane.showMessageDialog(null,"Usuario inválido");
                }
                
            }
        });
        this.fIngreso.registrarse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //RegistroControlador  rcontrolador = new RegistroControlador(usuario, fRegistro, fIngreso);
                rcontrolador.iniciar();
                fIngreso.txtNombre.setText("");
                fIngreso.txtContra.setText("");
                fIngreso.setVisible(false);
                
            }   
        });
        this.fIngreso.Empleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                econtrolador.iniciar();
                fIngreso.txtNombre.setText("");
                fIngreso.txtContra.setText("");
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
}
