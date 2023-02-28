package MainLessons.lesson04;

import java.util.List;
import java.util.stream.Collectors;

public class ProductTwo {
    private String type;
    private double price;
    private boolean discountAvailable;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscountAvailable() {
        return discountAvailable;
    }

    public void setDiscountAvailable(boolean discountAvailable) {
        this.discountAvailable = discountAvailable;
    }

    public ProductTwo(String type, double price, boolean discountAvailable) {
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
    }
    public List<ProductTwo> getDiscountedBooks(List<ProductTwo> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.isDiscountAvailable())
                .map(p -> {
                    p.setPrice(p.getPrice() * 0.9);
                    return p;
                })
                .collect(Collectors.toList());
    }
}