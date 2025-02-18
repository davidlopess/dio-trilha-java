package controlecandidatos;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

       
        selecaoCandidatos();
        
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "ANA", "LUCAS", "DAVID", "RAKEL", "RITA", "JHON", "DIEGO", "SAMUEL", "MAMÃE"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase =2000.0;
       // double salarioPretendido = valorPretendido(); 

        while(candidatoSelecionado < 5){
            String candidato = candidatos[candidatoAtual];
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + valorPretendido());
            if(salarioBase >= valorPretendido()){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatoSelecionado++;
            }
                  candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1300, 2200);
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");

        }else if(salarioBase == salarioPretendido){
            System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
    
}
