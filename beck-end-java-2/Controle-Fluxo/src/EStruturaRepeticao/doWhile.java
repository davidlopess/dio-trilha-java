package EStruturaRepeticao;

public class doWhile {
    public static void main(String[] args) {
        
        // Estrutura do controle de fluxo "do While = faça enquanto"

        /*
         * do{
         *    comado que será executado até que a 
         *   expressão de validação torne-se falsa
         * 
         * }
         * while(expressão booleana de validação);
         *
         */
        
        
         boolean res = tocando(true);
            System.out.println("Discando...");

         do{
            System.out.println("Telefone tocando");
           

            
         }
         
         
         while(res);
          
         
         
            System.out.println("Alô!!");

         }
          

    public static boolean tocando(boolean i){
        boolean atendeu = i;
        System.out.println("Atendeu? " + i);
        
       
        return !atendeu;
         
    }
   
    
}
