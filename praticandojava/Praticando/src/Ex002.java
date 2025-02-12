public class Ex002 {
    public static void main(String[] args){

        imparPar(1);
        maiorNumero(6,7,5);
        fatorial(16);
       

    }

    //ImparPar

    public static String imparPar(int num){
    
       if (num % 2 == 0){
        System.out.println("par");
        return "par";
       }else{ 
        System.out.println("impar");
        return "impar";
         }
    }

    public static int maiorNumero(int a, int b, int c){

        if (a <= b && b < c){
            System.out.println("C");
            return c;
            
        }else if(a < b && b > c){
            System.out.println("B");
            return b;
        }else{
            System.out.println("A");
              return a;
        }   
    }

    public static int fatorial(int n){
        int reslt = n;
        System.out.println("O fatorial de " + n + " é:" + reslt );
       
        if( n == 0){
            return 0;
            
            
        }else {
            return n * fatorial(n - 1);
        }   
       
       
    }    
}


