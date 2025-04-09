package com.pessoal.logistica.strategy.observer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NotificationManager {
    private final List<NotificationObserver> observers = new ArrayList<>();

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String message) {
        for (NotificationObserver observer : observers) {
            observer.notify(message);
        }
    }
}