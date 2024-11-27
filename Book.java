public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    } 
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }


    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price. Price should be a positive number.");
        }
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) {
            System.out.println("Invalid discount percentage. Discount should be between 0 and 100.");
            return;
        }
        double discountAmount = this.price * (discountPercent / 100);
        double newPrice = this.price - discountAmount;
        this.updatePrice(newPrice);
        System.out.println("Discount applied: " + discountPercent + "%");
        System.out.println("New price: " + this.price);
    }
  
    public static void main(String[] args) {

    Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 100.00);
    hp1Book.displayDetails();

    hp1Book.applyDiscount(-20);
    hp1Book.applyDiscount(0);
    hp1Book.applyDiscount(0.5);

    hp1Book.updatePrice(100);
    hp1Book.applyDiscount(25.00);
    
    hp1Book.updatePrice(100);
    hp1Book.applyDiscount(50.00);

    hp1Book.updatePrice(100);
    hp1Book.applyDiscount(100.00);
    
    hp1Book.updatePrice(100);
    hp1Book.applyDiscount(150.00);

    }    
}
