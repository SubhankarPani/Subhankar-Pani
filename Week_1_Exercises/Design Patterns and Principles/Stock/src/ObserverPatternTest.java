public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(100.00);
        stockMarket.setPrice(101.00);

        stockMarket.removeObserver(mobileApp);
        stockMarket.setPrice(102.00);
    }
}
