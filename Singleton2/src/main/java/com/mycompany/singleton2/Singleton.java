/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton2;

/**
 *
 * @author FATEC ZONA LESTE
 */
package refactoring_guru.singleton.example.non_thread_safe;

public final class Singleton {
    private static Singleton instance; // Instância única da classe
    public String value; // Dados da instância

    private Singleton(String value) {
        // Emulação de inicialização lenta
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value; // Inicialização dos dados da instância
    }

    // Método estático para obter a instância única da classe
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value); // Criação da instância se ainda não existir
        }
        return instance; // Retorna a instância única
    }
}