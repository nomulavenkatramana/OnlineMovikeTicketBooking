package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theaters")
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "theater_name")
    private String theaterName;

    @Column(name = "theater_location")
    private String theaterLocation;

    @Column(name = "total_seats")
    private String totalSeats;

    @Column(name = "theater_id")
    private String theaterId;



    public Theater() {

    }

    public Theater(String theaterName, String theaterLocation, String totalSeats, String theaterId) {
        super();
        this.theaterName = theaterName;
        this.theaterLocation = theaterLocation;
        this.totalSeats = totalSeats;
        this.theaterId = theaterId;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTheaterName() {
        return theaterName;
    }
    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
    public String getTheaterLocation() {
        return theaterLocation;
    }
    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }
    public String getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(String totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getTheaterId() {
        return theaterId;
    }
    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

}
