package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        
        System.out.print("Digite o total de produtos: ");
        int total_products = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < total_products; i++) {
            System.out.print("\nComum - Usado - Importado (c/u/i)");
            String type = input.nextLine();
            
            System.out.print("Nome: ");
            String name = input.nextLine();
            
            System.out.print("Preço: R$");
            double price = input.nextDouble();
            
            switch (type) {
                case "c":
                    Product product = new Product(name, price, type);
                    products.add(product);
                    input.nextLine();
                    break;
                case "u":
                    input.nextLine();

                    System.out.print("Data de fabricação (DD/MM/YYYY): ");
                    String data = input.nextLine();
                    UsedProduct used_product = new UsedProduct(name, price, type, data);
                    products.add(used_product);
                    break;
                case "i":
                    System.out.print("Taxa de importação: R$");
                    double tax = input.nextDouble();

                    ImportedProduct imported_product = new ImportedProduct(name, price, type, tax);
                    products.add(imported_product);
                    input.nextLine();
                    break;
                default:
                    break;
            }
        }
        input.close();

        System.out.println("\nEtiquetas:");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
