package Java_Homework;

import java.util.List;

class Hot_Tools_Machine implements VendingMachine {
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

    // Перегруженный метод getProduct для получения продукта по имени и температуре
    public Product getProduct(String name, int temperature) {
        for (Product product : products) {
            if (product.getName().equals(name) && product instanceof Hot_Tools) {
                Hot_Tools hotTool = (Hot_Tools) product;
                if (hotTool.getTemperature() == temperature) {
                    return product;
                }
            }
        }
        return null; // Если товар не найден
    }
}
