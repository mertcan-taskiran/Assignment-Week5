package SigortaYonetimSistemi;

public abstract class Insurance {
    private String name;
    private double price;
    private int startDate;
    private int endDate;

    public abstract double calculate();

    public Insurance(String name, double price, int startDate, int endDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }
}
