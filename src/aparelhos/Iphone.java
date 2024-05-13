package aparelhos;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusica;

public class Iphone implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet {

  public void tocar() {
    System.out.println("iPhone: TOCANDO MUSICA");
  }

  public void pausar() {
    System.out.println("iPhone: PAUSANDO MUSICA");
  }

  public void selecionarMusica() {
    System.out.println("iPhone: SELECIONANDO MUSICA");
  }

  public void ligar() {
    System.out.println("iPhone: LIGANDO PARA CONTATO");
  }

  public void atender() {
    System.out.println("iPhone: ATENDENDO CONTATO");
  }

  public void iniciarCorreioDeVoz() {
    System.out.println("iPhone: INICIANDO CORREIO DE VOZ");
  }

    public void exibirPagina() {
      System.out.println("iPhone: EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba() {
      System.out.println("iPhone: ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
      System.out.println("iPhone: ATUALIZANDO PÁGINA");
    }


}
