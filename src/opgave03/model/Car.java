package opgave03.model;

public class Car {
    String license;
    double pricePerDay;
    int purchaseYear;

    public Car(String license, int purchaseYear) {
        this.license = license;
        this.purchaseYear = purchaseYear;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }
}
