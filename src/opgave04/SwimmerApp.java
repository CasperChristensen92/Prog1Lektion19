package opgave04;

import opgave04.model.Swimmer;
import opgave04.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {
    public static void main(String[] args) {
        ArrayList<Double> lapTimes1 = new ArrayList<>();
        lapTimes1.add(1.02);
        lapTimes1.add(1.01);
        lapTimes1.add(0.99);
        lapTimes1.add(0.98);
        lapTimes1.add(1.02);
        lapTimes1.add(1.04);
        lapTimes1.add(0.99);

        ArrayList<Double> lapTimes2 = new ArrayList<>();
        lapTimes2.add(1.05);
        lapTimes2.add(1.01);
        lapTimes2.add(1.04);
        lapTimes2.add(1.06);
        lapTimes2.add(1.08);
        lapTimes2.add(1.04);
        lapTimes2.add(1.02);

        ArrayList<Double> lapTimes3 = new ArrayList<>();
        lapTimes3.add(1.03);
        lapTimes3.add(1.01);
        lapTimes3.add(1.02);
        lapTimes3.add(1.05);
        lapTimes3.add(1.03);
        lapTimes3.add(1.06);
        lapTimes3.add(1.03);

        ArrayList<Swimmer> swimmers1 = new ArrayList<>();
        swimmers1.add(new Swimmer("Mikkel", 1993, lapTimes3, "AIA-Tranbjerg"));
        swimmers1.add(new Swimmer("Bo", 1995, lapTimes2, "Lyseng"));
        swimmers1.add(new Swimmer("Jan", 1994, lapTimes1, "AGF"));

        for (Swimmer s : swimmers1) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }
        TrainingPlan trainingPlanA = new TrainingPlan('A', 16, 10);

        trainingPlanA.setSwimmers(swimmers1);

        System.out.println("\n" + "Swimmers in trainingplan A and info: ");
        for (Swimmer s : trainingPlanA.getSwimmers()){
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }

        trainingPlanA.removeSwimmer("Bo");
        System.out.println("\n" + "Swimmers in trainingplan A, after Bo is removed, and info: ");
        for (Swimmer s : trainingPlanA.getSwimmers()){
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }
    }
}
