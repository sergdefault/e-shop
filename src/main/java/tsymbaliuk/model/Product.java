package tsymbaliuk.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tsymbaliuk Serhii on 30.08.2016.
 */
@Entity
@Table(name ="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "product_id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "description")
    private String description;
    @Column (name = "price")
    private float price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column (name="img_name")
    private String imgName;


    @ManyToMany(mappedBy = "products")
    private List <Order> orders =new ArrayList<>();

    public Product() {
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
