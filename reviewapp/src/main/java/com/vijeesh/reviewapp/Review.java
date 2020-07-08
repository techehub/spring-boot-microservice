package com.vijeesh.reviewapp;

public class Review {
    String message;
    int rate;
    int likes;
    int dislikes;

    public Review(String message, int rate, int likes, int dislikes) {
        this.message = message;
        this.rate = rate;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}
