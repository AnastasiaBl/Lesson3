package Lesson3;

public class Main {
    public static void main(String[] args) throws ProductNotValid {
        Product prod = new Product(13718, "oatmeal", "cereal", "20.09.20");
        ProductCatalog catalog = new ProductCatalog();
        Product produ = new Product(137189, "buckwheat", "cereal", "20.09.20");
        Product p = new Product(2983298, "apple", "fruits", "21.09.20");
        Product pr = new Product(8348, "pear ", "fruits", "21.09.20");
        try {
            catalog.createProduct(prod);
            catalog.createProduct(produ);
            catalog.createProduct(p);
            catalog.createProduct(pr);
        } catch (ProductAlreadyExists productAlreadyExists) {
            productAlreadyExists.printStackTrace();
        }
        Product pr1 = new Product(13718,"banana","fruits","21.09.20");
        Product pr2 = new Product(8348,"","fruits","21.09.20");
        try {
            catalog.updateProduct(pr2);
        } catch (ProductNotValid productNotValid) {
            productNotValid.printStackTrace();
        }
        catalog.updateProduct(pr1);
        catalog.deleteProduct(2983298);
        System.out.println(catalog.getAllProducts());



    }
}
