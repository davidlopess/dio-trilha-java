import java.util.Scanner;

public class Personagem {
    public static void main(String[] args)throws Exception {
        habilidade novHabilidade = new habilidade();
        Scanner scanner = new Scanner(System.in);


            novHabilidade.nivel = 500;
            novHabilidade.nome =  scanner.nextLine();
            novHabilidade.forca = 202;

       novHabilidade.statoForca();
      
    }
}
