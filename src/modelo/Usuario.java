
package modelo;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private boolean activo;
 
    
    public Usuario(String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    public String toString(){
	return apellido + " " + nombre + " " + dni;
    }
        
    public boolean isActivo() {
        return activo;
    }

    public void setActivo() {
        this.activo = activo;
    }
    
    public boolean salir(){
        boolean result = false;
        if(this.activo){
            this.activo = false;
            result = true;
        }
        return result;
    }
}
