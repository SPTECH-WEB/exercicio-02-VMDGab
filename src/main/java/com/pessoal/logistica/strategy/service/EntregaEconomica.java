package com.pessoal.logistica.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements CalculoFrete {
    @Override
    public double CalcularFrete(double weight) {
        return weight * 0.8;
    }
}

