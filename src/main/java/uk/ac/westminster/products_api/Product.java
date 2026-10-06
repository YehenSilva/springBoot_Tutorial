package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(){}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

/*    when Commented out, I would notice that a field is missing from the JSON response
      ,which could mean its getter method is missing
*/

    public double getPrice() {
        return price;
    }
}