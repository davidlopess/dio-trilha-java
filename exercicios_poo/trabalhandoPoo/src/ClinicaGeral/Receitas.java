package ClinicaGeral;

public enum Receitas {
    
  RECEITA_1("Dipirona 1 comprimido de 6 em 6 horas"),   
  RECEITA_2("Paracetamol 1 comprimido de 8 em 8 horas");
  

   private String receita;
   

   Receitas(String receita){ 
           
           this.receita = receita;
           
   } 

    public String getReceita(){
         return receita;
    }

}



