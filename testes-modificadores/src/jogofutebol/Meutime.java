package jogofutebol;
public class Meutime {
    
public static void main(String[] args) {
   Camisa10 jogador1 = new Camisa10("PELÉ", 10);
   jogador1.setQuantidadeGols(1000); 
   jogador1.chutarGol();

   Camisa09 jogador2 = new Camisa09("ZICO", 9);
   jogador2.setQuantidadePasse(500);
   jogador2.chutarGol();

}
}
