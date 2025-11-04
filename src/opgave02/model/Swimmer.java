package opgave02.model;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private String club;
    private int yearGroup;
    private ArrayList<Double> lapTimes;

    public Swimmer(String name, int yearGroup, ArrayList<Double> lapTimes, String club) {
        this.name = name;
        this.yearGroup = yearGroup;
        this.lapTimes = lapTimes;
        this.club = club;
    }

    public double bestLapTime() {
        double best = Double.MAX_VALUE;
        for (double time: lapTimes) {
            if(best > time) {
                best = time;
            }
        }
        return best;
    }

    public String getName() {
        return name;
    }
}


