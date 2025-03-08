package jogofutebol;

 abstract class Jogador {
    private String nome;
    private int numeroCamisa;

     Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;

    }

     String getNome() {
        return nome;
    }

     void setNome(String nome) {
        this.nome = nome;
    }

     int getNumeroCamisa() {
        return numeroCamisa;
    }

     void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

     abstract void chutarGol();
}
