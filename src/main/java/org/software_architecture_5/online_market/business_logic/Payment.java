package org.software_architecture_5.online_market.business_logic;

import org.software_architecture_5.online_market.ux_ui.Order;

public class Payment {
    private long numberCard;
    private long balanceCard;
    private Discount discount;
    private Order order;

    public Payment(long numberCard, long balanceCard, Discount discount, Order order) {
        this.numberCard = numberCard;
        this.balanceCard = balanceCard;
        this.discount = discount;
        this.order = order;
    }
    public boolean isValidCard(){
        boolean var = true;
        return var;
    }
    public void isPaidSuccess(){
        if(balanceCard >= order.orderSizeByCost) {
            System.out.printf("Заказ %d успешно оплачен. Поздравляем с покупкой");
        }
    }

}
