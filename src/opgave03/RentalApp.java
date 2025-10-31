package opgave03;

import opgave03.model.Car;
import opgave03.model.Rental;

public class RentalApp {
    public static void main(String[] args) {
        Car car1 = new Car("AB123",2025);
        car1.setPricePerDay(500);
        Car car2 = new Car("AB234",2023);
        car2.setPricePerDay(450);
        Car car3 = new Car("AB345",2022);
        car3.setPricePerDay(700);
        Car car4 = new Car("AB456",2023);
        car4.setPricePerDay(600);
        Car car5 = new Car("AB567",2022);
        car5.setPricePerDay(700);

        Rental rental1 = new Rental(1,4,"8.oktober 2025");
        rental1.addCar(car1);
        rental1.addCar(car3);
        rental1.addCar(car4);

        Rental rental2 = new Rental(2,6,"6. september 2025");
        rental2.addCar(car2);
        rental2.addCar(car3);
        rental2.addCar(car4);
        rental2.addCar(car5);

        System.out.println(rental1.getPrice());
        System.out.println(rental2.getPrice());
    }
}
