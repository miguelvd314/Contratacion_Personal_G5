
import controlador.ControladorIngreso;
import modelo.VectorUsuario;
import vista.frmIngreso;
import vista.frmRegistro;
import modelo.Vectorvacante;
import vista.frmRrhh;



public class App {
    public static void main(String[] args) {
        
        VectorUsuario usuario = new VectorUsuario();
        frmIngreso fIngreso = new frmIngreso();
        frmRegistro fRegistro = new frmRegistro();
        Vectorvacante vvacante  = new Vectorvacante();
        frmRrhh frrhh = new frmRrhh() ;
        
        ControladorIngreso  controlador = new ControladorIngreso(usuario, fIngreso, fRegistro, frrhh, vvacante);
        controlador.iniciar();
    
                
    }
    
   
}
