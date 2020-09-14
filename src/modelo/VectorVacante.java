/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Vacante;
import Interfaces.Colecciones;

/**
 *
 * @author Max
 */
public class VectorVacante implements Colecciones {
    
    public Vacante[] vacante;
    private int indice, tamanho;
    private final String[] cabecera =  {"CODIGO","NOMBRE",
                            "SALARIO","NUMERO VACANTES", "DESCRIPCION VACANTE",
                            };

    public VectorVacante() {
        this.indice =0;
        this.tamanho =20;
        this.vacante = new Vacante[this.tamanho];
        /*this.add(new Vacante("Operador"));
        this.add(new Vacante("Supervisor"));    
        this.add(new Vacante("Administrador"));
        this.add(new Vacante("Coordinador"));;*/
        for(int i = 0; i < tamanho; i++){
            //String resultado;
            //resultado = vacante[i].getNombrev();
            //this.add(new Vacante(resultado));
        }
    }
    
    @Override
    public boolean add (Object v){//Inserta un elemento (objeto) en la posición de la lista dada por el índice indicado.
        boolean resultado = false;
        if(!isLleno()){
            this.vacante[this.indice]= (Vacante)v;
            this.indice++;
            resultado = true;
        }
        return resultado;
    }
    
    @Override
    public int find(String codigo) {//Comparar codigo ingresado con guardado y retornar el indice
        int resultado = -1;
         for(int indice=0; indice < this.indice; indice++){
            if( this.vacante[indice].getCodigo().equalsIgnoreCase(codigo) ) {
                resultado = indice;
                break;
            }
        }
        return resultado;
    }
    

    public Vacante getPersona(String codigo) {//Encontrar el codigo y retornar el objeto del indice encontrado
        Vacante resultado = null;
         for(int indice=0; indice < this.indice; indice++){
            if( this.vacante[indice].getCodigo().equalsIgnoreCase(codigo) ) {
                resultado = this.vacante[indice];
                break;
            }
        }
        return resultado;
    }
     
    @Override
    public Object[][] getDatos(){ //Una matriz de objetos para mostrar en la tabla 
        Object resultado[][] = new Object[this.indice][5];
        if(!isVacio()){
            for(int indice = 0; indice< this.indice;indice++){
                resultado[indice][0] = this.vacante[indice].getCodigo();
                resultado[indice][1] = this.vacante[indice].getNombrev();
                resultado[indice][2] = this.vacante[indice].getSalariov();
                resultado[indice][3] = this.vacante[indice].getNumerov();
                resultado[indice][4] = this.vacante[indice].getDescripcionv();
                           }
        }
        return resultado; //Devuelve una matriz de objetos para la tabla
    }

    @Override
    public String[] getCabecera() {
        return cabecera;
    }

    @Override
    public boolean remove(String codigoeliminar) {//Encontrar objeto a eliminar y devolver true si lo encontro
        boolean resultado = false;
        int encontrado = this.find(codigoeliminar);
        if( encontrado >= 0  ) {
            moverElementos(encontrado);
            resultado = true;
        }
        return resultado;
    }
    
    @Override
    public boolean update(Object vac) {//Actualizar datos en personas 
        boolean resultado = false;
        int encontrado = this.find(((Vacante)vac).getCodigo());
        if(encontrado>= 0){
            this.vacante[encontrado].setCodigo(((Vacante)vac).getCodigo());
            this.vacante[encontrado].setNombrev(((Vacante)vac).getNombrev());
            this.vacante[encontrado].setSalariov(((Vacante)vac).getSalariov());
             this.vacante[encontrado].setNumerov(((Vacante)vac).getNumerov());
            this.vacante[encontrado].setDescripcionv(((Vacante)vac).getDescripcionv());
          
            resultado = true;
        }
        return resultado;
    }
    
    
    @Override
    public boolean isLleno() {//Mostra si esta lleno el arreglo
        boolean resultado = false;
        if (this.indice == this.tamanho){
            aumentarTamanho();
        }
        return resultado;
    }
    
    @Override
    public void aumentarTamanho() {//Aumentar el tamaño del arreglo si esta lleno 
        int tamanho = this.tamanho*2;
        Vacante[] nuevoArreglo = new  Vacante[tamanho];
        for(int i=0; i < this.indice; i++){
            nuevoArreglo[i] = this.vacante[i];
        }
        this.vacante = nuevoArreglo;
    }

    @Override
    public void moverElementos(int posicion) {//Eliminar la posicion encontrada 
        this.indice--;
        for(;posicion<indice ;posicion++){
            this.vacante[posicion] = this.vacante[posicion+1];
        }
        this.vacante[indice]= null;
    }

    @Override
    public boolean isVacio() {//Comenzar en 0
        return this.indice==0;
    }

    @Override
    public void sort() {//Ordenar los objetos 
        Vacante temporal;
        for(int i = 0 ;i<indice ;i++){
            for(int j = 0 ;j<indice ;j++){
                if(this.vacante[i].getCodigo().compareTo(this.vacante[j].getCodigo())< 0){
                    temporal = this.vacante[i];
                    this.vacante[i] = this.vacante[j];
                    this.vacante[j] = temporal;
                }
            }
        }        
    }
    
    public String[] tipoVacantes(){
        String a[] = null;
        
        for(int i = 0; i < vacante.length; i++){
            a[i] = vacante[i].getNombrev();
        }
        
        return a; 
    }
    
    public Object[] getDatosCombo() {
        Object resultado[] = null;
        if(!isVacio()){
            resultado = new Object[this.indice];
            for(int indice=0; indice < this.indice; indice++){
                //resultado[indice] = this.vacante[indice];
                resultado[indice] = this.vacante[indice].getDescripcionv();
            }
        }
        return resultado;
    }
}
