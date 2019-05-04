package ifma.edu.mauro.lp3.store.entity;

public class OrderDetail {
    private Order order;
    private Product product;
    private float unityPrice;
    private int quantity;
    private float descont;

    public OrderDetail(Order order, Product product, float unityPrice, int quantity, float descont) {
        this.order = order;
        this.product = product;
        this.unityPrice = unityPrice;
        this.quantity = quantity;
        this.descont = descont;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(float unityPrice) {
        this.unityPrice = unityPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDescont() {
        return descont;
    }

    public void setDescont(float descont) {
        this.descont = descont;
    }
}
