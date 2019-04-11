/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase22;

import java.util.Scanner;

/**
 *
 * @author reati
 */
public class EjemploClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de un proyecto
        // No olvidar ingresar valores
        
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
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
        
        /**
         System.out.println("Su nombre es: "+nombre+"\n\n\t"+ "Su apellido"
                + " es: "+apellido +","+" " +"edad: " +edad+"\n"+"Ciudad: "
        +ciudad);
        */ 
        
        System.out.printf("Su nombre es %s\n\n\t Su apellido es %s,\n edad%s"
                + " \nCiudad%s", nombre, apellido, edad, ciudad);
    }
    
}
 