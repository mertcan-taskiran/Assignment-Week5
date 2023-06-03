package SigortaYonetimSistemi;

import java.time.LocalDate;

public class TravelInsurance extends Insurance{

    public TravelInsurance(String name, double price, int startDate, int endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public double calculate() {
        // Burada seyahat sigortası ücretinin hesaplanması işlemleri yapılır
        // Hesaplanan ücret döndürülür
        return getPrice() * 1.15; // Örnek hesaplama: Sigorta ücretine %15 kar marjı eklendi
    }
}
