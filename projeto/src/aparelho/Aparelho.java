package aparelho;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.Navegador;
import funcionalidades.ReprodutorMusical;

public class Aparelho implements AparelhoTelefonico, Navegador, ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música!");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página da internet");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume do aparelho");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume do aparelho");
    }

    public void conectarWifi() {
        System.out.println("Conectando a rede Wi-Fi...");
    }

    public void verificarEmail() {
        System.out.println("Verificando caixa de entrada");
    }

    public void adicionarWidget() {
        System.out.println("Adicionando widget ao aparelho");
    }

    public void removerWidget() {
        System.out.println("Removendo widget do aparelho");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Acessando correio de voz...");
    }

    public void adicionarContato() {
        System.out.println("Adicionando contato...");
    }

    public void editarContato() {
        System.out.println("Editando contato...");
    }

    public void removerContato() {
        System.out.println("Removendo contato...");
    }
}
