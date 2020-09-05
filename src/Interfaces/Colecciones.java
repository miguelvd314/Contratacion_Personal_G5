/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Max
 */
public interface Colecciones {
    
   public boolean add(Object elemento);
    public int find(String codigo);
    public Object[][] getDatos();
    public boolean update(Object  elemento);
    public boolean remove(String id);
    public String[] getCabecera();
    public void sort();
    
    public boolean isLleno();
    public void aumentarTamanho();
    public void moverElementos(int posicion) ;
    public boolean isVacio() ;
    
    
    
    
    
    
    
    
    
    
    
}
