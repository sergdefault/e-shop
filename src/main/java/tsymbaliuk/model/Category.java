package tsymbaliuk.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Цымбалюк Сергей on 30.08.2016.
 */

public class Category {
    private int id;
    private String title;
    private String description;
    private Set products;


    public Category() {
    }

    public Set getProducts() {
        return products;
    }

    public void setProducts(Set products) {
        this.products = products;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}