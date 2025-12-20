package L5_obeserver_design_pattern.concreteObservers;

import L5_obeserver_design_pattern.Observable;
import L5_obeserver_design_pattern.Observer;

public class Phone implements Observer {
    float temperature;
    Observable observable;
    public Phone(float temperature, Observable observable) {
        this.temperature = temperature;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Phone: Received update notification.");
        display();
    }

    public void display(){
        System.out.println("Phone: Current temperature is " + temperature + "°C");
    }
}
