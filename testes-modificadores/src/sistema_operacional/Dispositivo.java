package sistema_operacional;

public abstract class Dispositivo {

     abstract void iniciar();
    
    public final void ligar(){
        System.out.println("Ligando o dispositivo...");
        iniciar();
        System.out.println("Dispositivo pronto para uso!");
    }
}
