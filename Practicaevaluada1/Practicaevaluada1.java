/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author rayha
 */
public class Practicaevaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double salario, cantidad;
        salario = 0;
        double SEM, IVM, ASO, respuesta, respuesta2, respuesta3, total, tt;
        SEM = 9.25;
        IVM = 5.08;
        ASO = 2.5;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario por favor"));
        respuesta = salario * SEM;
        JOptionPane.showMessageDialog(null, "El salario con el cobro del SEM es" + respuesta);
        respuesta2 = salario * IVM;
        JOptionPane.showMessageDialog(null, "El salario con el cobro del IVM es" + respuesta2);
        respuesta3 = respuesta2 + respuesta;
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de "+ "SEM y IVM" + respuesta3);
        total = respuesta3 - SEM - IVM * 0.025 ;
        JOptionPane.showMessageDialog(null, "Para la asociación de la empresa se le asigna un valor de" + total);

        
    }
    
}
