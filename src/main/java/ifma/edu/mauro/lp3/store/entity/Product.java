package ifma.edu.mauro.lp3.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private int productID;
    private String ProductName;
    private Supplier supplier;
    private Category category;
    private String quantityPerUnit;
    private float unityPrice;
    private int unityInStock;
    private int unityOnOrder;
    private int reorderLevel;
    private int discontinued;

    protected Product(){}

    public Product(int productID, String productName, Supplier supplier, Category category, String quantityPerUnit, float unityPrice, int unityInStock, int unityOnOrder, int reorderLevel, int discontinued) {
        this.productID = productID;
        ProductName = productName;
        this.supplier = supplier;
        this.category = category;
        this.quantityPerUnit = quantityPerUnit;
        this.unityPrice = unityPrice;
        this.unityInStock = unityInStock;
        this.unityOnOrder = unityOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Category getCategory() {
        return category;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public float getUnityPrice() {
        return unityPrice;
    }

    public int getUnityInStock() {
        return unityInStock;
    }

    public int getUnityOnOrder() {
        return unityOnOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public int getDiscontinued() {
        return discontinued;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public void setUnityPrice(float unityPrice) {
        this.unityPrice = unityPrice;
    }

    public void setUnityInStock(int unityInStock) {
        this.unityInStock = unityInStock;
    }

    public void setUnityOnOrder(int unityOnOrder) {
        this.unityOnOrder = unityOnOrder;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void setDiscontinued(int discontinued) {
        this.discontinued = discontinued;
    }
}
