/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double resultado;

        System.out.println("Ingrese el primer número");
        int numero1;
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        int numero2;
        numero2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Indique que operación matemática deseea hacer");
        String operacion;
        operacion = entrada.nextLine();
        operacion = operacion.toLowerCase();

        if (numero1 > numero2);
        {

            switch (operacion) {
                case "suma":
                    resultado = numero1 + numero2;
                    System.out.printf("El resultado de la suma es:"
                            + "%.2f", resultado);
                    break;
                case "resta":
                    resultado = numero1 - numero2;
                    System.out.printf("El resultado de la resta es:"
                            + "%.2f", resultado);
                    break;
                case "multiplicacion":
                case "multiplicación":
                    resultado = numero1 * numero2;
                    System.out.printf("El resultado de la multiplicación es:"
                            + "%.2f", resultado);
                    break;
                case "division":
                case "división":
                    resultado = numero1 / numero2;
                    System.out.printf("El resultado de la división es:"
                            + "%.2f", resultado);
                    break;
                default:
                    System.out.println("Datos ingresados erroneamente");
                    break;

            }
        }

    }
}
