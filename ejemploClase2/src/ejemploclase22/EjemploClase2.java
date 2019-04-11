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
public class EjemploClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este m;etodo es el principal de un proyecto
        // No olvidar ingresar valores
        
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese su nombre");
        nombre = entrada.next();
        System.out.println("Por favor ingres su apellido");
        apellido = entrada.next();
       
        System.out.println("Su nombre es: "+nombre+"\n\n\t"+ "Su apellido"
                + " es: "+apellido);
    }
    
}
