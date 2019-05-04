package ifma.edu.mauro.lp3.store.entity;

import com.mysql.cj.jdbc.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private int categoryID;
    private String categoryName;
    private String description;
    private Blob picture;

    protected Category(){}

    public Category(int categoryID, String categoryName, String description, Blob picture) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getDescription() {
        return description;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }
}
