public class Singleton { 
    private static volatile Singleton instance; // Declaração da variável estática que conterá a única instância da classe
    private String data; // Declaração da variável para armazenar os dados específicos da instância

    // Construtor privado para evitar instância direta fora da classe
    Singleton(String data) { 
        this.data = data; // Inicialização dos dados da instância
    } 

    // Método estático para obter a instância única da classe, aceitando dados como parâmetro
    public static Singleton getInstance(String data) { 
        Singleton result = instance; // Armazena a instância atual em uma variável local
        
        // Verifica se a instância ainda não foi criada
        if(result == null) { 
            // Inicia a sincronização para evitar criação de múltiplas instâncias em ambientes multithreaded
            synchronized (Singleton.class) { 
                result = instance; // Armazena novamente a instância atual em uma variável local
                
                // Verifica novamente se a instância ainda não foi criada
                if(result == null) { 
                    instance = result = new Singleton(data); // Cria a instância e a armazena na variável estática
                } 
            } 
        } 
        return result; // Retorna a instância única da classe
    } 
} 
