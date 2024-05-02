package repetitiva;
import java.util.Scanner;

public class exercicioDeFixacao {
    public static void main(String[] args) {
        
        // fazer  um programa que  lê ate o numero 0

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble() , soma = 0;

        while (x != 0) {
            System.out.println(" digite um numero ");
            soma += x;
            x = sc.nextDouble();
        }
        System.out.println(" a soma dos numeros digitados é de " + soma);
        sc.close();
        
    }
    
}
