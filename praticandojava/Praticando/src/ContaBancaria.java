
import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    String nomeCliente;
    String agencia;
    int numeroConta;
    double saldo = 2550;


    System.out.println("Por favor digite seu nome:");
    nomeCliente = scanner.nextLine();

    System.out.println("Agora digite o numero de sua agência");
    agencia = scanner.nextLine();

    System.out.println("Numero da conta");
    numeroConta = scanner.nextInt();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + "R$ já está disponível para saque.");

        
    }
    
}
