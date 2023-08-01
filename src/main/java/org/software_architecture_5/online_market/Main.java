package org.software_architecture_5.online_market;

import org.software_architecture_5.online_market.business_logic.Authorization;
import org.software_architecture_5.online_market.business_logic.Discount;
import org.software_architecture_5.online_market.business_logic.Provider;
import org.software_architecture_5.online_market.data.Db_order;
import org.software_architecture_5.online_market.data.Db_product;
import org.software_architecture_5.online_market.data.Db_provider;
import org.software_architecture_5.online_market.data.Db_user;
import org.software_architecture_5.online_market.ux_ui.*;

import java.util.Date;

/**
 * реализация работы5 согласно разработанной UML-диаграммы
 * онлайн магазин
 * дата 01.08.2023
 * version 00.00.01
 * @author oleg-mng
 */

public class Main {
    public static void main(String[] args) {
        Provider provider1 = new Provider(1, "mir_instrumenta", "outdoor", 10,4.99);
        Provider provider2 = new Provider(2,"ozon", "village", 4, 4.8);

        Product product1 = new Product("easy", "imprisoned", "1kg","axe",
                "outdoor", 970, 4.35, new Date(2023, 07, 30), provider1,
                new Review(1, "perfect", 5));
        System.out.println(product1.getNameP());

        Db_provider dbProvider = new Db_provider();
        dbProvider.setProvider(provider1);
        dbProvider.getProvider().toString();

        Db_product dbProduct = new Db_product(product1);
        dbProduct.setProduct(product1);
        dbProduct.getProduct();

        Order order1 = new Order(7, new Date(2023, 7, 28), 399, true);
        Db_order dbOrder = new Db_order(order1);
        dbOrder.setOrder(order1);
        dbOrder.getOrder();
        order1.orderInWork(order1.getId());
        dbOrder.isPay();

        User user1 = new User(1, "first_user", "first@gmail.com", "777", 15,
                "private person", new Date(2022, 07, 01), order1, 4.77);
        Db_user dbUser = new Db_user(user1, 30);
        dbUser.setDiscount(40);
        dbUser.getDiscount();

        Authorization authorization = new Authorization(user1, "777");
        authorization.isUserValid();
        user1.findUser(user1, "first_user");

    }
}