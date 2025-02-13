public class App {
    public static void main(String[] args) throws Exception {
       
        //SWITCH CASE
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("Pequena");
                break;
            }
            case "M":{
                System.out.println("Media");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }

        
            default:
            System.out.println("Indefinido");
                break;
        }


        // exemplo 2

        String planoInternet = "B";

        switch (planoInternet) {
            case "T":{
                System.out.println("5Gb Yotub");
            }
            case "M":{
                System.out.println("Waths e Instagram grátis");

            }
            case "B":{
                System.out.println("100 minunos de ligação");

                break;
            }
                
                
        
            default:
            System.out.println("Obrigado! Voute sempre");
                break;
        }

     
    }
}
