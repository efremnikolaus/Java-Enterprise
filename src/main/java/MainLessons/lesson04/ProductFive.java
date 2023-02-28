package MainLessons.lesson04;

import java.time.LocalDate;
import java.util.List;

public class ProductFive {
    private String type;
    private double price;
    private boolean discountAvailable;
    private LocalDate addedDate;

    public ProductFive(String type, double price, boolean discountAvailable, LocalDate addedDate) {
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
        this.addedDate = addedDate;
    }

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

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }
    public double calculateTotalPrice(List<ProductFive> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() <= 75 && p.getAddedDate().getYear() == LocalDate.now().getYear())
                .mapToDouble(ProductFive::getPrice)
                .sum();
    }
}
