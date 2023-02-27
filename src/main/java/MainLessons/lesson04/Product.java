package MainLessons.lesson04;

import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private double price;
    private boolean discountAvailable;
    private LocalDate addedDate;

    public Product(int id, String type, double price, boolean discountAvailable, LocalDate addedDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
        this.addedDate = addedDate;
    }
}
