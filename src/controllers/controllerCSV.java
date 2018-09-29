/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.viewCSV;
import models.modelCSV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class controllerCSV {
    viewCSV ViewCsv;
    modelCSV ModelCsv;
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if (e.getSource() == ViewCsv.jb_nuevo)
                    jb_nuevo();
            else if(e.getSource() == ViewCsv.jb_guardar){
                jb_guardar();
            }
        }
    };

        private void jb_nuevo() {
             ViewCsv.jtf_nombre.setText("");
             ViewCsv.jtf_email.setText("");
        }

        private void jb_guardar() {
            ModelCsv.setNombre(ViewCsv.jtf_nombre.getText());
            ModelCsv.setEmail(ViewCsv.jtf_email.getText());
            ModelCsv.writeFile();
        }
        public controllerCSV(viewCSV viewCvs, modelCSV modelCvs) {
        this.ViewCsv = viewCvs;
        this.ModelCsv = modelCvs;
        this.ViewCsv.jb_guardar.addActionListener(actionListener);
        this.ViewCsv.jb_nuevo.addActionListener(actionListener);
        initComponents();
    }
        private void initComponents(){
            ViewCsv.setVisible(true);
            ModelCsv.readFile();
            ViewCsv.jtf_nombre.setText(ModelCsv.getNombre());
            ViewCsv.jtf_email.setText(ModelCsv.getEmail());
        
    }
    
}
