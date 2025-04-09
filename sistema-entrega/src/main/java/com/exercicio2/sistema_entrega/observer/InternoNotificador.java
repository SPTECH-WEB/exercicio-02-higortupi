package com.exercicio2.sistema_entrega.observer;

public class InternoNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Equipe interna notificada: " + mensagem);
    }
}
