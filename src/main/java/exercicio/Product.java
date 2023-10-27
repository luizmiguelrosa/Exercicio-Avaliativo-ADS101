package exercicio;

public class Product {
    private String name, price_tag;
    private double price;
    
    public Product(String name, double price, String price_tag) {
        this.name = name;
        this.price = price;
        this.price_tag = price_tag;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String priceTag() {
        return price_tag;
    }

    public String toString() {
        return String.format("- %s R$%.2f", name, price);
    }
}
