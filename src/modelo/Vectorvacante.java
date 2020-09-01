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
public class Vectorvacante {
   
    public Vacante vacante[];
    Vacante aux;
    
    public Vectorvacante(){
        vacante = new Vacante[0];
    }
    
    public Vacante leerVacante(String tiempo, String nombre,  String salario, String codigo){
                
        Vacante a = new Vacante(tiempo,nombre,  salario, codigo);
        return a;
    }
    
    public void agregarVacante(String tiempo, String nombre,  String salario,String codigo) {
        int i = vacante.length;
        Vacante a;
        
        redimensionar1();
        a = leerVacante(tiempo,nombre,  salario,codigo);

        vacante[i] = a;
        System.out.println(vacante[i]);
    }
    
    public String mostrarVacante(){
        String r="";
        for(int i=0; i<vacante.length;i++){
            r+=vacante[i];
        }
        return r;
    }

    private void redimensionar1() {
        int n = vacante.length;
        n = n + 1;
        Vacante y[] = new Vacante[n];
        for (int i = 0; i < vacante.length; i++) {
            y[i] = vacante[i];
        }
        vacante = y;
    }
    
}
