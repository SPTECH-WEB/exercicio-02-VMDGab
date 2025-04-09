package com.pessoal.logistica.strategy.service;


import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements CalculoFrete {
    @Override
    public double CalcularFrete(double weight) {
        return weight * 1.5;
    }
}
