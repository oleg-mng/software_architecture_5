package org.software_architecture_5.online_market.business_logic;

import org.software_architecture_5.online_market.ux_ui.Product;

public class Provider {
    private int id;
    private String name;
    private String category;
    private int experience;
    private double rating;
//    private Product[] product;
//    public Provider() {
//        this.id = 7;
//        this.name = "vitra";
//        this.category = "furniture";
//        this.experience = 30;
//        this.rating = 5.0;
//
////        this.product = new Product[]{new Product()};
//    }


    public Provider(int id, String name, String category, int experience, double rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.experience = experience;
        this.rating = rating;
//        this.product = product;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", experience=" + experience +
                ", rating=" + rating +
                '}';
    }
}
