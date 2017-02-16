package observerPattern;

/**
 * Created by pavan on 31/1/17.
 */
public class GrabStocks {

    public static void main(String [] args) {
        StockGrabber stockGrabber = new StockGrabber();

        Observer stockObserver = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(198.00);
        stockGrabber.setAaplPrice(23.04);
        stockGrabber.setGooglePrice(1234.00);

    }
}
