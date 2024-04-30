public class funcoes {
    public static void main(String[] args) {
        
        // funções matematicas 
        double x , y, z, A, B, C;

        x = 3;
        y = 4;
        z = -5;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        
        System.out.println(" A raiz quadrada de " + x + "=" + A);
        System.out.println(" A raiz quadradda de " + y +  "= " + B);
        System.out.println(" A raiz quadrada de 25" + C );

        A = Math.pow(x,y);
        B = Math.pow(y, 2);
        C = Math.pow(2, 5);

        System.out.println(x + " elevado a " + y +  " é igual" + A);
        System.out.println(y + " elevado a  2 é igual a " + B);
        System.out.println("2 elevado a 5 é igual " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println(" O valor absuloto é de " + y + " = " + A );
        System.out.println(" O valor absuloto é de " + z + " == " + B );
    }
    

}
