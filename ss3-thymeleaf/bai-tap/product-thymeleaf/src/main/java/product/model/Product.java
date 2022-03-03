package product.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String describe;
    private String company;

    public Product() {
    }

    public Product(int id, String name, int price, String describe, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
