
import controlador.ControladorIngreso;
import modelo.VectorUsuario;
import vista.frmIngreso;
import vista.frmRegistro;
import modelo.Vectorvacante;
import vista.frmRrhh;
import vista.frmEmpleado;
import vista.frmUsuariosRegistrados;


public class App {
    public static void main(String[] args) {
        
        VectorUsuario usuario = new VectorUsuario();
        frmIngreso fIngreso = new frmIngreso();
        frmRegistro fRegistro = new frmRegistro();
        frmEmpleado fEmpleado = new frmEmpleado();
        Vectorvacante vvacante  = new Vectorvacante();
        frmUsuariosRegistrados fURegistrados = new frmUsuariosRegistrados();
        frmRrhh frrhh = new frmRrhh() ;
        usuario.usuarioempleado();
        ControladorIngreso  controlador = new ControladorIngreso(usuario, fIngreso, fRegistro, frrhh, vvacante, fEmpleado, fURegistrados);
        controlador.iniciar();
                
    }
    
   
}
