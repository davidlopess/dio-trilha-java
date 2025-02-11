public class ExMetodos{
    public static void main(String[] args){
     // parametro de entrada
        msg("java", 5);
        
        // imprimindo o retorno 
         int r;
         r = soma2(2,2);
         System.out.println(r);

        //retorno da lista de parametros
         System.out.println(soma(1,23,2,32,44,43,33,22,423,2342));
        



         /*
          * Sobrecarga de um Método:
           Quando dois metodos utilisam a mesma variavel, coais com o tipo diferente.
           Ex: int soma,  double soma.
          */
    }
// metodos com parametros de entrada
    public static void msg(String m, int l){
        for(int i = 0; i < l; i++){
            System.out.println(m);
        }
        
    }

    //metodos com parametros de saida "Retorno"

    public static int soma2(int n1, int n2){
       
       
        int res = n1 + n2;
       
        return res ;
        
    }

    // metodo com lista de parametros

    public static int soma(int... num){
        int res = 0;
        for(int n : num){
            res += n;

        }
        return res;
    }


 }
