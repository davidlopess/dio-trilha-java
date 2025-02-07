package BeckEndJava.SintaxJava.ExercicioMetodos;

public class SmartTv {
    boolean tvLigada = false; 
    boolean desligarTv = true;
    int volumeTv = 1;
    int canalTv = 25; 

    //CRIANDO OS MÉTODOS QUE MANIPULAM A TV

    public void ligar(){
        tvLigada = true;
        
    }

    public void desligar(){
        tvLigada = false;
    } 

    public void Avolume(){
        volumeTv ++;
        System.out.println("Volume atual " + volumeTv);

    }

    public void Dvolume(){
        volumeTv --;
        System.out.println("Volume atual " + volumeTv);
    }

    public void Acanal(){
        canalTv ++;
        System.out.println("Canal atual " + canalTv);
    }

    public void Dcanal(){
        canalTv --;
        System.out.println("Canal atual " + canalTv);
    }

    public void Dtv(){
        desligarTv = true;
    }

    public void mCanal(int novoCanal){
        canalTv = novoCanal;


    }
}
