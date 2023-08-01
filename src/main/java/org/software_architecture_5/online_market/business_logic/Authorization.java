package org.software_architecture_5.online_market.business_logic;

import org.software_architecture_5.online_market.ux_ui.User;

public class Authorization {
    private User user;
    private String password;

    public Authorization(User user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean isUserValid() {
        if (password == this.password) {
            System.out.printf("Клиент с именем %s успешно прошел авторизацию\n", user.getName());
            return true;
        }
        return false;
    }
}
