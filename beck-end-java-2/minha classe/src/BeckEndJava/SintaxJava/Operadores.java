package BeckEndJava.SintaxJava;

public class Operadores {
    public static void main(String[] args){

        //INCREMENTAÇÃO

        int numero = 5;
        numero = numero + 1;
        //numero++;

        System.out.println(numero--);
        System.out.println(numero); 

        //INVERTENDO O VALOR DE UMA VARIAVÉL DO TIPO BOOLEAN;

        boolean variavel = true;
        
        variavel = !variavel;
        System.out.println(variavel);

        // OPERADOSRES TERNARIOS ?:

        int a, b;
        a = 6;
        b = 5;
        String resultado = a ==b ? "verdadeiro" : "falso";

        /*if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
             */

            System.out.println(resultado);

    
    // OPERADORES RELACIONAIS;

    int num1 = 4, num2 = 3;
    boolean simNao = num1 == num2;

     System.out.println("Num1 é iguala num2 ? " +  simNao) ;

     simNao = num1 != num2;
     System.out.println("Num1 é diferente num2 ? " +  simNao) ;

     simNao = num1 < num2;
     System.out.println("Num1 é menor num2 ? " +  simNao) ;
    
     simNao = num1 > num2;
     System.out.println("Num1 é maior num2 ? " +  simNao) ;



     // OPERADORES LOGICOS
         
       boolean condicao1 = true;
        
       boolean condicao2 = true;

       // && -> E =  so vai ser verdadeiro se as duas condições forem igaus , 
       // || -> OU = só precisa que uma das condições seja verdadeira .

       if ( condicao1 && condicao2){
         System.out.println("Opa! Essas condições são verdadeiras");

       }else{
         System.out.println("Fim");
       }




        


       
    }
    
}
