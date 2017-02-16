package observerPattern;

import java.util.ArrayList;

/**
 * Created by pavan on 31/1/17.
 */
public class StockGrabber implements Subject {

    ArrayList<Observer> observers;
    double ibmPrice, aaplPrice, googlePrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int indexOfObserver = observers.indexOf(observer);
        if (indexOfObserver >= 0) {
            observers.remove(indexOfObserver);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googlePrice);
        }
    }

    public void setIbmPrice(double newIbmPrice) {
        ibmPrice = newIbmPrice;
        notifyObservers();
    }

    public void setAaplPrice(double newAaplPrice) {
        aaplPrice = newAaplPrice;
        notifyObservers();
    }

    public void setGooglePrice(double newGooglePrice) {
        googlePrice = newGooglePrice;
        notifyObservers();
    }
}
