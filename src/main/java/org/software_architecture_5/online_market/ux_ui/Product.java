package org.software_architecture_5.online_market.ux_ui;

import org.software_architecture_5.online_market.business_logic.Provider;

import java.util.Date;

public class Product extends Content implements iProduct{
    private String nameP;
//    private Content content;
    private String category;
    private double cost;
    private double rating;
    private Date deliveryTime;
    private Provider provider;
    private Review review;

    public Product(String description, String feature, String parameters,
                   String nameP, String category, double cost, double rating,
                   Date deliveryTime, Provider provider, Review review) {
        super(description, feature, parameters);
        this.nameP = nameP;
//        this.content = content;
        this.category = category;
        this.cost = cost;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
        this.provider = provider;
        this.review = review;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameP='" + nameP + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                ", deliveryTime=" + deliveryTime +
                ", provider=" + provider +
                ", review=" + review +
                '}';
    }

    public String getNameP() {
        return nameP;
    }
}
