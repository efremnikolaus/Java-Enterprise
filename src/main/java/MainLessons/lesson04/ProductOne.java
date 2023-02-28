package MainLessons.lesson04;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOne {
    private String type;
    private double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public ProductOne(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public List<ProductOne> getExpensiveBooks(List<ProductOne> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() > 250)
                .collect(Collectors.toList());
    }
}
