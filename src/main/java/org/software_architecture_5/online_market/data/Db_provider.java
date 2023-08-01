package org.software_architecture_5.online_market.data;

import org.software_architecture_5.online_market.business_logic.Provider;

import java.text.Format;

public class Db_provider {
//    private int id;
//    private String name;
//    private String category;
//    private int experience;
//    private double rating;
    private Provider provider;

    public Db_provider() {
    }

    public void setProvider(Provider provider) {
        System.out.printf("Поставщик с именем %s создан\n", provider.getName());
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Db_provider{" +
                "provider=" + provider.getName()+
                '}';
    }

    public Provider getProvider() {
        System.out.printf("Данные по поставщику с именем %s выданы:\n", provider.getName());
        System.out.println(provider.toString());

        return provider;
    }
}
