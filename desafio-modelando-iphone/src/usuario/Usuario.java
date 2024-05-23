package usuario;

import dispositivo.sistema.IPhone;

public class Usuario {

    public static void main(String[] args) {
        
        // Cria um novo objeto IPhone
        IPhone meuIPhone = new IPhone();
        meuIPhone.ligarDispositivo();
        System.out.println();

        // Testando a funcionalidade do Reprodutor Musical.
        meuIPhone.selecionarMusica("O Mundo é um moinho");
        meuIPhone.aumentarVolume();
        meuIPhone.aumentarVolume();
        meuIPhone.aumentarVolume();
        meuIPhone.pausarMusica();
        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();
        System.out.println();

        // Testando a funcionalidade do Aparelho Telefonico.
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.ligar("40028922");
        meuIPhone.diminuirVolume();
        meuIPhone.diminuirVolume();
        meuIPhone.diminuirVolume();
        meuIPhone.encerrarChamada();
        meuIPhone.atenderChamada();
        System.out.println();

        // Navegando na web
        meuIPhone.exibirPagina("https://dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("https://www.youtube.com");
        meuIPhone.atualizarPagina();
        System.out.println();

        meuIPhone.desligarDispositivo();

    }
}
