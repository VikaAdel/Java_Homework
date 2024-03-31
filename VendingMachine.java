package Java_Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * VendingMachine
 */
public interface VendingMachine {

    void initProducts(List<Product> productLst);

    Product getProduct(String name);
}




// public class VendingMachine {
// private List<Product> products;

// public void initProducts(List<Product> productList) {
// this.products = productList;
// }

// public Product getProduct(String name) {
// for (Product product : products) {
// if (product.getName().equals(name)) {
// return product;
// }
// }
// return null; // Если товар не найден
// }

// public static void main(String[] args) {
// VendingMachine vendingMachine = new VendingMachine();

// List<Product> productList = new ArrayList<>();
// productList.add(new Product("Cola", 1.50, "Drinks", 10));
// productList.add(new Product("Chips", 1.20, "Snacks", 20));
// productList.add(new Product("Water", 1.00, "Drinks", 15));
// productList.add(new Product("Chocolate", 2.00, "Snacks", 12));

// vendingMachine.initProducts(productList);

// System.out.println("Product: " +
// vendingMachine.getProduct("Cola").getName());
// System.out.println("Price: $" +
// vendingMachine.getProduct("Cola").getPrice());
// System.out.println("Category: " +
// vendingMachine.getProduct("Cola").getCategory());
// System.out.println("Available Amount: " +
// vendingMachine.getProduct("Cola").getAmount());

// System.out.println();

// System.out.println("Product: " +
// vendingMachine.getProduct("Water").getName());
// System.out.println("Price: $" +
// vendingMachine.getProduct("Water").getPrice());
// System.out.println("Category: " +
// vendingMachine.getProduct("Water").getCategory());
// System.out.println("Available Amount: " +
// vendingMachine.getProduct("Water").getAmount());
// }
// }
