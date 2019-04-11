/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;


/**
 *
 * @author reati
 */
public class MiEjercico {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        int nota1;
        int nota2;
        double promedio;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese su nombre");
        nombre = entrada.nextLine();  
        
        System.out.println("Por favor ingrese su apellido");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt(); 
        entrada.nextLine(); // limpieza del buffer de entrada de datos
        
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese su pais");
        pais = entrada.nextLine();
        
        System.out.println("Por favor ingrese sus nota 1");
        nota1 = entrada.nextInt(); 
        
        System.out.println("Por favor ingrese sus nota 2");
        nota2 = entrada.nextInt();
        entrada.nextLine(); // limpieza del buffer de entrada de datos
        
        promedio = (nota1+nota2)/2;
        
        System.out.printf("Su nombre y  apellido es: %s %s \nEdad: %s \n "
                + "Ciudad: %s \nPais: %s \nnotas: %s,%s \n promedio: %s  "
                ,nombre, apellido,edad, ciudad, pais, nota1, nota2, promedio);
    }
    
    
}
