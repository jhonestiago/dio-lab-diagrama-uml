package dispositivo.sistema;

// Importa as interfaces necessárias
import dispositivo.funcionalidades.ReprodutorMusical;
import dispositivo.funcionalidades.AparelhoTelefonico;
import dispositivo.funcionalidades.Navegador;

// Classe IPhone que implementa as interfaces ReprodutorMusical, AparelhoTelefonico e Navegador
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    private String estadoDispositivo = "Desligado";
    private int volume = 20; // Volume inicial do dispositivo
    
    // Método para ligar o dispositivo
    public void ligarDispositivo() {
        if (this.estadoDispositivo == "Desligado") {
            this.estadoDispositivo = "Ligado";
            System.out.println("Ligando iPhone... Aguarde.");
        }
    }

    // Método para desligar o dispositivo
    public void desligarDispositivo() {
        if (this.estadoDispositivo == "Ligado") {
            this.estadoDispositivo = "Desligado";
            System.out.println("Desligando iPhone...");
        }
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        if (volume < 25) {
            volume++;
        }
        System.out.println("Volume aumentado para: " + volume);
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Volume diminuído para: " + volume);
    }
    
    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Efetuando chamada para: " + numero);
    }
   
    @Override
    public void atenderChamada() {
        System.out.println("Chamada recebida. Atendedendo...");
    }
    
    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada com sucesso.");
    } 
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Redirecionando para Correio de Voz...");
    } 

    // Métodos da interface Navegador
    public void exibirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba criada com sucesso.");
    }

    public void atualizarPagina() {
        System.out.println("Recarregando página atual...");
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica + ". Começando a reprodução...");
    }

}
