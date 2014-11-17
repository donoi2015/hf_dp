package designpatterns.ind9Combined1p501.observe;

public interface Subject {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
