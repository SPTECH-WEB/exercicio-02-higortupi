package com.exercicio2.sistema_entrega.strategy;

public class FreteExpressa implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.5 + 10;
    }
}
