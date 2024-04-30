import java.util.Locale;

public class Main {
    public static void main(String[] args) { 
        int idade = 25;
        double y = 10.9393;

        // pra escrever na tela de um texto qualquer com quebra de linha no final
        System.out.println("Olá, mundo!");

        // pra excrever sem quebra de linha no final
        System.out.println(idade);

        // pra escrever o conteudo com de uma variavel com ponto flutuante

        System.out.println(y);

        // para delimitar o numeros de casa de decimais 
        System.out.printf("%.2f%n", y);

        // para o uso do ponto em vez da virgula
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", y);

        // para contatenar varios elementos na mesma escrita

        System.out.println("o meu nome é Maria" + idade + " e tenho " + y + " de bitcoin");

        // para concatenar usando o Printf
        System.out.printf("o que eu tenho em bitcoin é %.2f reais %n", y);

        // para concatenar elementos e um mesmo codigo 
        // %f = ponto flutuante
        // %d = inteiro
        // %s = txto
        // %n = quebra de linha 

        String nome = " maria ";
        int idad = 31;
        double renda = 1200;

        System.out.printf(" %s tem %d , e possui uma renda de %.2f%n" , nome, idad, renda);





    }
}
