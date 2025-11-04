package opgave02;

import opgave02.model.Swimmer;
import opgave02.model.TrainingPlan;

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

        lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.97);
        Swimmer swimmerJanni = new Swimmer("Janni", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.00);
        Swimmer swimmerBell = new Swimmer("Bell", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.08);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer swimmerMichele = new Swimmer("Michele", 1993, lapTimes, "AIA-Tranbjerg");

        ArrayList<Swimmer> swimmers1 = new ArrayList<>();
        swimmers1.add(swimmerJan);
        swimmers1.add(swimmerBo);
        swimmers1.add(swimmerMikkel);

        ArrayList<Swimmer> swimmers2 = new ArrayList<>();
        swimmers2.add(swimmerJanni);
        swimmers2.add(swimmerBell);
        swimmers2.add(swimmerMichele);

        for (Swimmer s : swimmers1) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }
        for (Swimmer s : swimmers2) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }

        TrainingPlan trainingPlanA = new TrainingPlan('A', 16, 10);
        TrainingPlan trainingPlanB = new TrainingPlan('B', 10, 6);

        trainingPlanA.setSwimmers(swimmers1);
        trainingPlanB.setSwimmers(swimmers2);

        System.out.println("\n" + "Swimmers in trainingplan A and info: ");
        for (Swimmer s : trainingPlanA.getSwimmers()){
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }
        System.out.println("\n" + "Swimmers in trainingplan B and info: ");
        for (Swimmer s : trainingPlanB.getSwimmers()){
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }
    }
}
