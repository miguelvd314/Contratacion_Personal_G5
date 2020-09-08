/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import javax.swing.table.DefaultTableModel;
import modelo.VectorVacante;
import vista.frmRrhh;
import vista.frmlistaVacante;
/**
 *
 * @author Master
 */

public class Controladorlista {
    
    frmlistaVacante flista;
    frmRrhh vista;
    VectorVacante modelo;
    public Controladorlista(frmlistaVacante flista) {
        this.flista = flista;
        
        
    }
    
    public void iniciarla(){
        this.flista.setVisible(true);
        this.flista.setResizable(false);
        this.flista.setLocationRelativeTo(null);
         this.flista.lista.setAutoCreateRowSorter(true);
         limpiarcontroles();
    }
  public void limpiarcontroles(){
  
  DefaultTableModel modelotabla = new DefaultTableModel(this.modelo.getDatos(),this.modelo.getCabecera());
        this.flista.lista.setModel(modelotabla);
  
  }
}
