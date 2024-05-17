/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class SingletonMain {
    private static volatile Singleton instance;
    private String data;

    private SingletonMain(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Teste do Singleton
        Singleton singleton1 = Singleton.getInstance("Dados do Singleton 1");
        Singleton singleton2 = Singleton.getInstance("Dados do Singleton 2");

        // Verificação se as duas instâncias são iguais
        System.out.println("singleton1 é igual a singleton2: " + (singleton1 == singleton2));
        // Saída esperada: singleton1 é igual a singleton2: true
    }

}
