package EStruturaRepeticao;

public class While {
    public static void main(String[] args) {
        
        // Extrutura do controle de fluxo de While("Enquanto")
        /*
         * While(expressão booleana de validação){
         * 
         *       comando que será executado até que a 
         *       expressão de validação torne-se falsa.
         * 
         * }
         */

         double mesada = 50.0;

         while(mesada > 0){
             Double doce = valorAleatorio(4.0); 
             
             if(doce > mesada){
                System.out.println("O valor da sua mesa atual é de " + mesada + " R$, está  muito baixo para comprar mais doce desse valor");
                doce = mesada;
           }
               mesada = mesada - (+ doce);
                 System.out.println("O valor do doce é " + doce + " R$" + ", então vc ficou com " + mesada + " R$ de mesada");
                
             
             System.out.println("mesada : " + mesada);
             

            
            
         }


    }

    public static double valorAleatorio(double n){
        
        return n;

    }


    
}
