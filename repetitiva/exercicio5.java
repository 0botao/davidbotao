package repetitiva;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        // Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        // essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        int out  = 0, inp = 0;

		for (int i=0; i<x; i += 1) {

			x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				inp += 1;
			}
			else {
				out = out + 1;
			}
		}
        System.out.println(" a quantidade de numeros que estao dentro é de  " + inp);
        System.out.println(" a quantidade de numeros que estao dentro é de  " + out);
        sc.close();
    }
}
