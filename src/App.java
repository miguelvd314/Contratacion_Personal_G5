
import controlador.ControladorIngreso;
import vista.frmIngreso;

public class App {
    public static void main(String[] args) {
        frmIngreso fIngreso = new frmIngreso();
        ControladorIngreso  cIngreso = new ControladorIngreso(fIngreso);
        cIngreso.iniciar();
    }
}
