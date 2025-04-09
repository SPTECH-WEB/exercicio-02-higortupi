package com.exercicio2.sistema_entrega.service;

import com.exercicio2.sistema_entrega.strategy.*;
import com.exercicio2.sistema_entrega.adapter.TransportadoraAdapter;

public class FreteService {

    public FreteStrategy escolherEstrategia(String modalidade) {
        return switch (modalidade.toLowerCase()) {
            case "expressa" -> new FreteExpressa();
            case "economica" -> new FreteEconomica();
            case "terceirizada" -> new TransportadoraAdapter();
            default -> throw new IllegalArgumentException("Modalidade inválida");
        };
    }

    public double calcularFrete(double peso, FreteStrategy strategy) {
        return strategy.calcularFrete(peso);
    }
}
