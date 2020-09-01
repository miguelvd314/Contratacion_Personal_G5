/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Master
 */
public class Vacante {
    private String tiempo;
    private String nombre;
    private String salario;
    private String codigo;

    public Vacante(String tiempo, String nombre, String salario,String codigo) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.salario = salario;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    public String toString(){
    return nombre + " " + salario + " " + tiempo + " "+ codigo;
    }
    
    
}
