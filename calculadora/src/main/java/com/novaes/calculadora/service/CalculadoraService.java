package com.novaes.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("O segundo número não pode ser zero.");
        }
        return numero1 / numero2;
    }
}
