package SigortaYonetimSistemi;

import java.util.ArrayList;

public class AddressManager {
    private static User user;

    public AddressManager(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Bu sınıfın içinde "User" nesnesinin adres listesine eleman ekleme-çıkarma yapabilen iki tane static fonksiyon.

    public static void addAddress(Address address) {
        ArrayList<Address> addresses = (ArrayList<Address>) user.getAddressList();
        addresses.add(address);
    }

    public static void removeAddress(User user, Address address) {
        ArrayList<Address> addresses = (ArrayList<Address>) user.getAddressList();
        addresses.remove(address);
    }
}
