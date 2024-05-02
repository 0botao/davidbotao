package condicional;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, resto;

        System.out.println(" Digite um numero ? ");
        x = sc.nextInt();
        System.out.println(" Digite outro numero  numero ? ");
        y = sc.nextInt();

        if (y > x) {
            if (x % y ==0) {
                System.out.println(" São multiplos");                
            } else {
                System.out.println(" não são multiplos"); 
            }
        } else if (x % y == 0) {
                System.out.println(" São multiplos"); 
        } else {
            System.out.println(" não são multiplos");
        }
            
    }
}
    

