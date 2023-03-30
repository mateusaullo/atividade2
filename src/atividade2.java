import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int numero; 

        System.out.print("Informe o numero desejado: ");
         numero = teclado.nextInt();
        System.out.print("O numero informado foi: "+numero);

        teclado.close();
    }
}
