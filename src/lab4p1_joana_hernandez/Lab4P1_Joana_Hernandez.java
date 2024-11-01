/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_joana_hernandez;
import java.util.Scanner;
/**
 *
 * @author joana
 */
public class Lab4P1_Joana_Hernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
       int respuesta = scanner.nextInt();
        
        do {
        System.out.println("Menu de opciones");
        System.out.println("1-conversion a binario");
        System.out.println("2-validar correos");
        System.out.println("3-formar palabras");
        System.out.println("4-Salida");
        System.out.println("Elija una opcion: ");
        
        
        switch (respuesta) {
            case 1: 
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4:
                break;
                
            default :
                System.out.println("Opcion invalida");
        }
        
        } while (respuesta != 4);
        // aqui termina
    }
    // aqui termina
}
