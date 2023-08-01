package org.software_architecture_5.online_market.ux_ui;

import java.util.Date;

public class User implements iUser, Search{
    private int id;
    protected String name;
    private String email;
    protected String password;
    protected int discount;
    private String typeOfClient;
    private Date dateOfRegistration;
    private Order order;
    private double activity;

    public User(int id, String name, String email, String password, int discount,
                String typeOfClient, Date dateOfRegistration, Order order, double activity) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.discount = discount;
        this.typeOfClient = typeOfClient;
        this.dateOfRegistration = dateOfRegistration;
        this.order = order;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String findUser(User user, String name) {
        System.out.printf("Клиент с именем %s и email: %s успешно найден", user.getName(), user.email);
        
        return user.email;

    }
}
