package web.model;

import javax.persistence.*;

@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (columnDefinition = "int")
    private String id;
    private String name;
    private String price;
    private String counts;
    private String note;

    public Product() {
    }

    public Product(String id, String name, String price, String counts, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.counts = counts;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
