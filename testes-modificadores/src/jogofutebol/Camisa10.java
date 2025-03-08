package jogofutebol;

public class Camisa10 extends Jogador {
   
   private int quantidadeGols;
   public Camisa10(String nome, int numeroCamisa) {
       super(nome, numeroCamisa);
    }

    public int getQuantidadeGols() {
        return quantidadeGols;
    }

    public void setQuantidadeGols(int gols) {
        this.quantidadeGols = gols;
    }

    @Override
     public void chutarGol(){
       
        for (int i = 1; i < 5; i++){
             quantidadeGols ++;
              System.out.println("\nO JOGADOR " + getNome() + " DE CAMISA " + getNumeroCamisa() + " FEZ MAIS UM GOL NA CARREIRA - agora " + i + " gol na partida");
              
              if (i == 3){
                  System.out.println("O JOGADOR " + getNome() + " DE CAMISA " + getNumeroCamisa() + " FEZ UM HAT-TRICK");
              }
        }
        System.out.println("AGORA ELE TEM " + getQuantidadeGols() + " GOLS  NA CARREIRA");
    }
}
   
