package com.pessoal.logistica.strategy.observer;

import org.springframework.stereotype.Component;

@Component
public class CustomerNotifier implements NotificationObserver {
    @Override
    public void notify(String message) {
        System.out.println("Notificando cliente: " + message);
    }
}
