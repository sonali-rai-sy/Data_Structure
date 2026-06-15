package product;

class Clothes {
    String productName;
    double price;
    int quantity;

    // Set data
    void setData(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Buy items
    void buy(int qty) {
        if (quantity >= qty) {
            System.out.println("Buying " + qty + " items...");
            quantity = quantity - qty;
        } else {
            System.out.println("Out of stock");
        }
    }

    // Restock items
    void restock(int qty) {
        System.out.println("Restocking " + qty + " items...");
        quantity = quantity + qty;
    }

    // Calculate total value
    double getTotalValue() {
        return price * quantity;
    }

    // Display details
    void display() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Value: " + getTotalValue());
        System.out.println();
    }
}

public class Product {
    public static void main(String[] args) {

        Clothes cl = new Clothes();

        // Initial data
        cl.setData("Kurti", 2000, 4);

        // Before operations
        cl.display();

        // Operations
        cl.buy(5);        // will show out of stock
        cl.restock(3);    // quantity becomes 7

        // After operations
        cl.display();
    }
}