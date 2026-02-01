package ss6;

class Product {
    private String productId;
    private String productName;
    private double price;

    Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    String getProductId() {
        return productId;
    }

    String getProductName() {
        return productName;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Gia khong hop le! Gia phai > 0");
        }
    }

    void displayInfo() {
        System.out.println("Ma SP: " + productId);
        System.out.println("Ten SP: " + productName);
        System.out.println("Gia ban: " + price);
        System.out.println("----------------------");
    }
}

public class bai3 {
    public static void main(String[] args) {

        Product p1 = new Product("SP001", "Laptop Dell", 1500);

        p1.displayInfo();

        p1.setPrice(-500);

        p1.displayInfo();

        p1.setPrice(1800);
        p1.displayInfo();
    }
}
