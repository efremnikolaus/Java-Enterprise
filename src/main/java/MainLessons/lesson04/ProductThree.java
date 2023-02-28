package MainLessons.lesson04;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProductThree {
    private String type;
    private double price;
    private boolean discountAvailable;

    public ProductThree(String type, double price, boolean discountAvailable) {
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
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
    public ProductThree findCheapestBook(List<ProductThree> products) {
        Optional<ProductThree> cheapest = products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min(Comparator.comparingDouble(ProductThree::getPrice));
        return cheapest.orElseThrow(() -> new RuntimeException("ERROR_0x23234"));
    }
}
