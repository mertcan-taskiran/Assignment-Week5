package SigortaYonetimSistemi;

import java.util.Scanner;

public class Authentication {
    private User user;
    // SUCCESS login işlemi başarılı ise kullanılacaktır. FAIL ise login olmamışsa kullanılacaktır.
    public enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    public Authentication(User user) {
        super();
        this.user = user;
    }

    @SuppressWarnings("resource")
    public AuthenticationStatus login() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Mail Address : ");
        String mail = sc.next();
        System.out.print("Password : ");
        String password = sc.next();

        if (user.getEmail().equals(mail) && user.getPassword().equals(password)) {
            return AuthenticationStatus.SUCCESS;
        } else {
            return AuthenticationStatus.FAIL;
        }
    }
}
