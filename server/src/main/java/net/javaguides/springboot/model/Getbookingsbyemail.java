package net.javaguides.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Getbookingsbyemail {

    @Column(name = "current_date_and_time")
    private String currentdate;

    @Column(name = "username")
    private String username;

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "booking_date")
    private String bookingdate;

    @Column(name = "movie_name")
    private String moviename;

    @Column(name = "movie_watchers")
    private String moviewatchers;

    @Column(name = "total_seats")
    private String totalseats;

    @Column(name = "show_time")
    private String showtime;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "seat_names")
    private String seatnames;

    @Column(name = "total_cost")
    private String totalcost;

    public Getbookingsbyemail() {

    }

    public Getbookingsbyemail( String currentdate, String username, String email, String bookingdate, String moviename, String moviewatchers, String totalseats,String showtime,String mobile,String seatnames,String totalcost) {
        super();
        this.currentdate = currentdate;
        this.username = username;
        this.email = email;
        this.bookingdate = bookingdate;
        this.moviename = moviename;
        this.moviewatchers = moviewatchers;
        this.totalseats = totalseats;
        this.showtime = showtime;
        this.mobile = mobile;
        this.seatnames = seatnames;
        this.totalcost = totalcost;
    }

    public String getCurrentdate() {
        return currentdate;
    }
    public void setCurrentdate(String currentdate) {
        this.currentdate = currentdate;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBookingdate() {
        return bookingdate;
    }
    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }
    public String getMoviename() {
        return moviename;
    }
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
    public String getMoviewatchers() {
        return moviewatchers;
    }
    public void setMoviewatchers(String moviewatchers) {
        this.moviewatchers = moviewatchers;
    }

    public String getTotalseats() {
        return totalseats;
    }
    public void setTotalseats(String totalseats) {
        this.totalseats = totalseats;
    }

    public String getShowtime() {
        return showtime;
    }
    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSeatnames() {
        return seatnames;
    }
    public void setSeatnames(String seatnames) {
        this.seatnames = seatnames;
    }

    public String getTotalcost() {
        return totalcost;
    }
    public void setTotalcost(String totalcost) {
        this.totalcost = totalcost;
    }



}