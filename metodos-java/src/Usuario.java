

public class Usuario {

    public static void main(String [] args) throws Exception{

      int n1 = 3;
      int n2 = 4;

      double res = res(n1, n2);
      System.out.println(res);



       SmatTv smatTv = new SmatTv(); 
       System.out.println("Atv está ligada: " + smatTv.ligado);
       System.out.println("Volume da TV: " + smatTv.volume);
       System.out.println("Canal Atual: " + smatTv.canal);
   //========================================================
       smatTv.ligar();
       System.out.println(smatTv.ligado);
   
       smatTv.desligar();
       System.out.println(smatTv.ligado);
   //==========================================================


       smatTv.almentarVolume();
         System.out.println("Volume almentado: " + smatTv.volume);

       smatTv.diminuirVolume();
         System.out.println("Volume diminuido: " + smatTv.volume);
    //===========================================================

       smatTv.almentarCanal();
         System.out.println("Trocar de canal: " + smatTv.canal );

       smatTv.diminuirCanal();
         System.out.println("Trocar de canal: " + smatTv.canal );


      smatTv.mudarCanal(13);
         System.out.println("Definir canal: " + smatTv.canal);


         //======================
       

    }

    public static double res(int n1, int n2){
      return n1 +n2;
    }

  


    


    
 

}
