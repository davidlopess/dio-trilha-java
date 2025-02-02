package BeckEndJava.SintaxJava;

public class Metodos {
    public static void main(String[] args){
         //==CRIANDO A VARIAVEL
         String primeiroNome = "David";
         String segundoNome = "Lopes";
 
         // CHAMANDO O METODO
         
         String chamandoMetodo = nomeCompleto( primeiroNome,  segundoNome);
 
         System.out.println(chamandoMetodo);
        
     }
 
     //criando metodo
 
     public static String nomeCompleto(String primeiroNome, String segundoNome){
         return primeiroNome + " " +  segundoNome;
     }
    }

