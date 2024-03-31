package Java_Homework;

public class BottleWater extends Product {
    public BottleWater(String name, double price, String category, int amount) {
        super(name, price, category, amount);

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + amount +
                '}';
    }

}