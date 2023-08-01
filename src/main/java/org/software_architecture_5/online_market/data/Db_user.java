package org.software_architecture_5.online_market.data;

import org.software_architecture_5.online_market.business_logic.Discount;
import org.software_architecture_5.online_market.ux_ui.User;

public class Db_user {
    private User user;

    private int discount;
    private String name;

    public Db_user(User user, int discount) {
        this.user = user;
        this.discount = discount;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        System.out.printf("Актуальная скидка на данный момент для клиента %s: %d\n", user.getName(), this.discount);
        return discount;
    }
}
