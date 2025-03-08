package jogofutebol;

public class Camisa09 extends Jogador {
   
    private int quantidadePasse;

   
   public Camisa09(String nome, int numeroCamisa) {
       super(nome, numeroCamisa);
    }

    public int getQuantidadePasse() {
        return quantidadePasse;
    }   

    public void setQuantidadePasse(int passe) {
        this.quantidadePasse = passe;
    }
    
    @Override
    public void chutarGol(){
        System.out.println("\nO JOGADOR " + getNome() + " DE CAMISA " + getNumeroCamisa() + " FEZ UMA OTIMA ASSISTENCIA");
        System.out.println("AGORA ELE É O JOGADOR COM MAIS ASSISTÊNCIAS DO CAMPEONATO, TOTALIZANDO " + getQuantidadePasse() + " PASSES");
    }
}
