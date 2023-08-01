package org.software_architecture_5.online_market.data;

import org.software_architecture_5.online_market.business_logic.Provider;
import org.software_architecture_5.online_market.ux_ui.Product;

public class Db_product {
    private Product product;

    public Db_product(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        System.out.printf("Товар с именем %s создан\n", product.getNameP());
        this.product = product;
    }

    public Product getProduct() {
        System.out.printf("Данные по товару с именем %s выданы:\n", product.getNameP());
        System.out.println(product.toString());

        return product;
    }
}
