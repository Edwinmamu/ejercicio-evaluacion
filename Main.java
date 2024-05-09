package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    convertidorDolar(scanner);

                    break;
                case 2:
                    convertidorEuro(scanner);

                    break;

                case 3:
                    convertirAYen(scanner);

                    break;
                case 4:
                    convertirSoles(scanner);

                    break;
                case 5:
                    convertirLibras(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("opcion mo valida");
                    break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n**Calculadora de conversiones**");
        System.out.println("1. DOLAR");
        System.out.println("2. EURO");
        System.out.println("3. YEN");
        System.out.println("4. SOLES");
        System.out.println("5. LIBRAS");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void convertidorDolar(Scanner sacanner) {
        System.out.println("\n**Conversión de moneda**");
        System.out.println("1. Dolar a Pesos");
        System.out.println("2. Pesos a Dolar");

        int opcionDolar = sacanner.nextInt();
        sacanner.nextLine();

        switch (opcionDolar) {
            case 1:
                convertirDolarAPeso(sacanner);
                break;
            case 2:
                convertirPesoADolar(sacanner);
                break;

            case 0:
                break;

            default:
                System.out.println("opcion no valida. Intete de nuevo");

        }
    }

    private static void convertirDolarAPeso(Scanner sacanner) {

    }

    private static void convertirPesoADolar(Scanner sacanner) {

    }

    private static void convertidorEuro(Scanner scanner) {
        System.out.println("\n**Conversión de moneda**");
        System.out.println("1. Euro a Peso");
        System.out.println("2. Peso a Euro");

        int opcionEuro = scanner.nextInt();
        scanner.nextLine();

        switch (opcionEuro) {
            case 1:
                convertirEuroAPeso(scanner);
                break;
            case 2:
                convertirPesoAEuro(scanner);
                break;

            case 0:
                break;

            default:
                System.out.println("opcion no valida. Intete de nuevo");

        }

    }

    private static void convertirEuroAPeso(Scanner scanner) {
        System.out.print("Ingresa la cantidad de euros");
        double euro = scanner.nextDouble();
        scanner.nextLine();

        double pesos = euro / 0.00024;
        System.out.println(euro + "euros equivalen a :" + pesos + "euro");

    }

    private static void convertirPesoAEuro(Scanner scanner) {

        System.out.print("Ingresa la cantidad de pesos");
        double pesos = scanner.nextDouble();
        scanner.nextLine();

        double euro = pesos * 4.193;
        System.out.println(pesos + "pesos equivalen a" + euro + "euros");
    }

    public static void convertirAYen(Scanner scanner) {

        System.out.println("Bienvenido al Conversor de Moneda");
        System.out.println("Por favor, ingrese la cantidad de pesos colombianos:");

        // Leer la cantidad en pesos Colombianos COP
        double cantidadOrigen = scanner.nextDouble();

        // Convertir a yen japonés (tasa de cambio aproximada)
        double cantidadYen = convertirAYen(cantidadOrigen);

        // Mostrar el resultado
        System.out.println("La cantidad en yen japonés es: " + cantidadYen + " JPY");

        scanner.close();
    }

    // Método para convertir a yen japonés
    public static double convertirAYen(double cantidad) {
        // Tasa de cambio actual del peso colombiano a yen japonés
        double tasaDeCambio = 0.039; // 1 COP = 0.039 JPY (tasa aproximada)
        // Realizar la conversión
        double cantidadYen = cantidad / tasaDeCambio;
        return cantidadYen;
    }

    public static void convertirSoles(Scanner scanner) {

        // Tipo de cambio de COP a PEN
        double tipoCambio = 1.050;

        // Convertir pesos colombianos a soles
        System.out.print("Ingresa la cantidad de pesos colombianos a convertir a soles: ");
        double pesosColombianos = scanner.nextDouble();
        double Soles = convertirCOPaPEN(pesosColombianos, tipoCambio);
        System.out.println(pesosColombianos + " pesos colombianos equivale a " + Soles + " soles.");

        // Convertir soles a pesos colombianos
        System.out.print("Ingresa la cantidad de soles a convertir a pesos colombianos: ");
        double Soles2 = scanner.nextDouble();
        double pesosColombianos2 = convertirPENtoCOP(Soles2, tipoCambio);
        System.out.println(Soles2 + " soles equivale a " + pesosColombianos2 + " pesos colombianos.");

        scanner.close();
    }

    // Método para convertir pesos colombianos a soles
    public static double convertirCOPaPEN(double pesos, double tipoCambio) {
        return pesos * tipoCambio;
    }

    // Método para convertir soles a pesos colombianos
    public static double convertirPENtoCOP(double Soles, double tipoCambio) {
        return Soles / tipoCambio;
    }

    public static void convertirLibras(Scanner scanner) {

        // Tipo de cambio de COP a GBP
        double tipoCambio = 4890;

        // Convertir pesos colombianos a libras
        System.out.print("Ingresa la cantidad de pesos colombianos a convertir a libras: ");
        double pesosColombianos = scanner.nextDouble();
        double libras = convertirCOPaGBP(pesosColombianos, tipoCambio);
        System.out.println(pesosColombianos + " pesos colombianos equivale a " + libras + " libras.");

        // Convertir libras a pesos colombianos
        System.out.print("Ingresa la cantidad de libras a convertir a pesos colombianos: ");
        double libras2 = scanner.nextDouble();
        double pesosColombianos2 = convertirGBPtoCOP(libras2, tipoCambio);
        System.out.println(libras2 + " libras equivale a " + pesosColombianos2 + " pesos colombianos.");

        scanner.close();
    }

    // Método para convertir pesos colombianos a libras
    public static double convertirCOPaGBP(double pesos, double tipoCambio) {
        return pesos * tipoCambio;
    }

    // Método para convertir libras a pesos colombianos
    public static double convertirGBPtoCOP(double libras, double tipoCambio) {
        return libras / tipoCambio;

    }

}
