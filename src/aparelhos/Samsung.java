package aparelhos;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusica;

public class Samsung implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet {

  public void tocar() {
    System.out.println("Samsung: TOCANDO MUSICA");
  }

  public void pausar() {
    System.out.println("Samsung: PAUSANDO MUSICA");
  }

  public void selecionarMusica() {
    System.out.println("Samsung: SELECIONANDO MUSICA");
  }

  public void ligar() {
    System.out.println("Samsung: LIGANDO PARA CONTATO");
  }

  public void atender() {
    System.out.println("Samsung: ATENDENDO CONTATO");
  }

  public void iniciarCorreioDeVoz() {
    System.out.println("Samsung: INICIANDO CORREIO DE VOZ");
  }

    public void exibirPagina() {
      System.out.println("Samsung: EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba() {
      System.out.println("Samsung: ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
      System.out.println("Samsung: ATUALIZANDO PÁGINA");
    }
}
