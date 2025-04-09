package com.exercicio2.sistema_entrega.observer;

import java.util.ArrayList;
import java.util.List;

public class ServicoNotificacao {

    private final List<Notificador> observadores = new ArrayList<>();

    public void adicionarObservador(Notificador observer) {
        observadores.add(observer);
    }

    public void notificarTodos(String mensagem) {
        for (Notificador obs : observadores) {
            obs.notificar(mensagem);
        }
    }
}
