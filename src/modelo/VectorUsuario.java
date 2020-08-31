
package modelo;

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

    private void redimensionar1() {
        int n = usuario.length;
        n = n + 1;
        Usuario y[] = new Usuario[n];
        for (int i = 0; i < usuario.length; i++) {
            y[i] = usuario[i];
        }
        usuario = y;
    }
    
}
