package net.javaguides.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile")
    private String mobile;

    public User() {

    }

    public User(String name, String dateOfBirth, String gender, String email, String password, String address, String mobile) {
        super();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.address = address;
        this.mobile = mobile;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String name() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String dateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String gender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String email() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String password() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String address() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String mobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
