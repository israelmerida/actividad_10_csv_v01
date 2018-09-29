/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.viewCSV;
import models.modelCSV;
import controllers.controllerCSV;
/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        viewCSV viewCvs = new viewCSV();
        modelCSV modelCvs = new modelCSV();
        controllerCSV controllerCvs = new controllerCSV(viewCvs,modelCvs);
    }
    
}
