package com.pessoal.logistica.adapter.service;

import com.pessoal.logistica.strategy.service.CalculoFrete;
import org.springframework.stereotype.Component;

@Component
public class AdapterTransportadoraExterna implements CalculoFrete {
    private final TransportadoraExternaAPI transportadoraExternaAPI;

    public AdapterTransportadoraExterna() {
        this.transportadoraExternaAPI = new TransportadoraExternaAPI();
    }

    @Override
    public double calcularFrete(double peso) {
        return transportadoraExternaAPI.obterCustoEntrega(peso);
    }

    @Override
    public double CalcularFrete(double weight) {
        return 0;
    }
}