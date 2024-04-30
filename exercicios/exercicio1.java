
package exercicios;

import java.util.Scanner;

class exercicio1 {
    // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println(" digite um numero ");
        x = sc.nextInt();

        System.out.println(" digite outro numero ");
        y = sc.nextInt();

        System.out.println(" a soma do numero " + x + " mais o numero " + y + " é igual á " + (x + y));

        sc.close();
    }
}