package condicional;

import java.util.Scanner;

public class switchcase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x;

            System.out.println(" digite 1 para bom dia , 2 para boa tarde e 3 para boa noite");

            x = sc.nextInt();

            switch (x) {
                case 1 :
                    System.out.println("bomdia");
                    break;
                case 2:
                    System.out.println("boa tarde ");
                    break;
                case 3:
                    System.out.println("boa noite ");
                    break;

                default:
                    System.out.println("volte mais tarde ");
                    break;
        }
    }
}


