package ifma.edu.mauro.lp3.store.entity;

import com.mysql.cj.jdbc.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name = "employees")
public class Employee {
    @Id
    @GeneratedValue
    private int employeeID;
    private String lastName;
    private String firstName;
    private String title;
    private Date birthDate;
    private Date hireDate;
    private Address address;
    private String homePhone;
    private String extension;
    private Blob photo;
    private String notes;
    private int reportsTo;
    private String photoPath;

    protected Employee(){}

    public Employee(int employeeID, String lastName, String firstName, String title, Date birthDate, Date hireDate, Address address, String homePhone, String extension, Blob photo, String notes, int reportsTo, String photoPath) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
        this.photoPath = photoPath;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Address getAddress() {
        return address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public Blob getPhoto() {
        return photo;
    }

    public String getNotes() {
        return notes;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
