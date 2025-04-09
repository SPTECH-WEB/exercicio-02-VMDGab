package com.pessoal.logistica.strategy.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CalculoFreteService {
    private final Map<String, CalculoFrete> strategies;

    public CalculoFreteService(Map<String, CalculoFrete> strategies) {
        this.strategies = strategies;
    }

    public double CalcularFrete(String type, double weight) {
        CalculoFrete strategy = strategies.get(type.toLowerCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid delivery type: " + type);
        }
        return strategy.CalcularFrete(weight);
    }
}