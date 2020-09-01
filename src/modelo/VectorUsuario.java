
package modelo;

import javax.swing.JOptionPane;

public class VectorUsuario {
    public Usuario usuario[];
    Usuario aux;
    
    public VectorUsuario(){
        usuario = new Usuario[0];
    }
    
    public Usuario leerUsuario(String nombre, String apellido, String dni){
                
        Usuario a = new Usuario(nombre, apellido, dni);
        return a;
    }
    
    public void agregarCandidato(String nombre, String apellido, String dni) {
        int i = usuario.length;
        Usuario a;
        
        redimensionar1();
        a = leerUsuario(nombre, apellido, dni);

        usuario[i] = a;
        System.out.println(usuario[i]);
    }
    
    public String mostrarUsuario(){
        String r="";
        for(int i=0; i<usuario.length;i++){
            r+=usuario[i];
        }
        return r;
    }
    
    public boolean buscarUsuario(String dni){
        boolean a = false;
        for(int i=0;i<usuario.length;i++){
            if(dni.equals(usuario[i].getDni())){
                a = true;
            }
        }
        return a;
    }
    
    public boolean validarUsuario(String nombre, String dni){
        boolean a = false;
        for(int i=0;i<usuario.length;i++){
            if(usuario[i].getNombre().equals(nombre)&&usuario[i].getDni().equals(dni)){
                a = true;
            }
        }
        return a;
    }

    private void redimensionar1() {
        int n = usuario.length;
        n = n + 1;
        Usuario y[] = new Usuario[n];
        for (int i = 0; i < usuario.length; i++) {
            y[i] = usuario[i];
        }
        usuario = y;
    }
    public void usuarioempleado(){
        agregarCandidato("empleado", "empleado", "123");
    
    }
    
    public boolean validarDni(String codigo){
        boolean resultado = true;
        
        for(int i=0;i<usuario.length;i++){
            if(codigo.equals(usuario[i].getDni())){
                JOptionPane.showMessageDialog(null,"DNI ya registrado");
                resultado = false;
            }
        }
        
        return resultado;
    }
}
