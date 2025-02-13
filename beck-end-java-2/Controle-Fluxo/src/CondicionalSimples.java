public class CondicionalSimples{
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 10.0;
        
        // condicional simples
        if(saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }

        // Condicional Composta

         int nota = 4;
       
         /*if(nota >= 7){
             System.out.println("vc foi aprovado");
        }else{
                System.out.println("Reprovado");
          
            

        //Condicional Encadeada

        if(nota >= 7){
            System.out.println("vc foi aprovado");
       }else if( nota == nota){
               System.out.println("Recuperação");
       }else{
        System.out.println("Reprovado");
       } 
        */ 
        //CONDIÇÃO TERNARIA

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);



    }
}