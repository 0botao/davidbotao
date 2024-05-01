package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {
    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float a,  b, c;

        System.out.println(" digite o valor de A");
        a = sc.nextFloat();

        System.out.println(" digite o valor de B");
        b = sc.nextFloat();
        
        System.out.println(" digite o valor de C");
        c = sc.nextFloat();
        
        System.out.println("área do triângulo retângulo é  " + a * c);
        System.out.println(" área do círculo de raio " + (Math.pow(a, 2)) * 3.14159);
        System.out.println("área do trapézio é " + ((a+b)* c/2)) ;
        System.out.println(" área do quadrado é " + Math.pow(b,2));
        System.out.println(" a área do retangulo " + b * c + 1);








    }
    
}
