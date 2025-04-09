package com.pessoal.logistica.strategy.service;
import org.springframework.stereotype.Component;

@Component
public class EntregaTerceirizada implements CalculoFrete {
    @Override
    public double calcularFrete(double peso) {
        return 0;
    }

    @Override
    public double CalcularFrete(double weight) {
        return weight * 1.2;
    }
}
