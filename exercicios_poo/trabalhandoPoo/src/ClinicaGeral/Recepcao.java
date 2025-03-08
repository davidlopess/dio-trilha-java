package ClinicaGeral;

import areaCliente.Paciente;

public  class Recepcao{
     private Paciente paciente;
     private int senhaPaciente ;

      public Recepcao(Paciente paciente){
        this.paciente = paciente;
      }

      public int getSenhaPaciente(){
        return senhaPaciente;
      } 

      public void setSenhaPaciente(int senhaPaciente){
        this.senhaPaciente = senhaPaciente;
      }

      private void receberPaciente(){

        if (paciente.getNome() != null && !paciente.getNome().trim().isEmpty()) {
          System.out.println("\nSEJA BEM-VINDO À CLINICA CLIPS! QUAL É SEU NOME?");
          System.out.println("- " + paciente.getNome());
          System.out.println("OLÁ, " + paciente.getNome() + ", SEJA BEM-VINDO!");
      } else {
          System.out.println("Erro: Nome do paciente não informado.");
      }

      }

      public void receberDadosPaciente(){

         receberPaciente();
        if (paciente.getCpf() > 0) {
          System.out.println(paciente.getNome() + ",VOCÊ PODE ME INFORMAR SEU CPF?");
          paciente.exibirCpf();
        } else {
          System.out.println("Erro: CPF do paciente não informado.");
        }  
      }


    
}
