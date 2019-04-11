package com.sandeepa.listclasses;

public class ViewEmployeeProfile {

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getRatingemployeeavg() {
        return ratingemployeeavg;
    }

    public void setRatingemployeeavg(int ratingemployeeavg) {
        this.ratingemployeeavg = ratingemployeeavg;
    }

    private String firstname;
    private String lastname;
    private int ratingemployeeavg;
}
