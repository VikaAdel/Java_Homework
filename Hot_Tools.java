package Java_Homework;
import java.util.ArrayList;
import java.util.List;



class Hot_Tools extends Product {
    private int temperature;

    public Hot_Tools(String name, double price, String category, int amount, int temperature) {
        super(name, price, category, amount);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + amount +
                ", temperature=" + temperature +
                '}';
    }
}
