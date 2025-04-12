public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("2WORLDS - Madge");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("(11)12345-6789");
        iphone.atender();
        iphone.inicarCorreioVoz();

        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}