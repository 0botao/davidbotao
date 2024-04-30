package exercicios;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).  
        
        int a, b, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println(" digite o valor para A");
        a = sc.nextInt();

        System.out.println(" digite o valor para b");
        b = sc.nextInt();

        System.out.println(" digite o valor para c");
        c = sc.nextInt();

        System.out.println(" digite o valor para d");
        d = sc.nextInt();

        System.out.println(" O resultado é " + (a*b - c*d) );

        sc.close();

    }
    
}
