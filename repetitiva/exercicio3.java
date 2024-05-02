package repetitiva;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
        " 1.Álcool \n" +
        " 2.Gasolina \n" +
        " 3.Diesel\n" + 
        " 4.Fim");

        int x, Alc = 0, Gas = 0, Die = 0;

        do {
            x = sc.nextInt();
            switch (x) {
                case 1:
                    Alc++;
                    break;
                case 2:
                    Gas++;
                    break;
                case 3:
                    Die++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;
                default:
                    System.out.println("Código inválido. Digite novamente.");
                    break;
            }
        } while (x != 4);

        System.out.println("Clientes que abasteceram com Álcool: " + Alc);
        System.out.println("Clientes que abasteceram com Gasolina: " + Gas);
        System.out.println("Clientes que abasteceram com Diesel: " + Die);
        System.out.println("Programa encerrado.");
        
        sc.close();
    }
}
