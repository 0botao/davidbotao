package funçoes;
import java.util.Scanner;
import poo.triangulo;

public class aula1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        imprimirResultado(higher);

        sc.close();
    }  

    public static int max (int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > a && b > c) {
            aux = b;
        } else {
            aux = c;
        } 
        return aux;
    }
    public static void imprimirResultado(int resultado) {
        System.out.println("O maior número é: " + resultado);
    }
}   
