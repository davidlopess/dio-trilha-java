import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args){

        try {
            testarMetodo( );
        } catch (InputMismatchException e) {
           
            System.out.println("O primeiro valor não pode ser maior que o segundo");
        }
          }                                                                             
    static void testarMetodo() throws InputMismatchException{
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
      int n =scanner.nextInt();
      int n1 = scanner.nextInt(); 
      if (n > n1){
        
       throw new InputMismatchException();

      }else{
         for(int i = 0; i < n1; i++){
            n = i;
      System.out.println(n++);    
      }
    }
 }
}
   

