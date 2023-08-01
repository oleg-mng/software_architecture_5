package org.software_architecture_5.online_market.business_logic;

import org.software_architecture_5.online_market.ux_ui.User;

public class Discount {
    private User user;
private int level;
private int discount;

    public Discount(User user, int level, int discount) {
        this.user = user;
        this.level = level;
        this.discount = discount;
    }
}
