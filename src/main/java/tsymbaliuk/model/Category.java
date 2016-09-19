package tsymbaliuk.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Цымбалюк Сергей on 30.08.2016.
 */
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "category_id")
    private int category_id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column (name="img_name")
    private String imgName;

    @OneToMany(mappedBy = "category")
    private Set<Product> products;



    public Category() {
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
