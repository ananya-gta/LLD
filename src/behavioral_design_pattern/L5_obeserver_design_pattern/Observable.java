package behavioral_design_pattern.L5_obeserver_design_pattern;

public interface Observable {
     void addObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObservers();

}
