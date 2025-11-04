package opgave02.model;

import java.util.ArrayList;

public class TrainingPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;
    private ArrayList<Swimmer> swimmers;

    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public void addSwimmer(Swimmer swimmer){
        swimmers.add(swimmer);
    }

    public void setSwimmers(ArrayList<Swimmer> swimmers){
        this.swimmers = swimmers;
    }

    public ArrayList<Swimmer> getSwimmers() {
        return swimmers;
    }
}
