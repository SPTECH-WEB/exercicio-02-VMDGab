package com.pessoal.logistica.strategy.observer;

import org.springframework.stereotype.Component;

@Component
public class InternalTeamNotifier implements NotificationObserver {
    @Override
    public void notify(String message) {
        System.out.println("Notificando equipe interna: " + message);
    }
}