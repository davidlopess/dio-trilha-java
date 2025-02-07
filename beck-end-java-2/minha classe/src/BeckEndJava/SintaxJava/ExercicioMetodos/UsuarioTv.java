package BeckEndJava.SintaxJava.ExercicioMetodos;

public class UsuarioTv {

    public static void main (String[] args ) throws Exception{

// criando uma nova instância da classe SmatTv 
   SmartTv novaTv = new SmartTv();

   

   //CHAMANDO OS MÉTODOS
   novaTv.ligar();
     System.out.println("A tv está ligada? " + novaTv.tvLigada);

   novaTv.desligar();
     System.out.println("A tv está ligada? " + novaTv.tvLigada);

   novaTv.Avolume();
   novaTv.Avolume();
   novaTv.Avolume();

   novaTv.Dvolume();
   novaTv.Dvolume();
   novaTv.Dvolume();
    

   novaTv.Acanal();
   novaTv.Acanal();
   novaTv.Acanal();

   novaTv.Dcanal();
   novaTv.Dcanal();
   novaTv.Dcanal();

   novaTv.mCanal(13);
   System.out.println("canal atual da Tv? " + novaTv.canalTv);

   

     

   novaTv.Dtv();
     System.out.println("Desligar Tv? " + novaTv.desligarTv);

    
     System.out.println("desligando a Tv ... " ); 
     
    } 

}
