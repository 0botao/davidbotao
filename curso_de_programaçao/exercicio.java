import java.util.Locale;

public class exercicio {
    public static void main(String[] args) {
        String product1 = "computador ";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5200;
        char gender = 'f';
        
        double prince1 = 2100.0;
        double prince2 = 650.0;
        double measure = 53.234567;

        System.out.println("produtos:");
        System.out.printf(" %s which price is R$ %.2f %n", product1, prince1);
        System.out.printf(" %s which price is R$ %.2f%n", product2, prince2); 
        
        System.out.printf(" %d years old, code %d and  gender : %s ", age, code , gender); 

        System.out.printf("Measue with eight decimal places ;  %f %n", measure);
        System.out.printf("Measue with eight decimal places ;  %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Measue with eight decimal places ;  %.2f %n", measure); 

        System.out.printf("Measue with eight decimal places ;  %.2f %n", measure); 

        System.out.printf(" %d years old, code %d and  gender : %s ", age, code , gender); 


    }
}

