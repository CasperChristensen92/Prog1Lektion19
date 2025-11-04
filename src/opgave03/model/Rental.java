package opgave03.model;

import java.util.ArrayList;

//Hvad betyder det at multipliciteten er 0..* i begge retninger?
//Når der er multiplicitet 0..* i begge ender betyder det at der er en mange til mange relation
//I dette tilfælde er pilen fra rental Rental mod Car så et rental objekt kan indeholde mange biler.
//Der er også en mange relation den anden vej så bilerne er ikke låst til kun én udlegning
public class Rental {
    int number;
    int days;
    String date;
    ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
    }

    public double getPrice(){
        double price = 0;
        for (Car car : cars){
            price += car.getPricePerDay()*days;
        }
        return price;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void addCar(Car car){
        cars.add(car);
    }
}
