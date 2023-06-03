package SigortaYonetimSistemi;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class AccountManager {
    private Set<Account> dataList = new TreeSet<>(new Comparator<Account>() {

        @Override
        public int compare(Account o1, Account o2) {
            return o1.getUser().getName().compareTo(o2.getUser().getName());
        }
    });

    public Set<Account> getDataList() {
        return dataList;
    }

    public void setDataList(Set<Account> dataList) {
        this.dataList = dataList;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {

        for (Account account : dataList) {

            Authentication control = new Authentication(account.getUser());

            if (account.getUser().getPassword().equals(password) && account.getUser().getEmail().equals(email)) {

                if ((control.login() == Authentication.AuthenticationStatus.FAIL)) {
                    throw new InvalidAuthenticationException("Geçersiz !");
                } else {
                    account.showUserInfo();
                }
            }

        }
    }
}
