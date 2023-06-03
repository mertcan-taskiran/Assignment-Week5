package SigortaYonetimSistemi;

import java.time.LocalDate;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String name, double price, int startDate, int endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Burada konut sigortası ücretinin hesaplanması işlemleri yapılır
        // Hesaplanan ücret döndürülür
        return getPrice() * 1.1; // Örnek hesaplama: Sigorta ücretine %10 kar marjı eklendi
    }
}
