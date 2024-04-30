import java.util.Scanner;

public class formulaDeBaskara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double a, b, c , formula1 , x1, x2;

        System.out.println(" Digite o valor de A");
        a = sc.nextDouble();

        System.out.println(" Digite o valor de A");
        b = sc.nextDouble();

        System.out.println(" Digite o valor de A");
        c = sc.nextDouble();

        formula1 = Math.pow(b, 2) - 4 * a * c;

        if (formula1 < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else{
            x1 = (- b + (Math.sqrt(formula1))) / (2.0 * a);
            x2 = (- b + (Math.sqrt(formula1))) / (2.0 * b);
            System.out.println("o x1 é " + x1);
            System.out.println(" o x2 é " + x2);
        }
        sc.close(); 
    }
    
}
