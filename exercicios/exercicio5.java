package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {
    // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod1, cod2 , quant1, quant2 ;

        double preco1, preco2, valor1 , valor2, total;

        System.out.println(" digiteo codigo da primeira peça");
        cod1 = sc.nextInt();

        System.out.println(" digiteo a quantidade da primeira peça");
        quant1 = sc.nextInt();

        System.out.println(" digite o preço da primeira peça");
        preco1 = sc.nextDouble();

        valor1 = preco1 * quant1;

        System.out.println(" digite o codigo da segunda peça");
        cod2 = sc.nextInt();

        System.out.println(" digite a quantidade da segunda peça");
        quant2 = sc.nextInt();

        System.out.println(" digite o preço da segunda peça");
        preco2 = sc.nextDouble();

        valor2 = preco2 * quant2;
        total = valor1 + valor2;

        System.out.printf(" O valor a ser pago na primeira peça R$ %.2f %n", total);

        sc.close();


        
    }
}
