package com.exercicio2.sistema_entrega.strategy;

public class FreteEconomica implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 0.8 + 5;
    }
}
