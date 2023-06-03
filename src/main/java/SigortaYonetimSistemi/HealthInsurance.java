package SigortaYonetimSistemi;

import java.time.LocalDate;

public class HealthInsurance extends Insurance{

    public HealthInsurance(String name, double price, int startDate, int endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Burada sağlık sigortası ücretinin hesaplanması işlemleri yapılır
        // Hesaplanan ücret döndürülür
        return getPrice() * 1.2; // Örnek hesaplama: Sigorta ücretine %20 kar marjı eklendi
    }
}
