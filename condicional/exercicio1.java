package condicional;
import java.util.Scanner;


public class exercicio1 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println(" digite um número inteiro ");

        x = sc.nextInt();

        if (x >= 0) {
            System.out.println(" o número " + x + " é positivo");
        } else {
            System.out.println(" o número " + x + " é negativo");
        } 
    }
    
}
