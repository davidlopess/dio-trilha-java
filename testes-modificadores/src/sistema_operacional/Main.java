package sistema_operacional;
public class Main {
    public static void main(String[] args) {
        
        Computador pc = new Computador();

        SmartPhone celular = new SmartPhone();

        System.out.println( "\nLigar o computador:");
        pc.ligar();
       
        System.out.println("\nLigar o smartphone:");
        celular.ligar();   

}
}
