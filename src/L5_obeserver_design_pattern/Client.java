package L5_obeserver_design_pattern;

import L5_obeserver_design_pattern.concreteObservables.WeatherStation;
import L5_obeserver_design_pattern.concreteObservers.Phone;
import L5_obeserver_design_pattern.concreteObservers.TV;

public class Client {
    public static void main(String[] args) {
        // create observable
        WeatherStation weatherStation = new WeatherStation();

        // create observers
        Observer phone = new Phone(43 ,weatherStation);
        Observer tv = new TV(53, weatherStation);

        weatherStation.addObserver(phone);
        weatherStation.addObserver(tv);

        weatherStation.setTemperature(30);
    }
}
