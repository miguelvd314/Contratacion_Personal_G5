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

public class Vacante {
    
    private String codigo;
    private String nombrev;
    private String salariov;
    private String numerov;
    private String descripcionv;
    public static int id;

    public Vacante(String codigo, String nombrev, String salariov, String numerov, String descripcionv) {
        this.codigo = codigo;
        this.nombrev = nombrev;
        this.salariov = salariov;
        this.numerov = numerov;
        this.descripcionv = descripcionv;
    }
    
    public Vacante(String descripcion) {
        this.descripcionv = descripcion;
        this.codigo = String.valueOf(id);
        id++;
    }

    @Override
    public String toString() {
        return descripcionv;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrev() {
        return nombrev;
    }

    public void setNombrev(String nombrev) {
        this.nombrev = nombrev;
    }

    public String getSalariov() {
        return salariov;
    }

    public void setSalariov(String salariov) {
        this.salariov = salariov;
    }

    public String getNumerov() {
        return numerov;
    }

    public void setNumerov(String numerov) {
        this.numerov = numerov;
    }

    public String getDescripcionv() {
        return descripcionv;
    }

    public void setDescripcionv(String descripcionv) {
        this.descripcionv = descripcionv;
    }
    
    
 
    
    
    
    
    
    
}
