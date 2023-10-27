package exercicio;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class UsedProduct extends Product {
    private Date manufactureDate;
    private SimpleDateFormat formatter;
    
    public UsedProduct(String name, double price, String price_tag, String manufactureDate) {
        super(name, price, price_tag);

        formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.manufactureDate = formatter.parse(manufactureDate);
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }
    
    public String getManufactureDate() {
        return formatter.format(manufactureDate);
    }

    @Override
    public String toString() {
        return String.format("- %s (usado) R$%.2f (Fabricado em: %s)", getName(), getPrice(), getManufactureDate());
    }
}
