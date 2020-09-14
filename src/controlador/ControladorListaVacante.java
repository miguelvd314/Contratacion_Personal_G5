/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Datos.Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import vista.frmlistaVacante;
import vista.frmMenuPostulante;
/**
 *
 * @author Master
 */

public class ControladorListaVacante {
    
    frmlistaVacante flista;
    int id;
    
    public ControladorListaVacante(frmlistaVacante fListaVacante, int id) {
        this.flista = fListaVacante;
        this.id = id;
        
        this.flista.lista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String codigo=null;
                int fila = fListaVacante.lista.rowAtPoint(e.getPoint());
                int columna = fListaVacante.lista.columnAtPoint(e.getPoint());
                if (fila > -1 ){
                        System.out.println(fListaVacante.lista.getValueAt(fila,1));
                }
            }
        });
        this.flista.Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmMenuPostulante fMenuPostulante = new frmMenuPostulante();
                ControladorMenuPostulante cMenuPostulante = new ControladorMenuPostulante(fMenuPostulante, id);
                cMenuPostulante.iniciar();
                fListaVacante.dispose();
            }
        });
    }
    
    public void iniciar(){
        this.flista.setVisible(true);
        this.flista.setResizable(false);
        this.flista.setLocationRelativeTo(null);
         this.flista.lista.setAutoCreateRowSorter(true);
         limpiarcontroles();
    }
  public void limpiarcontroles(){
  
        DefaultTableModel modelotabla = new DefaultTableModel(Repositorio.vVacante.getDatos(),Repositorio.vVacante.getCabecera());
        this.flista.lista.setModel(modelotabla);
  
  }
}
