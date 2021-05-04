package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList figura = new ArrayList();
        int op;

        do { // menu loop
            System.out.println("1. Crear figura");
            System.out.println("2. Listar figuras");
            System.out.println("3. Borrar figuras");
            System.out.println("4. Salir");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Que figura geometrica desea crear?");
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Rectángulo");
                    System.out.println("3. Elipse");

                    int opcion = sc.nextInt();
                    menuFiguras(opcion, figura);

                    System.out.println("Volviendo al menu");
                    break;

                case 2:
                    listar(figura);
                    break;

                case 3:
                    borrarFiguras(figura);

                default:
                    System.out.println("Ingresó una opción no válida. Reintente...");

            }
        }while(op!=4);
    }

    public static void listar(ArrayList figura) {
            System.out.println(Arrays.toString(figura.toArray()) .replaceAll("[\\[\\]]", ""));
    }

    public static void menuFiguras(int opcion, ArrayList figura){
        switch (opcion) {
            case 1: // cuadrado
                System.out.println("Lado: ");
                double lado = sc.nextDouble();
                Cuadrado cuadrado = new Cuadrado(lado);
                figura.add(cuadrado.area());
                figura.add(cuadrado.perimetro());
                break;
            case 2: // rectangulo
                System.out.println("Base: ");
                double base = sc.nextDouble();
                System.out.println("Altura: ");
                double altura = sc.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                figura.add(rectangulo.area());
                figura.add(rectangulo.perimetro());
                break;
            case 3: //elipse
                System.out.println("Radio mayor: ");
                double radioMayor = sc.nextDouble();
                System.out.println("Radio menor: ");
                double radioMenor = sc.nextDouble();
                Elipse elipse = new Elipse(radioMayor, radioMenor);
                figura.add(elipse.area());
                break;
        }
    }

    public static void borrarFiguras(ArrayList figura){
        System.out.println("Figuras borradas con éxito.");
        figura.clear();
        System.gc();
    }
}
