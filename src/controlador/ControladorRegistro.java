
package controlador;

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
    
    public ControladorRegistro(VectorUsuario usuario, frmRegistro fRegistro, frmIngreso fIngreso){
        this.usuario = usuario;
        this.fRegistro = fRegistro;
        this.fIngreso = fIngreso;
        
        this.fRegistro.cancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fRegistro.setVisible(false);
                limpiar();
                fIngreso.setVisible(true);
            }            
        });
        this.fRegistro.aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usuario.buscarUsuario(fRegistro.txtDni.getText())){
                    JOptionPane.showMessageDialog(null,"DNI ya registrado");
                }
                else{
                    usuario.agregarCandidato(fRegistro.txtNombre.getText(), fRegistro.txtApellido.getText(), fRegistro.txtDni.getText());
                    fRegistro.setVisible(false);
                    limpiar();
                    fIngreso.setVisible(true);
                }
            }
        });
    }
    
    public void iniciar(){
        this.fRegistro.setVisible(true);
        this.fRegistro.setLocationRelativeTo(null);
    }
    public void limpiar(){
    fRegistro.txtApellido.setText("");
    fRegistro.txtNombre.setText("");
    fRegistro.txtDni.setText("");
    
      
    }
}
