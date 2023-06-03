package SigortaYonetimSistemi;

public class CarInsurance extends Insurance{

    public CarInsurance(String name, double price, int startDate, int endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Burada otomobil sigortası ücretinin hesaplanması işlemleri yapılır
        // Hesaplanan ücret döndürülür
        return getPrice() * 1.25; // Örnek hesaplama: Sigorta ücretine %25 kar marjı eklendi
    }
}
