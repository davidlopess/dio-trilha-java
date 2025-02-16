public class Teste {
    public static void main(String[] args) {
        int relogio = 0;

        //while(relogio < timer(3)){
      //      System.out.println("Ainda está de noite = " + relogio++);
               
                        
          // relogio = relogio;
       // if(relogio == timer(2))
       //     System.out.println("Bom dia! Já amanhecel. = " + relogio);
         
       // } 
       
       int rt = timer() ;
       
        do{
            
         System.out.println("Ainda está de noite..? " + rt ++ );                        
                         
        }
         while(rt  < 6 );
         System.out.println("Olá! Já amanheceu... ?  "  );
         System.out.println("Quase lá..." );
        
         if(rt == 6){
            System.out.println("Bom dia! Já amanhecel... ?  "  );
            System.out.println("Sim, está um lido dia la fora!.." );

         }else{
            System.out.println("Ainda não");
         }                
    }
    public static int timer(){
        
        //System.out.println("Bom dia! Já amanhecel... ?  "  );
        return 0;
    }
}
