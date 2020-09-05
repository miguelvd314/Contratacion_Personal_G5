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
    
        Empleado empleado[]=new Empleado[2];
        boolean activo=false;
    public   VectorEmpleado(){
           empleado[0]=new Empleado("cesar","2");
           empleado[1]=new Empleado("junior","1");
       }
    
    
    
     public boolean ingresar(String usuarioemp, String contraseñaemp){
         
        boolean result= false;
      
        for(int i=0;i<empleado.length;i++){
        if(empleado[i].getUsuarioemp().equals(usuarioemp) && 
                empleado[i].getContraseñaemp().equals(contraseñaemp) &&
                !this.activo){
            this.activo = true;
            result= true;
        }
        
        }
        return result;
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
