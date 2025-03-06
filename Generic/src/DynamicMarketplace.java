import java.util.ArrayList;
import java.util.List;

abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }
}


class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
}

class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }
}


class ProductCatalog<T extends Product> {
    public List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void showProducts() {
        for (T product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}


public class DynamicMarketplace {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("Java Programming", 30));
        bookCatalog.addProduct(new Book("Data Structures", 25));

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 15));
        clothingCatalog.addProduct(new Clothing("Jeans", 40));

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 500));
        gadgetCatalog.addProduct(new Gadget("Headphones", 80));

        System.out.println("Before Discount:");
        bookCatalog.showProducts();
        clothingCatalog.showProducts();
        gadgetCatalog.showProducts();


        System.out.println("\nAfter 10% Discount on Books:");
        for (Book book : bookCatalog.products) {
            book.applyDiscount(10);
        }
        bookCatalog.showProducts();
    }
}

