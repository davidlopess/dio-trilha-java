public class App {
    public static void main(String[] args) throws Exception {

        imprimirMensagem();

        saudacao("Olá, Ana");

        
        int re;
       re =  soma(2,1);
        System.out.println(re);


         ehPar(2);

        System.out.println(ehPar( 3));
        System.out.println(ehPar( 23));
        System.out.println(ehPar( 4));
        System.out.println(ehPar( 10));
       
    }

    public static void imprimirMensagem(){
        System.out.println("Olá, mundo!");
    }

    public static void saudacao(String msg){
        System.out.println(msg);
    }

    public static int soma(int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    public static boolean ehPar(int n1 ){
      
        return  n1 % 2 == 0;

    }


}
