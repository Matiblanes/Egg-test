/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;


import Entidades.Persona;
import Servicios.ServiciosPersona;





/**
 *
 * @author matias
 */
public class Poo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServiciosPersona pe = new ServiciosPersona();
       Persona [] p = new Persona [4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona N°"+ (i+1)+" :");
            p [i] = pe.crearPersona();
        }
       double[] imcs = {pe.calcularIMC(p[0]),pe.calcularIMC(p[1]),pe.calcularIMC(p[2]),pe.calcularIMC(p[3])};
       int[] edades = {p[0].getEdad(), p[1].getEdad(), p[2].getEdad(), p[3].getEdad()};
       porcentajeImcs(imcs);
       cantidadesEdad(edades);
    }
public static void porcentajeImcs(double[] imcs) {

        int low = 0, medium = 0, high = 0;

        for (int i = 0; i < 4; i++) {

            if (imcs[i] == -1) {

                low++;

            } else if (imcs[i] == 0) {

                medium++;

            } else {

                high++;

            }
        System.out.println(low + " están bajo su peso ideal.");

        System.out.println(medium + " están en su peso ideal.");

        System.out.println(high + " están sobre su peso ideal.");
        }
}
    public static void cantidadesEdad(int[] edades) {
        int menor = 0, mayor = 0;
        for (int i = 0; i < 4; i++) {

            if (edades[i] < 18) {

                menor++;

            } else {

                mayor++;
            }
        }
    }
}

