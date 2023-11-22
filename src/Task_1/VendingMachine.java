package Task_1;

import Task_1.Product;

import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productList);
    public Product getProduct(String name);
}
