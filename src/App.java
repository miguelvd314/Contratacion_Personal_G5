
import controlador.ControladorIngreso;
import modelo.VectorEmpleado;
import modelo.VectorUsuario;
import modelo.VectorVacante;
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
        frmMenuPostulante fmenupost = new frmMenuPostulante();
        frmMenuEmpleado fMenuEmpleado = new frmMenuEmpleado();
        VectorVacante vectorVacante = new VectorVacante();
        
        ControladorIngreso  controlador = new ControladorIngreso(usuario, fIngreso, fRegistro,empleado,fmenupost,fMenuEmpleado, vectorVacante);
        controlador.iniciar();
                
    }
    
   
}
