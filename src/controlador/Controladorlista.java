/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import modelo.VectorVacante;
import vista.frmCrearVacante;
import vista.frmlistaVacante;
import vista.frmMenuPostulante;
/**
 *
 * @author Master
 */

public class Controladorlista {
    
    frmlistaVacante flista;
    frmCrearVacante vista;
    VectorVacante modelo;
    frmMenuPostulante fmenu;
    public Controladorlista(frmlistaVacante flista,frmCrearVacante vista,VectorVacante modelo, frmMenuPostulante fmenu) {
        this.flista = flista;
        this.modelo = modelo;
        this.vista = vista;
        this.fmenu = fmenu;
        
        this.flista.lista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String codigo=null;
                int fila = flista.lista.rowAtPoint(e.getPoint());
                int columna = flista.lista.columnAtPoint(e.getPoint());
                if (fila > -1 ){
                        System.out.println(flista.lista.getValueAt(fila,1));
                }
            }
        });
        this.flista.Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fmenu.setVisible(true);
                flista.setVisible(false);
            }
        });
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
