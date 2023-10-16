import aparelho.Aparelho;

public class Iphone {
    public static void main(String[] args) {
        Aparelho iPhone = new Aparelho();

        iPhone.adicionarContato();
        iPhone.ligar();
        iPhone.aumentarVolume();

        iPhone.adicionarWidget();
        iPhone.iniciarCorreioDeVoz();

        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.diminuirVolume();
    }
}