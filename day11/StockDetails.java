public class StockDetails {

    public String stockName;
    public float stockPrice;
    public int  stockUnits;

    public String getStockName() {
        return stockName;
    }
    public float getStockPrice() {
        return stockPrice;
    }
    public int getStockUnits() {
        return stockUnits;
    }
    public float getTotalPrice(){
        return stockPrice * stockUnits;
    }
}