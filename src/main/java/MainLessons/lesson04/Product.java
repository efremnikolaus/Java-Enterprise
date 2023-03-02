package MainLessons.lesson04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private BigDecimal price;
    private boolean discountAvailable;
    private LocalDate addedDate;

    public Product(String type, BigDecimal price, boolean discountAvailable) {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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
}
