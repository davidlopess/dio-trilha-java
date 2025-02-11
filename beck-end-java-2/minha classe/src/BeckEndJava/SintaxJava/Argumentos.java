package BeckEndJava.SintaxJava;
import java.util.Locale;
import java.util.Scanner;
public class Argumentos {
    public static void main(String[] args) {
        Scanner escrever = new Scanner(System.in).useLocale(Locale.US);

       
        
       
        System.out.println("Digite seu nome: ");
        String nome = escrever.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = escrever.next();

        System.out.println("Qual sua idade? ");
         int idade = escrever.nextInt();

         System.out.println("Qual sua altura? ");
          double altura = escrever.nextDouble();

        System.out.println("Olá me chamo " + nome + "" + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");

        
    }
}
