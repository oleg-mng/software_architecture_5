package org.software_architecture_5.online_market.ux_ui;

import java.util.Date;

public class Order {
    private int id;
    public Date date;
    public int orderSizeByCost;
    private boolean inWork = false;

    public Order(int id, Date date, int orderSizeByCost, boolean inWork) {
        this.id = id;
        this.date = date;
        this.orderSizeByCost = orderSizeByCost;
        this.inWork = inWork;
    }

    public boolean orderInWork(int id) {
        System.out.printf("Статус заказа inWork: %b\n", inWork);
        return inWork;
    }
    protected boolean orderCancelled(int id) {
        return inWork;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", orderSizeByCost=" + orderSizeByCost +
                ", inWork=" + inWork +
                '}';
    }
}
