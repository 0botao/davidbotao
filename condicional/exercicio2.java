package condicional;

import java.util.Scanner;

public class exercicio2 {
    // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    public static void main(String[] args) {
        int x;


        Scanner sc = new Scanner(System.in); 

        System.out.println(" digite um numero inteiro para saber se é um número ímpar ou um numero par");

        x = sc.nextInt(); 

        if (x % 2 == 0) {
            System.out.println(" o número é par");
        } else{
            System.out.println(" o número é impar");
        }
    }

}
