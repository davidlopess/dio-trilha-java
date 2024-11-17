public class SmatTv {

    boolean ligado  = false;
    int volume = 25;
    int canal = 1;

    

    public void ligar(){
        ligado = true;
    
    }
    public void desligar(){
        ligado = false;
    }
    //====================================

    public void almentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    //=======================================

    public void almentarCanal(){
        canal ++;
    }

    public void diminuirCanal(){
        canal --;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }


    


    
    
}




