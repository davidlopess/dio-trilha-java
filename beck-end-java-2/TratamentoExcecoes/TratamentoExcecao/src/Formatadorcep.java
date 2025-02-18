

public class Formatadorcep {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //criando exeção personalisada
       // Number valor = Double.valueOf("a1.23");
        //System.out.println(valor);

        try {
            String Cepf = formatarCep("5454256");
            System.out.println(Cepf);

        } catch (ExdeExcaoException e) {
           System.out.println("O cep esta invalido");
        }
         
    
    }

     static String formatarCep(String cep)throws ExdeExcaoException{
        if(cep.length() != 8)
             throw new ExdeExcaoException();
        
       
        return cep;

    }
    
}
