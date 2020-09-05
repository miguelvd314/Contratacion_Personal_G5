
package controlador;

import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.VectorEmpleado;

import modelo.VectorUsuario;
import modelo.VectorVacante;
import vista.frmEditarVacante;
import vista.frmIngreso;
import vista.frmMenuEmpleado;
import vista.frmMenuPostulante;
import vista.frmRegistro;
import vista.frmRrhh;

public class ControladorIngreso {
    VectorUsuario usuario;
    frmIngreso fIngreso;
    frmRegistro fRegistro;
    frmRrhh fRrhh;
    frmMenuPostulante menupost;
    ControladorRrhh controladorRrhh;
    VectorEmpleado empleado;
    frmMenuEmpleado fMenuEmpleado;
    ControladorMenuEmpleado ControladorMenuEmp;
    frmEditarVacante fEditarVacante;
    VectorVacante vectorvacante;
    public ControladorIngreso(VectorUsuario usuario, frmIngreso fIngreso, frmRegistro fRegistro,VectorEmpleado empleado
            ,frmMenuPostulante menupost,frmMenuEmpleado fMenuEmpleado){
        this.fIngreso = fIngreso;
        this.fRegistro = fRegistro;
    
      
        ControladorRegistro  rcontrolador = new ControladorRegistro(usuario, fRegistro, fIngreso);
        
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
         
                if(usuario.ingresar(fIngreso.txtNombre.getText(),fIngreso.txtContra.getText()) ){
                        JOptionPane.showMessageDialog(null,"Usuario válido");
                        a = true;
                       frmMenuPostulante vistaMenu=new frmMenuPostulante();  
                      ControladorMenuPostulante controladorMenu=new ControladorMenuPostulante(vistaMenu);
                      controladorMenu.iniciar();
                      vistaMenu.setVisible(true); 
                      fIngreso.setVisible(false);
                   
                    }else if(empleado.ingresar(fIngreso.txtNombre.getText(),fIngreso.txtContra.getText())){
                        
                      JOptionPane.showMessageDialog(null,"Empleado de Rrhh");
                        a = true;
                       
                        frmMenuEmpleado vistaMenuEmpleado=new frmMenuEmpleado();
                        ControladorMenuEmpleado controladorMenuEmp=new ControladorMenuEmpleado(vistaMenuEmpleado);
                        controladorMenuEmp.iniciar();
                        
                       frmRrhh vista=new frmRrhh();  
                      ControladorRrhh controladorRrhh=new ControladorRrhh(vista,Repositorio.modelovacante);
                      controladorRrhh.iniciar();
                      
                      vista.setVisible(true);
                       fIngreso.setVisible(false);

                    }else if(!a){
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
        
        
        
    }
    
    public void iniciar(){
        this.fIngreso.setVisible(true);
        this.fIngreso.setSize(410, 500);//ANCHO / LARGO
        
        this.fIngreso.setResizable(false);
        
        this.fIngreso.setLocationRelativeTo(null);
    }
}
