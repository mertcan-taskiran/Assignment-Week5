package SigortaYonetimSistemi;

public class Main {
    public static void main(String[] args) throws InvalidAuthenticationException {
        AccountManager accountManager = new AccountManager();

        User user1 = new User("Mertcan", "Taşkıran", "mertcan@gmail.com", "taskiran", "SoftwareEngineer", 25);

        user1.getInsurances().add(new CarInsurance("Car", 50000, 2023,2030));

        AddressManager addressManager = new AddressManager(user1);

        addressManager.addAddress(new HomeAddress("Türkiye", "Ankara", "Mamak", "Kutlu"));

        Account account1 = new IndıvıdualAccount(user1);

        accountManager.getDataList().add(account1);

        accountManager.login("mertcan@gmail.com", "taskiran");

    }
}


