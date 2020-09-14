
package controlador;

import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.VectorUsuario;
import vista.frmIngreso;
import vista.frmRegistro;
import controlador.ControladorIngreso;
import javax.swing.JOptionPane;

public class ControladorRegistro {
    VectorUsuario usuario;
    frmRegistro fRegistro;
    frmIngreso fIngreso;
    
    public ControladorRegistro(frmRegistro fRegistro){
        this.fRegistro = fRegistro;
        
        
        this.fRegistro.cancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fRegistro.dispose();
                frmIngreso fIngreso = new frmIngreso();
                ControladorIngreso cIngreso = new ControladorIngreso(fIngreso);
                cIngreso.iniciar();
            }            
        });
        this.fRegistro.aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean a = false;
                for(int i=0;i<Repositorio.vUsuario.usuario.length;i++){
                    if(fRegistro.txtDni.getText().equals(Repositorio.vUsuario.usuario[i].getDni())){
                        a = true;
                        JOptionPane.showMessageDialog(null,"DNI ya registrado");
                    }
                }
                if(!a){
                    Repositorio.vUsuario.agregarCandidato(fRegistro.txtNombre.getText(), fRegistro.txtApellido.getText(), fRegistro.txtDni.getText());
                    fRegistro.dispose();
                    frmIngreso fIngreso = new frmIngreso();
                    ControladorIngreso cIngreso = new ControladorIngreso(fIngreso);
                    cIngreso.iniciar();
                }
                
            }
        });
    }
    
    public void iniciar(){
        this.fRegistro.setVisible(true);
        this.fRegistro.setSize(400, 450);
        this.fRegistro.setResizable(false);
        this.fRegistro.setLocationRelativeTo(null);
    }
}
