package controlecandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "ANA", "LUCAS", "DAVID", "RAKEL"};
        for(String candidato: candidatos){
            
            entrarContato(candidato);
            
        }

        

      // imprimirCandidato();
     //  selecaoCandidatos();
        
        
    }

    static void entrarContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando ){
                tentativasRealizadas++;
            }else{
                System.out.println(" CONTATO REALIZADO COM SUCESSO");
            
            }

        }while(continuarTentando && tentativasRealizadas < 3);
           if(atendeu){
            System.out.println(" CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA ");
           }else{
            System.out.println();
            System.out.println(" NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");

           }

        
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirCandidato(){
        String [] candidatos = {" FELIPE", "ANA", "LUCAS", "DAVID", "RAKEL"};
        System.out.println(" Imprimindo a lista de candidatos informando o indice");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println(" O candidato de numero " + indice + " é o " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "ANA", "LUCAS", "DAVID", "RAKEL", "RITA", "JHON", "DIEGO", "SAMUEL", "MAMÃE"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase =2000.0;
       // double salarioPretendido = valorPretendido(); 

        while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            System.out.println(" O candidato " + candidato + " Solicitou este valor de salário " + valorPretendido());
            if(salarioBase >= valorPretendido()){
                System.out.println(" O candidato " + candidato + " foi selecionado para a vaga");
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
            System.out.println(" LIGAR PARA CANDIDATO");

        }else if(salarioBase == salarioPretendido){
            System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }else{
            System.out.println("A GUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
    
}
