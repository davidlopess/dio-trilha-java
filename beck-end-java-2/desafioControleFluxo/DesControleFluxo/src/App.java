import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double depositar;
        double sacar;
        boolean continuar = true;
        

        System.out.println(" ");
       
        while (continuar) {
            System.out.println("Escolha uma das opções abaixo");

        System.out.println(" 1 Depositar");
        System.out.println(" 2 Sacar");
        System.out.println(" 3 Consultar saldo ");
        System.out.println(" 0 encerrar operação");

             int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Quanto deseja depositar? " );
                depositar = scanner.nextDouble();
                if (depositar > 0) {
                    saldo += depositar; //saldo = saldo +depositar;
                    System.out.println("Depósito realizado com sucesso! Seu saldo atual é de " + saldo + " R$");
                } else {
                    System.out.println("Valor inválido para depósito.");
                }
                                                                
                    break;
                case 2:
                System.out.println("Digite o valor a ser retirado: " );
                sacar = scanner.nextDouble();
                  if(sacar > 0 && saldo >= sacar){
                    saldo -= sacar;
                    System.out.println("Operação bem sucedida! Seu saldo atual agora é de " + saldo + " R$");
                  }else if(sacar <= 0){
                    System.out.println("Operação inválida");

                  }else{
                    System.out.println("Saldo INSUFICIENTE");

                  }                
                    break;
                case 3:
                    System.out.println("Saldo atual " + saldo);
                    break;
                case 0:
                    System.out.println("Operação encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}




