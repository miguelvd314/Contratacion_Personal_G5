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
    private int tiempo;
    private String nombre;
    private int salario;
    private int codigo;

    public Vacante(int tiempo, String nombre, int salario,int codigo) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.salario = salario;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public String toString(){
    return nombre + " " + salario + " " + tiempo + " "+ codigo;
    }
    
    
}
