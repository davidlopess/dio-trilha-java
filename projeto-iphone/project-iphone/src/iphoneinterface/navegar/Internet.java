package iphoneinterface.navegar;

public class Internet implements NavegadorInternet {
    public void exibirPagina(String url){
        System.out.println("\nEXIBINDO PÁGINA: " + url);
        
    }

    public void adicionarNovaAba(){
        System.out.println("ABRINDO NOVA ABA.");

    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGÍNA.");
        
    }

    
    
    
}
