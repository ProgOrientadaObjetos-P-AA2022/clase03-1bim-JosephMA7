/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        Hospital hospi = new Hospital();
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 477;
        hospital.presupuesto = 152463.13;
        
        hospi.pacientes = 54;
        hospi.habitaciones = 40;
        hospi.dinerototal = 154896.236;
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hopi.pacientes,
                hospi.habitaciones, hospi.dinerototal);
        
        
        System.out.printf("%s - %d - %.2f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
