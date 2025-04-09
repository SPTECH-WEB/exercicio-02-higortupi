package com.exercicio2.sistema_entrega.observer;

public class ClienteNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Cliente notificado: " + mensagem);
    }
}
