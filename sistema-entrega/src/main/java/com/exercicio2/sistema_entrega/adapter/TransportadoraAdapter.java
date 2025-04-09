package com.exercicio2.sistema_entrega.adapter;

import com.exercicio2.sistema_entrega.strategy.FreteStrategy;

public class TransportadoraAdapter implements FreteStrategy {

    private final TransportadoraExterna transportadoraExterna;

    public TransportadoraAdapter() {
        this.transportadoraExterna = new TransportadoraExterna();
    }

    @Override
    public double calcularFrete(double peso) {
        return transportadoraExterna.calcularValor(peso);
    }
}
