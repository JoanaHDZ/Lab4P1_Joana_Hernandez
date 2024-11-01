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
      Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de Opciones:");
            System.out.println("1. Conversion Binario a Decimal");
            System.out.println("2. Validacion de Correo");
            System.out.println("3. Formar Palabra");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                convertirBinario(sc);
                break;
                case 2:
                validarCorreo(sc);
                case 3: 
                formarPalabra(sc);
                break;
                case 4:
                System.out.println("Saliendo...");
                break;
                default: 
                System.out.println("Opcion invalida.");
                break;
            }
            System.out.println();
        } while (opcion != 4);
       
    }
    static void convertirBinario(Scanner sc) {
        System.out.print("Escriba un número binario de 8 dígitos: ");
        String binario = sc.nextLine();

        if (binario.length() == 8 && (binario.replace("0", "").replace("1", "").isEmpty())) {
            int decimal = 0;
            int potencia = 1;
            for (int i = binario.length() - 1; i >= 0; i--) {
                if (binario.charAt(i) == '1') {
                    decimal += potencia;
                }
                potencia *= 2;
            }
            System.out.println("Decimal: " + decimal);
        } else {
            System.out.println("Número binario inválido.");
        }
    }
    
    static void validarCorreo(Scanner sc) {
        System.out.print("Ingrese su correo electronico: ");
        String correo = sc.nextLine();

        String gmail = "@gmail.com";
        String outlook = "@outlook.com";
        String unitec = "@unitec.edu";

        double maxCoincidencia = 0;
        String mejorDominio = "";

        String dominios[] = {gmail, outlook, unitec};
        
        for (int i = 0; i < dominios.length; i++) {
            String x = dominios[i];
            int coincidencias = 0;
            for (int j = 0; j < x.length() && j < correo.length(); j++) {
                if (correo.charAt(correo.length() - x.length() + j) == x.charAt(j)) {
                    coincidencias++;
                }
            }
            double porcentajeCoincidencia = (double) coincidencias / x.length();

            if (porcentajeCoincidencia > maxCoincidencia) {
                maxCoincidencia = porcentajeCoincidencia;
                mejorDominio = x;
            }
        }

        if (maxCoincidencia == 1) {
            System.out.println("Correo valido.");
        } else if (maxCoincidencia > 0) {
            System.out.println("Sugerencia: " + mejorDominio);
        } else {
            System.out.println("Correo no valido.");
        }
    }
       
    static void formarPalabra(Scanner sc) {
        System.out.print("Escriba una frase o palabra: ");
        String frase = sc.nextLine();
        System.out.print("Escriba la palabra a formar (máximo 10 caracteres): ");
        String palabra = sc.nextLine();

        if (palabra.length() > 10) {
            System.out.println("La palabra es demasiado larga.");
        }

        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int posicion = frase.indexOf(letra);
            if (posicion != -1) {
                resultado += letra;
                frase = frase.substring(0, posicion) + '*' + frase.substring(posicion + 1);
            } else {
                System.out.println("No se pudo formar la palabra completa.");
            }
        }

        System.out.println("Frase modificada: " + frase);
        System.out.println("Palabra formada: " + resultado);
    }
}