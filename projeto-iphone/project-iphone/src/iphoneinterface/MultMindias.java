package iphoneinterface;

//import java.lang.classfile.instruction.SwitchCase;

import iphoneinterface.aparelho.AparelhoTelefonico;
import iphoneinterface.aparelho.Telephone;
import iphoneinterface.musicas.AbaMusicas;
import iphoneinterface.musicas.ReprodutorMusical;
import iphoneinterface.navegar.Internet;
import iphoneinterface.navegar.NavegadorInternet;

import java.util.Scanner;

public class MultMindias implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    Scanner scanner = new Scanner(System.in);

    boolean continuar = true;
    
    
    public void escolherAplicativo(){

          


 while(continuar){
    System.out.println("\nEscolha uma das opções abaixo:");
    System.out.println("1 - Aplicativo de música");
    System.out.println("2 - Navegador");
    System.out.println("3 - Aplicativo de chamadas\n4 - Voltar ao menu principal");
    System.out.println("0 - Desligar aparelho");
    int opcao = 0; // Initialize opcao with a default value
     opcao = scanner.nextInt();

    switch(opcao){
        case 1:
            System.out.println("Acessando o aplicativo de música");
            AbaMusicas musicas = new AbaMusicas();
            musicas.tocar();
            musicas.pausar();
            musicas.selecionarMusica("MUSICA 1");
            System.out.println("\nDigite 4 para voltar ao menu Principal...");
            opcao = scanner.nextInt();
            break;
        case 2:
            System.out.println("Acessando o navegador");
            Internet navegar = new Internet();
            navegar.exibirPagina("www.google.com");
            navegar.adicionarNovaAba();
            navegar.atualizarPagina();
            System.out.println("\nDigite 4 para voltar ao menu Principal...");
            opcao = scanner.nextInt();

            break;
        case 3:
            System.out.println("Acessando o aplicativo de chamadas");
            Telephone telefone = new Telephone();
            telefone.ligar("123456789");
            telefone.atender();
            telefone.iniciarCorreioVoz();
            System.out.println("\nDigite 4 para voltar ao menu Principal...");
            opcao = scanner.nextInt();
            break;

            
        case 4:
            System.out.println("Voltando ao menu principal");
            break;
        case 0:
        System.out.println("Desligando Celular...");
            
        continuar = !true;
        break;
    
        default:
            System.out.println("Opção inválida");
            break;
        
    }

   
   
 }
   scanner.close();


    }
   





    //METODOS DA INTERFACE TELEFONE 
   @Override
    public void ligar() {      
    }
    @Override
    public void atender() {    
    }
    @Override
    public void iniciarCorreioVoz() {   
    }


    //METODOS DA INTERFACE REPRODUTOR MUSICAL
    public void tocar() {      
    }
    
    public void pausar() {    
    } 
   
    public void selecionarMusica(String musica) {

    }  

    //METODOS DA INTERFACE NAVEGADOR INTERNET
    public void exibirPagina(String pagina) {    
    }
    public void adicionarNovaAba() {    
    }
    public void atualizarPagina() {    
    }
    

   
   
}
