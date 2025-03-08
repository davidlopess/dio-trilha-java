package ClinicaGeral;

import areaCliente.Paciente;

public class Clinica{
    public static void main(String[] args){
        System.out.println(" ");

        Paciente paciente = new Paciente();
        paciente.setCpf(62952674329l);
        paciente.setNome("João Vitor");

        Recepcao recepcao = new Recepcao(paciente);
        recepcao.setSenhaPaciente(343);
        recepcao.receberDadosPaciente(); 

    
    System.out.println("PACIENTE " + paciente.getNome() + " SENHA: " + recepcao.getSenhaPaciente());

        System.out.println("\nSUA RECEITA É: ");
    for(Receitas receita: Receitas.values()){
           System.out.println(receita.getReceita()+ "\n");

        }
        
    }      
}