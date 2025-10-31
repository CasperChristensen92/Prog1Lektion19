package opgave01;

import opgave01.model.Swimmer;
import opgave01.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {

    public static void main(String[] args) {

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer swimmerJan = new Swimmer("Jan", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer swimmerBo = new Swimmer("Bo", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer swimmerMikkel = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(swimmerJan);
        swimmers.add(swimmerBo);
        swimmers.add(swimmerMikkel);

        for (Swimmer s : swimmers) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime() + "\n");
        }

        TrainingPlan trainingPlanA = new TrainingPlan('A', 16, 10);
        TrainingPlan trainingPlanB = new TrainingPlan('B', 10, 6);

        swimmerJan.setTrainingPlan(trainingPlanA);
        swimmerBo.setTrainingPlan(trainingPlanA);
        swimmerMikkel.setTrainingPlan(trainingPlanB);

        System.out.println("Nu med træningsplan og træningstid tilføjet" + "\n");
        for (Swimmer s : swimmers) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime() + "\n" +
                    "er på træningsplan " + "\"" + s.getTrainingPlan().getLevel() + "\"" +
                    "med samlet ugentlig træning på " + s.allTrainingHours() + " i alt" + "\n");
        }

    }

}
