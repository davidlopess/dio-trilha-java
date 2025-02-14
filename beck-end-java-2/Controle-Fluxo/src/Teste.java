public class Teste {
    public static void main(String[] args) {

          nome("David", 11);     

    }

    public static void nome(String n, int b){
        String nomes[] = {"Ana", "Lucas", "Pedro"};
      
        for(int i = 0; i < nomes.length; i++){
                   
           System.out.println("Ola " + nomes[i] + ", me chamo " + n + " = " + i);  
                 
        } 
        switch (nomes[2]) {
            case "Pedro":{
                System.out.println("Ola," + nomes[2] + " voê é o ultimo");
                break;
            }                                      
            default:
              System.out.println("Sejam bem vindos");
              break;}
            }  
}
