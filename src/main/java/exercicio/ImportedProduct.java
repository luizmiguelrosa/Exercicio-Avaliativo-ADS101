package exercicio;

public class ImportedProduct extends Product {
    private double customsFee;
    
    public ImportedProduct(String name, double price, String price_tag, double customsFee) {
        super(name, price, price_tag);
        this.customsFee = customsFee;
    }
    
    public double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String toString() {
        return String.format("- %s R$%.2f (Taxa de importação: R$%.2f)", getName(), totalPrice(), customsFee);
    }
}