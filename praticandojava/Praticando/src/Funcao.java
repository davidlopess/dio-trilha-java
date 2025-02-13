public class Funcao {

    int velocidade;
    int km = 22;
    boolean ligar = false;
    
    

    public void ligarCarro(){
        
       

        if( ligar == false ){
           

            System.out.println("Ok então, vou pra cama dormir...");
        }else{
            System.out.println("Oba! Então vou ligar o  Carro...");
        }
        
    }

    public void veloCar(int v1){
       
        int vel;
        vel = v1;
        if( ligar == true){
            System.out.println("Saindo...");
             for(int i = 0; i < 10; i++)

             
        System.out.println((vel += 5) + "  Km/h");
        }else{
            System.out.println("Fui...");
        }
        
       

    }
    
}
