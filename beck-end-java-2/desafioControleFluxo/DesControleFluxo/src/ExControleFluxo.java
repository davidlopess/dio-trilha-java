import java.util.Scanner;
public class ExControleFluxo{
    public static void main(String[] args) throws ParametrosInvalidosException{
         try (Scanner terminal = new Scanner(System.in)) {
            int num1;
             int num2;
             System.out.println("   ");
             System.out.println(" Digite o primeiro parâmetro: ");
               num1 = terminal.nextInt();
             
             System.out.println(" Agora digite o segundo parâmetro:"); 
               num2 = terminal.nextInt();

               for(int indice = num1; indice >=num1 && indice <= num2; indice++){
                System.out.println("IMPRIMINDO O NÚMERO: " + indice);            
            }  

             

               try {
                   int contagem = num2 - num1;
              
                   contar(num1, num2);
                   
                   System.out.println("O total de interações  é igual a " + (contagem - 1));

               } catch (ParametrosInvalidosException e) {
                  

                System.out.println("O primeiro parâmetro não pode ser maior que o segundo");                     
               }
              
        }              
                          
    }

    static void contar(int num1, int num2)throws ParametrosInvalidosException{
        if (num1 > num2){            
            throw new ParametrosInvalidosException();
        }
        System.out.println("Os valares das interações imprimidas são: ");

        
           

        int contagem = num2 - num1;
        for(int i = 1; i < contagem; i++ ){
            num1 = num1 +1;

           System.out.println("Indice de valor " + num1);
         
        }                                  
    }
}
