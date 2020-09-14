
package controlador;

import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.frmIngreso;
import vista.frmMenuEmpleado;
import vista.frmMenuPostulante;
import vista.frmRegistro;

public class ControladorIngreso {
    frmIngreso fIngreso;
    public ControladorIngreso(frmIngreso fIngreso){
        this.fIngreso = fIngreso;
        
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
                
                if(Repositorio.vUsuario.buscar(fIngreso.txtNombre.getText(),fIngreso.txtContra.getText())){
                    int id = Repositorio.vUsuario.ingresar(fIngreso.txtNombre.getText(),fIngreso.txtContra.getText());
                    JOptionPane.showMessageDialog(null,"Usuario válido");
                    a = true;
                    frmMenuPostulante fMenuPostulante=new frmMenuPostulante();  
                    ControladorMenuPostulante cMenuPostulante = new ControladorMenuPostulante(fMenuPostulante,id);
                    cMenuPostulante.iniciar();
                    fIngreso.dispose();
                   
                    }else 
                    
                    if(Repositorio.vEmpleado.buscar(fIngreso.txtNombre.getText(),fIngreso.txtContra.getText())){
                        int id = Repositorio.vEmpleado.ingresar(fIngreso.txtNombre.getText(),fIngreso.txtContra.getText());
                        JOptionPane.showMessageDialog(null,"Empleado de Rrhh");
                        a = true;
                       
                        frmMenuEmpleado fMenuEmpleado = new frmMenuEmpleado();
                        ControladorMenuEmpleado cMenuEmpleado =new ControladorMenuEmpleado(fMenuEmpleado,id);
                        cMenuEmpleado.iniciar();
                        fIngreso.dispose();
                        

                    }else if(!a){
                      JOptionPane.showMessageDialog(null,"Usuario inválido");  
                    }
                
            
            }
        });
        this.fIngreso.registrarse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //RegistroControlador  rcontrolador = new RegistroControlador(usuario, fRegistro, fIngreso);
                frmRegistro fRegistro = new frmRegistro();
                ControladorRegistro cRegistro = new ControladorRegistro(fRegistro);
                cRegistro.iniciar();
                fIngreso.txtNombre.setText("");
                fIngreso.txtContra.setText("");
                fIngreso.setVisible(false);
                
            }   
        });
        
        
        
    }
    
    public void iniciar(){
        this.fIngreso.setVisible(true);
        this.fIngreso.setSize(410, 500);//ANCHO / LARGO
        
        this.fIngreso.setResizable(false);
        
        this.fIngreso.setLocationRelativeTo(null);
    }
}
