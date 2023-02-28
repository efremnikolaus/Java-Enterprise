package MainLessons.lesson04;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductSix {
    private int id;
    private String type;
    private double price;
    private boolean discountAvailable;
    private LocalDate addedDate;

    public ProductSix(int id, String type, double price, boolean discountAvailable, LocalDate addedDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
        this.addedDate = addedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Map<String, List<ProductSix>> groupProductsByType(List<ProductSix> products) {
        return products.stream()
                .collect(Collectors.groupingBy(ProductSix::getType));
    }
}
