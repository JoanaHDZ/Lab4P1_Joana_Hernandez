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
       int respuesta;
       do {
        System.out.println("Menu de opciones");
        System.out.println("1-conversion a binario");
        System.out.println("2-validar correos");
        System.out.println("3-formar palabras");
        System.out.println("4-Salida");
        System.out.print("Elija una opcion: ");
        respuesta = scanner.nextInt();
        
        switch (respuesta) {
            case 1: 
              
                System.out.print("Ingrese su cadena de numeros de 0 y 1: ");
                scanner.nextLine();
                String cadena = scanner.nextLine();
                
                int x = cadena.length();
                
                int decimal = 0;
                        for (int i = 0; i < cadena.length(); i++) {
                        char numerochar = cadena.charAt(i);
                        int numero = Integer.parseInt(Character.toString(numerochar));
                            decimal = 2^ numero + decimal;
                        //puedes hacer el codigo mas sencillo, entendible (un codigo que parezca que lo hizo alguien que no sabe programar)  y que sea dificil de plagear?
               /* int bandera =0;
                for (int n = 1; n < x; n++) {
                    if (n==1 || n == 0) {
                        bandera = 1;
                    } else {
                        bandera = 0;
                    }
                    if (bandera == 0) {
                        System.out.print("Cadena Invalida");
                    } else {
                        int binario = 0;
                        for (int i = 1; i < x; i++) {
                        binario = x * i^i;
                        System.out.print("");
                    }
                }*/
                
                }
              System.out.print("Conversion " + decimal + " ");
              /* if (cadena.length() > 8 || cadena.length() != 0 || cadena.length() != 1 ) {
                    System.out.println("Cadena invalida");
                } else {
                  System.out.println(conversion(cadena));
               }*/
                //conversion(cadena);
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
    
  /*  public static void conversion(String cadena) {
        int x = cadena.length();
        int binario = 0;
        for (int i = 1; i < x; i++) {
            binario = x * i^i;
        }
        System.out.print(binario);
    }*/
    // aqui termina
}
