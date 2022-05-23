/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author matias
 */
public class ServiciosPersona {
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona p = new Persona();
        
        System.out.println("ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("ingrese la edad");
        p.setEdad(leer.nextInt());
        System.out.println("ingrese sexo,H = hombre,M = mujer,O = otro");
        String sexo = leer.next().toUpperCase();
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {

            System.out.print("Ingrese una opción válida: ");

            sexo = leer.next().toUpperCase();
        }
        p.setSexo(sexo);
        System.out.println("ingrese el peso");
        p.setPeso(leer.nextDouble());
        System.out.println("ingrese la altura");
        p.setAltura(leer.nextDouble());
        return p;
    }
    public double calcularIMC (Persona p){
        double Peso = p.getPeso();
        double Altura = p.getAltura();
        double imc = Peso / (Altura * Altura);
        if (imc < 20) {
            System.out.println("Usted se encuentra por debajo del peso ideal");
            return -1;
        }else if (imc >= 20 || imc <= 25){
            System.out.println("Usted se encuentra en el peso ideal");
            return 0;
        }else{
            System.out.println("Usted se encuentra por arriba del peso ideal");
            return 1;
        }
    }
    public boolean esMayorEdad (Persona p){
        int edad = p.getEdad();
        if (edad < 18) {
            System.out.println("Usted es menor de edad");
            return true;
        }else{
            System.out.println("Usted es mayor de edad");
            return false;
        }
        
    }
}

