import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");

        //try/catch

        int idade;
        String nome;

        try {
            System.out.println("Digite seu nome: ");
             nome = scanner.nextLine();
             System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

            System.out.println("Seu nome é " + nome + " e vc tem " + idade + " anos de idade");

                    } catch (InputMismatchException  e ) {
                        System.out.print("Os valores  à sima precisam dos seus valores correspondete");
            // TODO: handle exception
        }
      
    }
}
