
package Item;


public class Cookie implements Item{
    double price;

    @Override
    public String getItemName() {
        return "Cookie";
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDepartment() {
        return "Bakery Department";
    }
    
}
