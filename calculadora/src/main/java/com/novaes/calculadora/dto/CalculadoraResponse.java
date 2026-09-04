package com.novaes.calculadora.dto;

public class CalculadoraResponse {

    private double numero1;
    private double numero2;
    private String operacao;
    private double resultado;

    public CalculadoraResponse(double numero1, double numero2, String operacao, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        this.resultado = resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getOperacao() {
        return operacao;
    }

    public double getResultado() {
        return resultado;
    }
}
