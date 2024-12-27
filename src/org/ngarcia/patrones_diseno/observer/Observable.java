package org.ngarcia.patrones_diseno.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {

    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer); //requiere equals en la clase que implemente Observer
    }

    public void notifyObservers() {
        //for(Observer obs: this.observers) {
        //    obs.update(this);
        //}
        notifyObservers(null);
    }

    public void notifyObservers(Object obj) {
        for(Observer obs: this.observers) {
            obs.update(this, obj);
        }
    }
}
