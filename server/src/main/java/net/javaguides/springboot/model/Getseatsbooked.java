package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookedseats")
public class Getseatsbooked {

    @Id
    @Column(name = "movie_name")
    private String moviename;

    @Column(name = "theater_name")
    private String theatername;

    @Column(name = "show_time")
    private String showtime;

    @Column(name = "booking_date")
    private String bookingdate;

    @Column(name = "seat_names")
    private String seatnames;



    public Getseatsbooked() {

    }

    public Getseatsbooked(String moviename, String theatername, String showtime, String bookingdate, String seatnames) {
        super();
        this.moviename = moviename;
        this.theatername = theatername;
        this.showtime = showtime;
        this.bookingdate = bookingdate;
        this.seatnames = seatnames;
    }

    public String getMoviename() {
        return moviename;
    }
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
    public String getTheatername() {
        return theatername;
    }
    public void setTheatername(String theatername) {
        this.theatername = theatername;
    }
    public String getShowtime() {
        return showtime;
    }
    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public String getBookingdate() {
        return bookingdate;
    }
    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    public String getSeatnames() {
        return seatnames;
    }
    public void setSeatnames(String seatnames) {
        this.seatnames = seatnames;
    }

}
