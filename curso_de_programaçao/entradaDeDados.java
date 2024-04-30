import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String x;
        int y ;
        double z ;
        char a ;

        // para digittar um texto 
        x = sc.next() ;
        
        System.out.println(" Voce digitou " + x);

        // quando eu quero digitar um numero inteiro 

        y = sc.nextInt(); 

        System.out.println(" Voce digitou o número " + y);

        // quando eu quero digitar um numeor com ponto flutuante , lembre -se do Locale.setdefault
        

        z = sc.nextDouble();

        System.out.printf("Você digitou o número  %.2f %n" , z);

        // quando voce quer imprimir um caracacter 
        a = sc.next().charAt(0);
        
        System.out.println(a);
        
        sc.close();
    }
}
