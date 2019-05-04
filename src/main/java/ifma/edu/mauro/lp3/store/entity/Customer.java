package ifma.edu.mauro.lp3.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "customers")
public class Customer{
    @Id
    @GeneratedValue
    private char[] customerID;
    private Company company;

    protected Customer(){}

    public Customer(char[] customerID, Company company) {
        this.customerID = customerID;
        this.company = company;
    }

    public char[] getCustomerID() {
        return customerID;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}