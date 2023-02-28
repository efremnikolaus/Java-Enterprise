package MainLessons.lesson04;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductFour {
    private String type;
    private double price;
    private boolean discountAvailable;
    private LocalDate addedDate;

    public ProductFour(String type, double price, boolean discountAvailable, LocalDate addedDate) {
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
    public List<ProductFour> getLastThreeAddedProducts(List<ProductFour> products) {
        return products.stream()
                .sorted(Comparator.comparing(ProductFour::getAddedDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
