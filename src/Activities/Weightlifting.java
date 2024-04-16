package POO_2324.src.Activities;

import POO_2324.src.User.User;

public class Weightlifting extends Activity{
    
    private int reps;
    private int weight; //In kg


    public Weightlifting(double time, Difficulty difficulty, User user, int reps, int weight) {
        super(time, difficulty, user);
        this.reps = reps;
        this.weight = weight;
    }

    public Weightlifting(Weightlifting weightlifting) {
        super(weightlifting);
        this.reps = weightlifting.reps;
        this.weight = weightlifting.weight;
    }

    public Weightlifting clone() {return new Weightlifting(this);}

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
