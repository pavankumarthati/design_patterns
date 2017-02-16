package observerPattern;

/**
 * Created by pavan on 31/1/17.
 */
public interface Subject {

    public void register(Observer observer);

    public void unregister(Observer observer);

    public void notifyObservers();
}
