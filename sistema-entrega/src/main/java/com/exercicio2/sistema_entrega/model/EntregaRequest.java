package com.exercicio2.sistema_entrega.model;

public class EntregaRequest {
    private double peso;
    private String modalidade;

    public EntregaRequest() {}

    public EntregaRequest(double peso, String modalidade) {
        this.peso = peso;
        this.modalidade = modalidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}
