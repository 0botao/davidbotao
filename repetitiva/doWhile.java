package repetitiva;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        char resp ;

        do{
            System.out.println("Digite S para continuar e N para parar"); 
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}
