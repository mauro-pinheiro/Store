package ifma.edu.mauro.lp3.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue
    private int supplierID;
    private Company company;
    private String homePage;

    protected Supplier(){}

    public Supplier(int supplierID, Company company, String homePage) {
        this.supplierID = supplierID;
        this.company = company;
        this.homePage = homePage;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public Company getCompany() {
        return company;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }
}
