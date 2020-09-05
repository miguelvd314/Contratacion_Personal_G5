
import controlador.ControladorIngreso;
import modelo.VectorEmpleado;
import modelo.VectorUsuario;
import vista.frmIngreso;
import vista.frmMenuEmpleado;
import vista.frmMenuPostulante;
import vista.frmRegistro;



public class App {
    public static void main(String[] args) {
        VectorEmpleado empleado=new VectorEmpleado();
        VectorUsuario usuario = new VectorUsuario();
        frmIngreso fIngreso = new frmIngreso();
        frmRegistro fRegistro = new frmRegistro();
        frmMenuPostulante fmenupost=new frmMenuPostulante();
        frmMenuEmpleado fMenuEmpleado=new frmMenuEmpleado();
        
        ControladorIngreso  controlador = new ControladorIngreso(usuario, fIngreso, fRegistro,empleado,fmenupost,fMenuEmpleado);
        controlador.iniciar();
                
    }
    
   
}
