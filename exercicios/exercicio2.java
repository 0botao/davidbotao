package exercicios;
import java.util.Locale;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        double x, raio ;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println(" digite o  raio de um círculo ");
        x = sc.nextDouble();

        raio = Math.pow(x, 2) * 3.14159;

        System.out.printf(" Área do circulo é de %.4f%n" , raio);

        sc.close();

    }
    
}
