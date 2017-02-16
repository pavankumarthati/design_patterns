package observerPattern;

/**
 * Created by pavan on 31/1/17.
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private StockGrabber stockGrabber;
    private static int observerIdTracker = 0;

    private int observerId;

    public StockObserver(StockGrabber stockGrabber) {
        this.stockGrabber = stockGrabber;
        observerId = observerIdTracker++;
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googlPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googlPrice;

        printStockPrices();
    }

    private void printStockPrices() {
        System.out.println("ibm: " + ibmPrice + "\n" + "aapl: " + aaplPrice + "\n" +
        "google: " + googPrice);
    }
}
