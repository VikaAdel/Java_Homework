package Java_Homework;
import java.util.ArrayList;
import java.util.List;


public class VendingMachineByWater implements VendingMachine {

    private List<Product> products;

    public void initProducts(List<Product> productList) {
        this.products = productList;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Если товар не найден
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Hot_Tools_Machine vendingMachine = new Hot_Tools_Machine();

        List<Product> productList = new ArrayList<>();
        productList.add(new BottleWater("Cola", 1.50, "Drinks", 5));
        productList.add(new BottleWater("Soda", 2.50, "Drinks", 3));
        productList.add(new Hot_Tools("Coffee", 2.00, "Hot Drinks", 10, 80));
        productList.add(new Hot_Tools("Tea", 1.50, "Hot Drinks", 8, 70));

        vendingMachine.initProducts(productList);
        System.out.println(vendingMachine.getProduct("Tea"));
        System.out.println(((Hot_Tools_Machine) vendingMachine).getProduct("Coffee", 90));
    }
}