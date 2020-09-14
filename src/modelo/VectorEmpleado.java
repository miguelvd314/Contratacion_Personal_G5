/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Max
 */
public class VectorEmpleado {
    
        public Empleado empleado[]=new Empleado[2];
        boolean activo=false;
        public   VectorEmpleado(){
           empleado[0]=new Empleado("cesar","2");
           empleado[1]=new Empleado("junior","1");
       }
    
    
    
     public boolean buscar(String usuarioemp, String contraseñaemp){
        boolean result= false;
        for(int i=0;i<empleado.length;i++){
            if(empleado[i].getUsuarioemp().equals(usuarioemp) && 
                    empleado[i].getContraseñaemp().equals(contraseñaemp) &&
                    !empleado[i].activo){
                this.activo = true;
                result= true;
            }
        }
        return result;
    }
    
    public int ingresar(String nombre, String dni){
        int result= -1;
        for(int i=0;i<empleado.length;i++){
        if(empleado[i].getUsuarioemp().equalsIgnoreCase(nombre) && 
            empleado[i].getContraseñaemp().equals(dni) &&
            !empleado[i].isActivo()){
                empleado[i].setActivo();
                result= i;
            }
        }
        return result;
    }

   
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
