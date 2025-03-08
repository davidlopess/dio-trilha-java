package areaCliente;

//import ClinicaGeral.Recepcao;

public class Paciente {
   
 private long cpf;
 private String nome;

 public Paciente(){
    this.cpf=0;
    this.nome = "";
 }

 public long getCpf(){
    return cpf;
 }

 public void setCpf(long cpf){
    this.cpf = cpf;
 }

   public String getNome(){
     
      return nome;
   }

   public void setNome(String nome){
      if (nome != null && !nome.trim().isEmpty()) {
         this.nome = nome;
     } else {
         System.out.println("Erro: O nome do paciente não pode ser vazio ou nulo.");
     }
     
   }
 
 public void  exibirCpf(){
    System.out.println("- O meu cpf é: " + getCpf());
    
 } 
}
