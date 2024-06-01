/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraclase2;

import javax.swing.JOptionPane;

/**
 *
 * @author TChaves
 */
public class Extraclase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Creación de programa que solicite a un usuario los años de antiguedad en su trabajo, las horas que trabaja por semana
        y el pago que recibe por hora que brinde el salario bruto mensual y semanal */
        Double antiguedad;
        antiguedad = Double.valueOf(JOptionPane.showInputDialog("Ingrese los años de antiguedad"));
        System.out.println(antiguedad);
        Double horassemana;
        horassemana = Double.valueOf(JOptionPane.showInputDialog("Ingrese las horas laboradas por semana"));
        System.out.println(horassemana);
        Double pagohora;
        pagohora = Double.valueOf(JOptionPane.showInputDialog("Ingrese el pago recibido por hora"));
        System.out.println(pagohora);
        double salariobrutosem;
        salariobrutosem = horassemana * pagohora;
        System.out.println("Su salario bruto semanal es de: " + salariobrutosem);
        double salariobrutomen;
        salariobrutomen = salariobrutosem * 4;
        System.out.println("Su salario bruto mensual es de: " + salariobrutomen);

        /*Si la antiguedad es mayor a 10, se le dará un aumento del 20%. Considerando que si el nuevo salario es mayor a 
        1000 se le aplicará una deducción de 10% y si es mayor de 2000 se le aplicará una deduccion del 15%. Mostrandole al
        usuario el salario neto con deducciones */
        double salarionuevo;
        if (antiguedad > 10) {
            salarionuevo = (salariobrutomen * 0.20) + salariobrutomen;
            System.out.println("Su aumento de salario sera de un 20%, por lo que su nuevo salario bruto es: " + salarionuevo);
            if (salarionuevo > 1000) {
                salarionuevo = salarionuevo - (salarionuevo * 0.10);
                System.out.println("Su aumento de salario neto, con deducciones sera de: " + salarionuevo);
            } else if (salarionuevo > 2000) {
                salarionuevo = salarionuevo - (salarionuevo * 0.15);
                System.out.println("Su aumento de salario neto, con deducciones sera de: " + salarionuevo);
            }