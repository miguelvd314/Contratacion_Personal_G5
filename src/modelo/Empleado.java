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
public class Empleado {
    
    private String usuarioemp;
    private String contraseñaemp;
    boolean activo=false;
    
    public Empleado(String usuarioemp, String contraseñaemp){
        this.usuarioemp = usuarioemp;
        this.contraseñaemp = contraseñaemp;
 
    }

    public String getUsuarioemp() {
        return usuarioemp;
    }

    public void setUsuarioemp(String usuarioemp) {
        this.usuarioemp = usuarioemp;
    }

    public String getContraseñaemp() {
        return contraseñaemp;
    }

    public void setContraseñaemp(String contraseñaemp) {
        this.contraseñaemp = contraseñaemp;
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
    
    @Override
    public String toString() {
        return "Empleado{" + "usuarioemp=" + usuarioemp + ", contraseñaemp=" + contraseñaemp + ", activo=" + activo + '}';
    }

   
    
    
    
    
    
    
}
