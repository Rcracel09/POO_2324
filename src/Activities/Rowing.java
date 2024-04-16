package POO_2324.src.Activities;

import POO_2324.src.User.User;

public class Rowing extends Activity{
    
    private double distance; //In km


    public Rowing(double time, Difficulty difficulty, User user, double distance) {
        super(time, difficulty, user);
        this.distance = distance;
    }

    public Rowing(Rowing rowing) {
        super(rowing);
        this.distance = rowing.distance;
    }

    public Rowing clone() {return new Rowing(this);}

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    
}
