package ProductList;

import java.util.ArrayList;

public class Market {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();

        Product product1 = new Product("Coca-Cola", 10.0);
        Product product2 = new Product("Café", 31.10);
        Product product3 = new Product("Leite", 5.03);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        System.out.println(productList.size());
        System.out.println("Total de produtos " + productList.toString());

        Product expensiveProduct = productList.get(0);

        for (Product product : productList) {
            if (product.getPreco() > expensiveProduct.getPreco()) {
                expensiveProduct = product;
            }
        }
        System.out.println("Produto mais caro: " + expensiveProduct);
    }


}
