import Estacionamento.cliente.Cliente;
import Estacionamento.gerencia.Atendente;

public class ControleEstacionamento {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("David", 23);
         Cliente cliente = new Cliente();
       
             
       
        System.out.println(" ");

        System.out.println("ESTACIONAMENTO DE CARROS");
        //cliente.estacionarCarro();
        cliente.efetuarPagamento();

       
        System.out.println("ATENDENTE: " + atendente.getNome()+ " IDADE: " + atendente.getIdade());
        atendente.atenderCliente();
        
    }
}
