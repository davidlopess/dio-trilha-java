import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcao funcao = new Funcao();

       System.out.println("Vamos Sair hj para algum lugar ? ");
       funcao.ligar = scanner.nextBoolean();
       
        funcao.ligarCarro();
        
        funcao.veloCar(0);
    }
    
}
