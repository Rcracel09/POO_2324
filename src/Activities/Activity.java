package POO_2324.src.Activities;

import POO_2324.src.User.User;


public class Activity {

    private double time;
    public enum Difficulty {
        NORMAL,
        HARD
    }
    private Difficulty difficulty;
    private User user;


    public Activity(double time, Difficulty difficulty, User user) {
        this.time = time;
        this.difficulty = difficulty;
        this.user = user;
    }

    public Activity(Activity activities) {
        this.time = activities.time;
        this.difficulty = activities.difficulty;
        this.user = activities.user;
    }

    public Activity clone() {return new Activity(this);}


    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public Difficulty getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}