import aparelhos.Iphone;
import aparelhos.Samsung;

public class Usuario {
    public static void main(String[] args) throws Exception {

    Iphone iphone = new Iphone();
    Samsung samsung = new Samsung();

    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();
    System.out.println("----------");

    iphone.atender();
    iphone.ligar();
    iphone.iniciarCorreioDeVoz();
    System.out.println("----------");

    iphone.atualizarPagina();
    iphone.adicionarNovaAba();
    iphone.exibirPagina();
    System.out.println("----------");

    samsung.tocar();
    samsung.pausar();
    samsung.selecionarMusica();
    System.out.println("----------");

    samsung.atender();
    samsung.ligar();
    samsung.iniciarCorreioDeVoz();
    System.out.println("----------");

    samsung.atualizarPagina();
    samsung.adicionarNovaAba();
    samsung.exibirPagina();
    System.out.println("----------");

    }
}
