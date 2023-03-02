package MainLessons.lesson04;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductList {
    public List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .filter(p -> p.getPrice().compareTo(new BigDecimal("250")) > 0)
                .collect(Collectors.toList());
    }
    public List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .filter(Product::isDiscountAvailable)
                .map(p -> new Product(p.getType(), p.getPrice().multiply(new BigDecimal("0.9")), false))
                .collect(Collectors.toList());
    }
    public static Optional<Product> findCheapestBook(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice));
    }
    public List<Product> getLastThreeAddedBooks(List<Product> products, int count) {
        try {
            return products.stream()
                    .sorted(Comparator.comparing(Product::getAddedDate).reversed())
                    .limit(count)
                    .collect(Collectors.toList());
        } catch (ProductNotFoundException e) {
            System.out.println("Error :(");
        }
        return products;
    }
    public static BigDecimal calculateTotalPrice(List<Product> products) {
        LocalDate currentDate = LocalDate.now();
        return products.stream()
                .filter(p -> p.getType().equals(ProductType.BOOK))
                .filter(p -> p.getPrice().compareTo(BigDecimal.valueOf(75)) <= 0)
                .filter(p -> p.getAddedDate().getYear() == currentDate.getYear())
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    public Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
