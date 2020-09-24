package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private static ArrayList<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void createProduct(Product product) throws ProductAlreadyExists, ProductNotValid {
        for (Product prod : products) {
            if (prod.getName().equals(product.getName())) {
                throw new ProductAlreadyExists("Product already exists");
            }
        }
        if (product.getName().equals("")) {
            throw new ProductNotValid("Name not valid");
        }
        products.add(product);
    }

    public void updateProduct(Product product) throws ProductNotFound, ProductNotValid {
        for (Product prod : products) {
            if (prod.getId() == product.getId()) {
                if (product.getName().equals("")) {
                    throw new ProductNotValid("Name not valid");
                } else {
                    prod.setName(product.getName());

                }
                return;
            }
        }
        throw new ProductNotFound("Id not found");
    }


    public void deleteProduct(long id){
        for(Product prod : products){
            if(id == prod.getId()) {
                products.remove(prod);
                return;
            }

        }
        throw new ProductNotFound("Id not found");
    }

}



