package dispositivo.aplicativos;

// Interface da funcionalidade Aparelho Telefônico
public interface AparelhoTelefonico {
    
    // Método para ligar para um número
    void ligar(String numero);
    
    // Método para atender uma chamada
    void atenderChamada();
    
    // Método para encerrar uma chamada
    void encerrarChamada();
    
    // Método para iniciar o correio de voz
    void iniciarCorreioVoz();

}
