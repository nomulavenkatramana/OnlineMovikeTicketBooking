package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "language")
    private String movieLanguage;

    @Column(name = "duration")
    private String movieDuration;

    @Column(name = "movie_id")
    private String movieId;

    @Column(name = "ticket_cost")
    private String ticketCost;

    @Column(name = "theater_name")
    private String theaterName;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;



    public Movie() {

    }

    public Movie(String movieName, String movieLanguage, String movieDuration, String movieId, String ticketCost, String theaterName, String startDate, String endDate) {
        super();
        this.movieName = movieName;
        this.movieLanguage = movieLanguage;
        this.movieDuration = movieDuration;
        this.movieId = movieId;
        this.ticketCost = ticketCost;
        this.theaterName = theaterName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieLanguage() {
        return movieLanguage;
    }
    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }
    public String getMovieDuration() {
        return movieDuration;
    }
    public void setMovieDuration(String movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTicketCost() {
        return ticketCost;
    }
    public void setTicketCost(String ticketCost) {
        this.ticketCost = ticketCost;
    }

    public String getTheaterName() {
        return theaterName;
    }
    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
