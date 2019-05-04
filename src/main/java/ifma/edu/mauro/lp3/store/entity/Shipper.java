package ifma.edu.mauro.lp3.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "shippers")
public class Shipper {
    @Id
    @GeneratedValue
    private int shipperID;
    private Company company;

    public Shipper(int shipperID, Company company) {
        this.shipperID = shipperID;
        this.company = company;
    }

    public int getShipperID() {
        return shipperID;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
