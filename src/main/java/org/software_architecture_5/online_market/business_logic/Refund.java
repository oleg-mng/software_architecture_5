package org.software_architecture_5.online_market.business_logic;

import java.util.Date;

public class Refund {
    private int id;
    private Date date;
    private int orderSizeByCost;
    boolean refund;

    public Refund(int id, Date date, int orderSizeByCost) {
        this.id = id;
        this.date = date;
        this.orderSizeByCost = orderSizeByCost;
    }

    public boolean  isOrderRefund(int id) {
        return refund;
    }
}
