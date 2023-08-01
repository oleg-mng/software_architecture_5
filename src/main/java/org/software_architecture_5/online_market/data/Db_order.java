package org.software_architecture_5.online_market.data;

import org.software_architecture_5.online_market.ux_ui.Order;

import java.util.Date;

public class Db_order {
    private Order order;

    public Db_order(Order order) {
        this.order = order;
    }

    public void setOrder(Order order) {
        this.order = order;
        System.out.printf("Заказ с номером %d создан\n", order.getId());
    }

    public Order getOrder() {
        System.out.printf("Данные по заказу с номером %d выданы:\n", order.getId());
        System.out.println(order.toString());
        return order;
    }

    public boolean isPay() {
        boolean st = false;
        if (order.date != null) {
            st = true;
            System.out.printf("Статус оплаты заказа: %b\n", st);
            return st;
        }
        else {
            System.out.printf("Статус оплаты заказа: %b", st);
            return false;
        }
    }
}
