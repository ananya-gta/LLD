package L5_obeserver_design_pattern.concreteObservables;

import L5_obeserver_design_pattern.Observable;
import L5_obeserver_design_pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    List<Observer> observers = new ArrayList<>();
    // observable data
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("[+] Observer registered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("[-] Observer removed: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
