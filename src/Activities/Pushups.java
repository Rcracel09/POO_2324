package POO_2324.src.Activities;

import POO_2324.src.User.User;

public class Pushups extends Activity{

    private int reps;


    public Pushups(double time, Difficulty difficulty, User user, int reps) {
        super(time, difficulty, user);
        this.reps = reps;
    }

    public Pushups(Pushups pushups) {
        super(pushups);
        this.reps = pushups.reps;
    }
    
    public Pushups clone() {return new Pushups(this);}

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

}
