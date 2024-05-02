package escopoEinicializaçao;

public class aula1 { 
    public static void main(String[] args) {
        double price = 400;

        double discount = 0;
        if (price < 200) {
            discount = price * 0.1;
        } 
        System.out.println(discount);
    }
}
