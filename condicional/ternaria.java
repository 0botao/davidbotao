package condicional;

public class ternaria {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05 ;

        System.out.println("o valor com desconto é " + (preco - desconto));
    }
    
}
