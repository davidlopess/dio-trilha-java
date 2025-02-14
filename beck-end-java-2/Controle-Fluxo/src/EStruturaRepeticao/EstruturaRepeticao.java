package EStruturaRepeticao;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        /*
         * Tipos de laços  de repetição
         * 
         * FOR  (Para)
         * WHILE (enquanto)
         * DO WHILE (faça enquano)
         * 
         * Estrutura do controle de fluxo For:
         * 
         * for(bloco de inicialização; expressão booleana de validação; bloco de atualização){
         * 
         *             comoando que será executado até que a expressão de validação torni-se falsa.
         * }
         */

         for(int i = 0; i <= 20; i ++ ){
            System.out.println("Contando carneiros " + i);

         }

         // For em Arrays
         /*
          * Montando um array

          String alunos[] = {" Rita ", " Joan  ", "David ", " Jhon "}
          */

         String alunos[] = {"Ana", "Lucas", "João", "Pedro"};

         for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no indice i = " + alunos[i]);
         }

         //For Each -> O uso de for / each está fortimente relacionado com um cenário onde contenha um arra ou coleção,
         //e assim, a interação é baseada aos elementos da coleção.
         
         //Exemplo for/each:

         for(String i : alunos){
            System.out.println("Nome do aluno é: " + i);

         }


         //Break = para o fluxo assim que recebe o comando break
         // continue = não para o fluxo,apenas muda o fluxo no momento em que o "continue" foi aplicado, e continua o fluxo
         
         for(int n = 1; n <= 5; n++){
            if(n == 6){

                continue;      
               
            
            }
                
              System.out.println(n);

              
         }


    }
}
