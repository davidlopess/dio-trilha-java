package Estacionamento.cliente;

import Estacionamento.gerencia.Atendente;

public class Cliente {
    App app = new App();
    Atendente   atendente = new Atendente("David", 23);
    private void estacionarCarro(){
        System.out.println("CARRO ESTACIONDO");

        System.out.println(" Meu carro está seguro?");
        app.vigiarCarros();
         

    }

    private void pagarNaEntrada(){
        atendente.atenderCliente();
        System.out.println("VOCÊ PODE CONFIRMAR O PAGAMENTO NA ENTRADA");
        estacionarCarro();
    }

    public void efetuarPagamento(){
        pagarNaEntrada();
    }
}
