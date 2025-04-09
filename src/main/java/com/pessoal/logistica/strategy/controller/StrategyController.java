package com.pessoal.logistica.strategy.controller;

import com.pessoal.logistica.strategy.observer.NotificationManager;
import com.pessoal.logistica.strategy.service.CalculoFrete;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController<DeliveryRequest> {
    private final CalculoFrete CalculoFreteService;
    private final NotificationManager notificationManager;

    public DeliveryController(CalculoFrete calculoFreteService, NotificationManager notificationManager) {
        CalculoFreteService = calculoFreteService;
        this.notificationManager = notificationManager;
    }


    @PostMapping
    public String processDelivery(@RequestBody DeliveryRequest request) {
        double frete = CalculoFreteService.calcularFrete(request.getType(), request.getWeight());
        String message = "Entrega processada. Frete calculado: " + freight;

        notificationManager.notifyAllObservers(message);

        return message;
    }
}