package Estacionamento.gerencia;

public class Atendente {

    private String nome = "Lucas";
    private int idade = 25;

    public Atendente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }



    public void atenderCliente(){
        System.out.println("CLIENTE SENDO ATENDIDO");
        System.out.println("PAGAMENTO EFETUADO");
        
    }

   
}
