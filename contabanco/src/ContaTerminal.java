import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){

      
          //double valorTotal  = saldo + deposito;



        //System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" +  numeroAgencia + ", e seu saldo é de R$ " + valorTotal +", e já está disponível para saque.");

        Scanner banco = new Scanner(System.in);

        String agencia = " ";
        String nomeCliente = " ";
        int numeroAgencia;
        double saldo = 389.00;
        double deposito ;
    
        



        System.out.println("Digite seu nome Completo: ");
         nomeCliente = banco.nextLine();

        System.out.println("Por favor digite sua Agência: ");
         agencia = banco.nextLine();

        System.out.println("Digite o numero da conta: ");
          numeroAgencia = banco.nextInt();

        System.out.println("Qunato deseja depositar? ");
          deposito  = banco.nextDouble();


          System.out.println("Ola " + nomeCliente +  ", obrigado por criar uma conta em nosso Banco, sua agência é "   + agencia + ", conta " + numeroAgencia + " e seu saldo ja esta disponivel para saque."  );
      


        
    }
}
