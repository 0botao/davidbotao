package exercicios;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        // decimais.

        int numero, horas;
        double valor, salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário:");
        numero = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        horas = sc.nextInt();

        System.out.println("Digite o valor que recebe por hora:");
        valor = sc.nextDouble();

        salario = horas * valor;

        System.out.printf("Número do funcionário: %d%n", numero);
        System.out.printf("Salário do funcionário: %.2f%n", salario);

        sc.close(); // Fechando o Scanner para liberar os recursos associados
    }
}
