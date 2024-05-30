/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraclase1;

import javax.swing.JOptionPane;

/**
 *
 * @author TChaves
 */
public class Extraclase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Este codigo se realiza para solicitar el nombre y salario semanal de una persona
    donde con este dato se le brinde el salario neto, las deducciones y el salario bruto (mensual)*/
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        System.out.println(nombre);
        double salariosemanal;
        salariosemanal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario semanal"));
        double salariomensual;
        salariomensual = salariosemanal * 4;
        double deduccion;
        deduccion = 0.0934;
        /*Esta deducción fue brindada directamente en las instrucciones*/
        double deducciondesalario;
        deducciondesalario = salariomensual * deduccion;
        double salarioneto;
        salarioneto = salariomensual - deducciondesalario;

        System.out.println("Estimad@ " + nombre + " el salario de este mes se desglosa de la siguiente manera:");
        System.out.println("Salario bruto: " + salariomensual + "Deducciones: " + deducciondesalario + "Salario Neto: " + salarioneto);
    }

}
