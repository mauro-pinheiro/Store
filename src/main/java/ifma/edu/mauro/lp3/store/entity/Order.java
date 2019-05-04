package ifma.edu.mauro.lp3.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name = "orders")
public class Order{
    @Id
    @GeneratedValue
    private int orderID;
    private Customer customer;
    private Employee employee;
    private Date orderDate;
    private Date RequiredDate;
    private Date ShippedDate;
    private Shipper shipVia;
    private double freight;
    private Address shipAddress;

    protected Order(){}

    public Order(int orderID, Customer customer, Employee employee, Date orderDate, Date requiredDate, Date shippedDate, Shipper shipVia, double freight, Address shipAddress) {
        this.orderID = orderID;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        RequiredDate = requiredDate;
        ShippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipAddress = shipAddress;
    }

    public int getOrderId() {
        return orderID;
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getRequiredDate() {
        return RequiredDate;
    }

    public Date getShippedDate() {
        return ShippedDate;
    }

    public Shipper getShipVia() {
        return shipVia;
    }

    public double getFreight() {
        return freight;
    }

    public Address getShipAddress() {
        return shipAddress;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setRequiredDate(Date requiredDate) {
        RequiredDate = requiredDate;
    }

    public void setShippedDate(Date shippedDate) {
        ShippedDate = shippedDate;
    }

    public void setShipVia(Shipper shipVia) {
        this.shipVia = shipVia;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public void setShipAddress(Address shipAddress) {
        this.shipAddress = shipAddress;
    }
}