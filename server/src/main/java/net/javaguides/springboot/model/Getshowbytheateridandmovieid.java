package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shows")
public class Getshowbytheateridandmovieid {

    @Id
    @Column(name = "theater_id")
    private String theaterId;


    @Column(name = "movie_id")
    private String movieId;

    @Column(name = "show_time")
    private String showTime;

    @Column(name = "seats_available")
    private String seatsAvailable;



    public Getshowbytheateridandmovieid() {

    }

    public Getshowbytheateridandmovieid(String theaterId, String movieId, String showTime, String seatsAvailable) {
        super();
        this.theaterId = theaterId;
        this.movieId = movieId;
        this.showTime = showTime;
        this.seatsAvailable = seatsAvailable;
    }

    public String getTheaterId() {
        return theaterId;
    }
    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }
    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getShowTime() {
        return showTime;
    }
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getSeatsAvailable() {
        return seatsAvailable;
    }
    public void setSeatsAvailable(String seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

}
