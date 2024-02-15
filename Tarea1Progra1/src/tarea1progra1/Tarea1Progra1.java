package tarea1progra1;

import java.util.Scanner;

public class Tarea1Progra1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("----Tarea1----");
        System.out.println("1)Numeros pares e impares");
        System.out.println("2)Triangulos y mas triangulos");
        System.out.println("3)Anita lava la tina");
        System.out.println("4)Codigos secretos");
        System.out.println("5)Salir");
        System.out.println("Ingrese la opcion que desee: ");
        int op = entrada.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("Numeros pares e impares");

                System.out.print("Ingrese un número: ");
                int numero = entrada.nextInt();

                int numPares = 0;
                int numImpares = 0;

                System.out.println("Números pares e impares entre 0 y " + numero + ":");
                for (int i = 0; i <= numero; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Par: " + i);
                        numPares++;
                    } else {
                        System.out.println("Impar: " + i);
                        numImpares++;
                    }
                }

                
                System.out.println("Cantidad de números pares: " + numPares);
                System.out.println("Cantidad de números impares: " + numImpares);
            }
            case 2 ->{
                System.out.println("Triangulos y mas triangulos");
                System.out.println("Que tipo de triangulo deseas dibujar?");
                System.out.println("1)Triangulo Rectangulo");
                System.out.println("2)Triangulo Equilatero ");
                int opcion = entrada.nextInt();
                
                switch (opcion){
                    case 1 ->{
                        System.out.println("Introduce la altura del triangulo rectangulo: ");
                        int alturaRectangulo = entrada.nextInt();
                        int altura = 0;
                        for (int i = 1; i <= altura ; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.println("* ");
                                
                            }
                            System.out.println();
                            
                        }
                    }
                    case 2 ->{
                        System.out.println("Introduce la altura del triangulo equilatero: ");
                        int alturaEquilatero = entrada.nextInt();
                        int altura2 = 0;
                        for (int i = 1; i <= altura2; i++) {
                            for (int j = 1; j <= altura2 - i; j++) {
                                System.out.println();
                                
                            }
                            for (int k = 1; k <= 2 * i - 1; k++) {
                                System.out.println("*");
                                
                            }
                            System.out.println();
                            
                        }
                        
                    }
                }
                
                
            }
            case 3 ->{
                System.out.println("Anita lava la tina");
                
            }
            case 4 ->{
                System.out.println("Codigo secretos");
            }
            default  ->{
                System.out.println("Saliste de el programa");
            }
        }
    }
}

    

