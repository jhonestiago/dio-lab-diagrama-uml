package dispositivo.funcionalidades;

// Interface da funcionalidade Navegador
public interface Navegador {
    
    // Método para exibir uma página através de uma URL
    void exibirPagina(String url);

    // Método para adicionar uma nova aba
    void adicionarNovaAba();

    // Método para atualizar a página atual
    void atualizarPagina();

}