package com.novaes.calculadora.controller;

import com.novaes.calculadora.dto.CalculadoraRequest;
import com.novaes.calculadora.dto.CalculadoraResponse;
import com.novaes.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/somar")
    public CalculadoraResponse somar(CalculadoraRequest request) {
        double resultado = calculadoraService.somar(request.getNumero1(), request.getNumero2());
        return new CalculadoraResponse(request.getNumero1(), request.getNumero2(), "soma", resultado);
    }

    @PostMapping("/subtrair")
    public CalculadoraResponse subtrair(CalculadoraRequest request) {
        double resultado = calculadoraService.subtrair(request.getNumero1(), request.getNumero2());
        return new CalculadoraResponse(request.getNumero1(), request.getNumero2(), "subtração", resultado);
    }

    @PostMapping("/multiplicar")
    public CalculadoraResponse multiplicar(CalculadoraRequest request) {
        double resultado = calculadoraService.multiplicar(request.getNumero1(), request.getNumero2());
        return new CalculadoraResponse(request.getNumero1(), request.getNumero2(), "multiplicação", resultado);
}

    @PostMapping("/dividir")
    public CalculadoraResponse dividir(CalculadoraRequest request) {
        double resultado = calculadoraService.dividir(request.getNumero1(), request.getNumero2());
        return new CalculadoraResponse(request.getNumero1(), request.getNumero2(), "divisão", resultado);
    }


}
