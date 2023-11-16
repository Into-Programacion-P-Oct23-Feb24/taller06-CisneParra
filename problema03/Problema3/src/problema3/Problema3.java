/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double aumento;
        double total;
        System.out.println("Ingrese el nombre del empleado");
        String nombre;
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        String tipo;
        tipo = entrada.nextLine();
        System.out.println("Ingrese el sueldo del empleado");
        double sueldo;
        sueldo = entrada.nextDouble();
        switch (tipo) {
            case "tipo 1":
            case "1":
                aumento = (sueldo * 0.5) / 100;
                total = sueldo + aumento;
                System.out.printf("Nombre del empleado: %s\n"
                        + "Tipo de empleado: %s\n"
                        + "Sueldo: %.2f\n"
                        + "Aumento: %.2f\n"
                        + "Nuevo sueldo: %.2f", nombre, tipo, sueldo,
                        aumento, total);
                break;
            case "tipo 2":
            case "2":
                aumento = (sueldo * 0.7) / 100;
                total = sueldo + aumento;
                System.out.printf("Nombre del empleado: %s\n"
                        + "Tipo de empleado: %s\n"
                        + "Sueldo: %.2f\n"
                        + "Aumento: %.2f\n"
                        + "Nuevo sueldo: %.2f", nombre, tipo, sueldo,
                        aumento, total);
                break;
            case "tipo 3":
            case "3":
                aumento = (sueldo * 0.9) / 100;
                total = sueldo + aumento;
                System.out.printf("Nombre del empleado: %s\n"
                        + "Tipo de empleado: %s\n"
                        + "Sueldo: %.2f\n"
                        + "Aumento: %.2f\n"
                        + "Nuevo sueldo: %.2f", nombre, tipo, sueldo,
                        aumento, total);
                break;
            case "tipo 4":
            case "4":
                aumento = (sueldo * 1.2) / 100;
                total = sueldo + aumento;
                System.out.printf("Nombre del empleado: %s\n"
                        + "Tipo de empleado: %s\n"
                        + "Sueldo: %.2f\n"
                        + "Aumento: %.2f\n"
                        + "Nuevo sueldo: %.2f", nombre, tipo, sueldo,
                        aumento, total);
                break;
            case "tipo 5":
            case "5":
                aumento = (sueldo * 1.5) / 100;
                total = sueldo + aumento;
                System.out.printf("Nombre del empleado: %s\n"
                        + "Tipo de empleado: %s\n"
                        + "Sueldo: %.2f\n"
                        + "Aumento: %.2f\n"
                        + "Nuevo sueldo: %.2f", nombre, tipo, sueldo,
                        aumento, total);
                break;
            default:
                System.out.println("Datos erroneos");

        }

    }

}
