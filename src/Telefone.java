import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusica;

public class Telefone {
    public static void main(String[] args) throws Exception {

    ReprodutorMusica musica = new ReprodutorMusica();
    AparelhoTelefonico telefone = new AparelhoTelefonico();
    NavegadorInternet internet = new NavegadorInternet();

    musica.tocar();
    musica.pausar();
    musica.selecionarMusica();
    System.out.println("----------");

    telefone.atender();
    telefone.ligar();
    telefone.iniciarCorreioDeVoz();
    System.out.println("----------");

    internet.atualizarPagina();
    internet.adicionarNovaAba();
    internet.exibirPagina();
    System.out.println("----------");


    }
}
