package repetitiva;
import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        for (int y = 1 ; y < x; y += 1 ){
            System.out.println(y);
        }
    }
    
}
