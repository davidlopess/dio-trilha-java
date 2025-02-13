import java.util.Scanner;

public class Personagem {
    public static void main(String[] args)throws Exception {
        habilidade novHabilidade = new habilidade();
        Scanner scanner = new Scanner(System.in);
       
       

          int so =  somar(33,5);
          System.out.println(so + "R$"); 

            novHabilidade.nivel = 500;
            novHabilidade.nome =  scanner.nextLine();
            novHabilidade.forca = 202;


       novHabilidade.statoForca();
      
    }
     public static int somar(int n1, int n2){
        int res;
        res = n1 + n2;
      
        return res;
        
     }
}
